package MoviesAppPages.LoginPage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.LoginPage.pages.LoginPageUsingPageFactory;

public class LoginPageTest {
    WebDriver driver;
    LoginPageUsingPageFactory loginPageUsingPageFactory;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/login");
        loginPageUsingPageFactory = new LoginPageUsingPageFactory(driver);
    }
    @Test
    public void loginpageTest(){
        loginPageUsingPageFactory.LoginPageUI();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
