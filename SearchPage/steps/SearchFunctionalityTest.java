package MoviesAppPages.SearchPage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.SearchPage.pages.Searchfunctionalitypage;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

public class SearchFunctionalityTest {
    WebDriver driver;
    Searchfunctionalitypage searchfunctionalitypage;
    LoginPagefunctionality loginPagefunctionality;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/search");
        searchfunctionalitypage = new Searchfunctionalitypage(driver);
        loginPagefunctionality = new LoginPagefunctionality(driver);
    }
    @Test
    public void SearchFunctionalityTest(){
        loginPagefunctionality.validcredentials();
        searchfunctionalitypage.searchFunctionality();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
