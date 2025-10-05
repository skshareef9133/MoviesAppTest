package MoviesAppPages.HomePage.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MoviesAppPages.HomePage.pages.HomepageusingPagefactory;
import MoviesAppPages.LoginPage.pages.LoginPagefunctionality;

public class HomepageTest {
    WebDriver driver;
    HomepageusingPagefactory homepageusingPagefactory;
    LoginPagefunctionality loginPagefunctionality;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://qamoviesapp.ccbp.tech/");
        homepageusingPagefactory = new HomepageusingPagefactory(driver);
        loginPagefunctionality = new LoginPagefunctionality(driver);
    }
    @Test(priority = 1)
    public void homepageTest1(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter1();
    }
    @Test(priority = 2)
    public void homepageTest2(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter2();
    }
    @Test(priority = 3)
    public void homepageTest3(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter3();
    }
    @Test(priority = 4)
    public void homepageTest4(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter4();
    }
    @Test(priority = 5)
    public void homepageTest11(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter11();
    }
    @Test(priority = 6)
    public void homepageTest12(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter12();
    }
    @Test(priority = 7)
    public void homepageTest13(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter13();
    }
    @Test(priority = 8)
    public void homepageTest14(){
        loginPagefunctionality.validcredentials();
        homepageusingPagefactory.Movieposter14();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
