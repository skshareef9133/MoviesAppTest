package MoviesAppPages.LoginPage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

public class LoginPagefunctionalityTest {
    WebDriver driver;
    LoginPagefunctionality loginPagefunctionality;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/login");
        loginPagefunctionality = new LoginPagefunctionality(driver);

    }
    @Test(priority = 1)
    public void Emptyinputs(){
        loginPagefunctionality.emptyInputs();
    }
    @Test(priority = 2)
    public void Emptyusername(){
        loginPagefunctionality.emptyUsername();
    }
    @Test(priority = 3)
    public void Emptypassword(){
        loginPagefunctionality.emptyPassword();
    }
    @Test(priority = 4)
    public void Invalidcredentials(){
        loginPagefunctionality.invalidcredentials();
    }
    @Test(priority = 5)
    public void Validcredentials(){
        loginPagefunctionality.validcredentials();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
