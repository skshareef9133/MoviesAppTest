package MoviesAppPages.LogoutPage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.LogoutPage.pages.AccountUIPage;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

public class LogOutTest {
    WebDriver driver;
    AccountUIPage accountUIPage;
    LoginPagefunctionality loginPagefunctionality;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/");
        accountUIPage = new AccountUIPage(driver);
        loginPagefunctionality = new LoginPagefunctionality(driver);
    }
    @Test
    public void AccountUITest(){
        loginPagefunctionality.validcredentials();
        accountUIPage.accountUI();
    }
    @Test
    public void LogOutTest(){
        loginPagefunctionality.validcredentials();
        accountUIPage.Logout();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
