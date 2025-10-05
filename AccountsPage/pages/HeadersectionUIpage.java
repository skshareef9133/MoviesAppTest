package MoviesAppPages.AccountsPage.pages;

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

public class HeadersectionUIpage {
    WebDriver driver;
    WebDriverWait wait;

    By websitelogo = By.className("website-logo");

    @FindBy(how = How.CSS, using = "a[class='nav-link active-nav-link']")
    WebElement HomeNavbar;
    @FindBy(how = How.CSS, using = "a[class='nav-link']")
    WebElement popularNavbar;

    public HeadersectionUIpage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public void websiteLogo(){
        boolean weblogo =
                wait.until(ExpectedConditions.visibilityOfElementLocated(websitelogo)).isDisplayed();
        System.out.println("WebsiteLogoisDisplayed: " + weblogo);
    }
    public void homenavbar(){
        String expectedtext = "Home";
        String currenttext = HomeNavbar.getText();
        Assert.assertEquals(expectedtext,currenttext,"Both texts do not match");
        System.out.println("\"" + currenttext + "\"" + " Navbar Element is visible");
    }
    public void Popularnavbar(){
        String expectedtext = "Popular";
        String currenttext = popularNavbar.getText();
        Assert.assertEquals(expectedtext,currenttext,"Both texts do not match");
        System.out.println("\"" + currenttext + "\"" + " Navbar Element is visible");
    }
    public void headerSection(){
        websiteLogo();
        homenavbar();
        Popularnavbar();
    }

}
