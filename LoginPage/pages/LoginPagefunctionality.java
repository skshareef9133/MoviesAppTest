package MoviesAppPages.LoginPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPagefunctionality {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(how = How.ID, using = "usernameInput")
    WebElement usernameEl;
    @FindBy(how = How.ID, using = "passwordInput")
    WebElement passwordEl;
    @FindBy(how = How.CLASS_NAME, using = "login-button")
    WebElement clickloginbtn;

    By emptyinputs = By.className("error-message");
    By emptyusername = By.className("error-message");
    By emptypassword = By.className("error-message");
    By invalidcredentials = By.className("error-message");

    public LoginPagefunctionality(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    public void emptyInputs(){
        clickloginbtn.click();
        boolean error1 = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyinputs)).isDisplayed();
        System.out.println("EmptyInputs: " + error1);
        String errormsg1 = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyinputs)).getText();
        System.out.println("ErrorMsg: " + errormsg1);
    }
    public void emptyUsername(){
        passwordEl.sendKeys("rahul@2021");
        clickloginbtn.click();
        boolean error2 = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyusername)).isDisplayed();
        System.out.println("Emptyusername: " + error2);
        String errormsg2 = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyusername)).getText();
        System.out.println("ErrorMsg: " + errormsg2);
    }
    public void emptyPassword(){
        usernameEl.sendKeys("rahul");
        clickloginbtn.click();
        boolean error3 = wait.until(ExpectedConditions.visibilityOfElementLocated(emptypassword)).isDisplayed();
        System.out.println("Emptypassword: " + error3);
        String errormsg3 = wait.until(ExpectedConditions.visibilityOfElementLocated(emptypassword)).getText();
        System.out.println("ErrorMsg: " + errormsg3);
    }
    public void invalidcredentials(){
        usernameEl.sendKeys("rahul");
        passwordEl.sendKeys("rahul2021");
        clickloginbtn.click();
        boolean error4 = wait.until(ExpectedConditions.visibilityOfElementLocated(invalidcredentials)).isDisplayed();
        System.out.println("InvalidCredentials: " + error4);
        String errormsg4 = wait.until(ExpectedConditions.visibilityOfElementLocated(invalidcredentials)).getText();
        System.out.println("ErrorMsg: " + errormsg4);
    }
    public void validcredentials(){
        usernameEl.sendKeys("rahul");
        passwordEl.sendKeys("rahul@2021");
        clickloginbtn.click();
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
        String currenturl = driver.getCurrentUrl();
        String expectedurl = "https://qamoviesapp.ccbp.tech/";
        Assert.assertEquals(currenturl,expectedurl, "URLs do not match");
        System.out.println("Successfully Login");
    }
    public void enterusername(String uname){
        usernameEl.sendKeys(uname);
    }
    public void enterpassword(String pword){
        passwordEl.sendKeys(pword);
    }
    public void clickloginbtn(){
        clickloginbtn.click();
        System.out.println("Successfully Login");
    }
}