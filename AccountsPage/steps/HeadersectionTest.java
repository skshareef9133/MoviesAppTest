package MoviesAppPages.AccountsPage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.AccountsPage.pages.HeadersectionUIpage;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

public class HeadersectionTest {
    WebDriver driver;
    LoginPagefunctionality loginPagefunctionality;
    HeadersectionUIpage headersectionUIpage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/");
        loginPagefunctionality = new LoginPagefunctionality(driver);
        headersectionUIpage = new HeadersectionUIpage(driver);
    }

    @Test
    public void HeaderSectionUI(){
        loginPagefunctionality.validcredentials();
        headersectionUIpage.headerSection();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
