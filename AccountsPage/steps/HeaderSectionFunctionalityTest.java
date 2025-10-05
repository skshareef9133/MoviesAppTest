package MoviesAppPages.AccountsPage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.AccountsPage.pages.HeadersectionFunctionalitypage;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

import java.time.Duration;

public class HeaderSectionFunctionalityTest {
    WebDriver driver;
    HeadersectionFunctionalitypage headersectionFunctionalitypage;
    LoginPagefunctionality loginPagefunctionality;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/");
        headersectionFunctionalitypage = new HeadersectionFunctionalitypage(driver);
        loginPagefunctionality = new LoginPagefunctionality(driver);
    }
    @Test
    public void HeaderSectionTest(){
        loginPagefunctionality.validcredentials();
        headersectionFunctionalitypage.headersection();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
