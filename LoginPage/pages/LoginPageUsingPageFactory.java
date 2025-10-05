package MoviesAppPages.LoginPage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPageUsingPageFactory {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(how = How.CLASS_NAME, using = "login-website-logo")
    WebElement logoEl;
    @FindBy(how = How.CLASS_NAME, using = "sign-in-heading")
    WebElement logintext;
    @FindBy(how = How.CSS, using = "label[for='usernameInput']")
    WebElement usernamelabel;
    @FindBy(how = How.CSS, using = "label[for='passwordInput']")
    WebElement passwordlabel;
    @FindBy(how = How.CLASS_NAME, using = "login-button")
    WebElement loginbtn;

    public LoginPageUsingPageFactory(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public void checklogoEl(){
        boolean logo = logoEl.isDisplayed();
        System.out.println("WebsiteLogo: " + logo);
    }
    public void checklogintext(){
        String currentText = logintext.getText();
        String expectedText = "Login";
        Assert.assertEquals(currentText,expectedText,"Both Texts do not match");
        System.out.println("LoginText: " + currentText);
    }
    public void checkusernamelabel(){
        boolean user = usernamelabel.isDisplayed();
        System.out.println("UserNamelabel: " + user);
    }
    public void checkpasswordlabel(){
        boolean pass = passwordlabel.isDisplayed();
        System.out.println("Passwordlabel: " + pass);
    }
    public void checkloginbtn(){
        boolean login = loginbtn.isDisplayed();
        System.out.println("LoginButton: " + login);
    }

    public void LoginPageUI(){
        checklogoEl();
        checklogintext();
        checkusernamelabel();
        checkpasswordlabel();
        checkloginbtn();
    }

}
