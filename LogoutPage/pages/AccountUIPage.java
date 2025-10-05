package MoviesAppPages.LogoutPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import MoviesAppPages.MovieDetails.pages.NoTimeToDieMoviePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AccountUIPage {
    WebDriver driver;
    WebDriverWait wait;
    NoTimeToDieMoviePage noTimeToDieMoviePage;

    By clickaccountlogo = By.className("avatar-img");
    @FindBy(how = How.CLASS_NAME, using = "account-heading")
    WebElement accountheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='membership-heading'])[1]")
    WebElement membershipheading;
    @FindBy(how = How.CLASS_NAME, using = "membership-username")
    WebElement membershipusername;
    @FindBy(how = How.CLASS_NAME, using = "membership-password")
    WebElement membershippassword;
    @FindBy(how = How.XPATH, using = "(//p[@class='membership-heading'])[2]")
    WebElement plandetailsheading;
    @FindBy(how = How.CLASS_NAME, using = "plan-paragraph")
    WebElement planparagraph;
    @FindBy(how = How.CLASS_NAME, using = "plan-details")
    WebElement plandetails;
    @FindBy(how = How.CLASS_NAME, using = "logout-button")
    WebElement logoutbtn;
    @FindBy(how = How.CLASS_NAME, using = "contact-us-paragraph")
    WebElement contactus;

    public AccountUIPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }
    public void accountUI(){
        noTimeToDieMoviePage = new NoTimeToDieMoviePage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickaccountlogo)).click();
        noTimeToDieMoviePage.Logopart();
        boolean accounthead = accountheading.isDisplayed();
        System.out.println(accountheading.getText() + " isDisplayed: " + accounthead);
        boolean membershiphead = membershipheading.isDisplayed();
        System.out.println(membershipheading.getText() + " isDisplayed: " + membershiphead);
        boolean username = membershipusername.isDisplayed();
        System.out.println(membershipusername.getText() + " isDisplayed: " + username);
        boolean password = membershippassword.isDisplayed();
        System.out.println(membershippassword.getText() + " isDisplayed: " + password);
        boolean planDetails = plandetailsheading.isDisplayed();
        System.out.println(plandetailsheading.getText() + " isDisplayed: " + planDetails);
        boolean planParagraph = planparagraph.isDisplayed();
        System.out.println(planparagraph.getText() + " isDisplayed: " + planParagraph);
        boolean details = plandetails.isDisplayed();
        System.out.println(plandetails.getText() + " isDisplayed: " + details);
        boolean logout = logoutbtn.isDisplayed();
        System.out.println(logoutbtn.getText() + " isDisplayed: " + logout);
        boolean Contactus = contactus.isDisplayed();
        System.out.println(contactus.getText() + " isDisplayed: " + Contactus);
    }
    public void Logout(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickaccountlogo)).click();
        logoutbtn.click();
        String expectedurl = "https://qamoviesapp.ccbp.tech/login";
        String currenturl = driver.getCurrentUrl();
        Assert.assertEquals(expectedurl,currenturl, "URLs do not match");
        System.out.println("Successfully LogOut");
    }
    public void ClickaccountLogo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickaccountlogo)).click();
    }
    public void clickLogout(){
        logoutbtn.click();
        System.out.println("Successfully Logout");
    }
}
