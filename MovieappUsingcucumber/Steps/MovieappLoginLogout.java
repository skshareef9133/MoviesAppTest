package MoviesAppPages.MovieappUsingcucumber.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;
import MoviesAppPages.LogoutPage.pages.AccountUIPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MovieappLoginLogout {
    WebDriver driver;
    WebDriverWait wait;
    LoginPagefunctionality loginPagefunctionality;
    AccountUIPage accountUIPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        loginPagefunctionality = new LoginPagefunctionality(driver);
        accountUIPage = new AccountUIPage(driver);
    }

    @Given("I am on the Movies app login Page")
    public void iAmOnTheMoviesappLoginpage(){
        driver.get("https://qamoviesapp.ccbp.tech/login");
    }
    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String uname, String pword){
        loginPagefunctionality.enterusername(uname);
        loginPagefunctionality.enterpassword(pword);
    }
    @And("I click on the login button")
    public void iClickOnTheLoginButton(){
        loginPagefunctionality.clickloginbtn();
    }
    @Then("I should be redirected to the home page")
    public void iShouldBeRedirectedToTheHomePage(){
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
        String Expectedurl = "https://qamoviesapp.ccbp.tech/";
        String Currenturl = driver.getCurrentUrl();
        Assert.assertEquals(Expectedurl,Currenturl, "URLs do not match");
    }
    @When("I click on the account logo")
    public void iClickOnTheAccountLogo(){
        accountUIPage.ClickaccountLogo();
    }
    @And("I click on the logout button")
    public void iClickOnTheLogoutButton(){
        accountUIPage.clickLogout();
    }
    @Then("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage(){
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/login"));
        String Expectedurl = "https://qamoviesapp.ccbp.tech/login";
        String Currenturl = driver.getCurrentUrl();
        Assert.assertEquals(Expectedurl,Currenturl, "URLs do not match");
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
