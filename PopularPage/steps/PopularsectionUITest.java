package MoviesAppPages.PopularPage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.PopularPage.pages.PopularsectionUIpage;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

public class PopularsectionUITest {
    WebDriver driver;
    PopularsectionUIpage popularsectionUIpage;
    LoginPagefunctionality loginPagefunctionality;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/");
        popularsectionUIpage = new PopularsectionUIpage(driver);
        loginPagefunctionality = new LoginPagefunctionality(driver);
    }
    @Test
    public void Popularpagesection(){
        loginPagefunctionality.validcredentials();
        popularsectionUIpage.movieslist();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
