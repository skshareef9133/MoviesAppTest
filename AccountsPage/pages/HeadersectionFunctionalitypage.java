package MoviesAppPages.AccountsPage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HeadersectionFunctionalitypage {
    WebDriver driver;

    @FindBy(how = How.CSS, using = "a[class='nav-link']")
    WebElement popularsection;
    @FindBy(how = How.CSS, using = "a[class='nav-link active-nav-link']")
    WebElement homesection;
    @FindBy(how = How.CSS, using = "img[class='avatar-img']")
    WebElement accountsection;

    public HeadersectionFunctionalitypage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void Homesection(){
        homesection.click();
        String currenturl1 = driver.getCurrentUrl();
        String expectedurl1 = "https://qamoviesapp.ccbp.tech/";
        Assert.assertEquals(expectedurl1,currenturl1, "Both URLs do not match");
        System.out.println("Successfully Navigate Home section");
    }
    public void Popularsection(){
        popularsection.click();
        String currenturl = driver.getCurrentUrl();
        String expectedurl = "https://qamoviesapp.ccbp.tech/popular";
        Assert.assertEquals(expectedurl,currenturl, "Both URLs do not match");
        System.out.println("Successfully Navigate Popular section");
    }
    public void Accountsection(){
        accountsection.click();
        String currenturl2 = driver.getCurrentUrl();
        String expectedurl2 = "https://qamoviesapp.ccbp.tech/account";
        Assert.assertEquals(expectedurl2,currenturl2, "Both URLs do not match");
        System.out.println("Successfully Navigate Account section");
    }
    public void headersection(){
        Homesection();
        Popularsection();
        Accountsection();
    }
}
