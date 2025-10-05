package MoviesAppPages.MovieDetails.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.MovieDetails.pages.NoTimeToDieMoviePage;
import MoviesAppPages.MovieDetails.pages.VenomMoviePage;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

public class MoviedetailspageTest {
    WebDriver driver;
    NoTimeToDieMoviePage noTimeToDieMoviePage;
    VenomMoviePage venomMoviePage;
    LoginPagefunctionality loginPagefunctionality;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/");
        noTimeToDieMoviePage = new NoTimeToDieMoviePage(driver);
        loginPagefunctionality = new LoginPagefunctionality(driver);
        venomMoviePage = new VenomMoviePage(driver);
    }
    @Test
    public void NoTimeToDieUITest(){
        loginPagefunctionality.validcredentials();
        noTimeToDieMoviePage.NoTimetodieUI();
    }
    @Test
    public void VenomUITest(){
        loginPagefunctionality.validcredentials();
        venomMoviePage.VenomUI();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
