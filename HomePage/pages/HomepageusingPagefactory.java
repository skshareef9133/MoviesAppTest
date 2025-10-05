package MoviesAppPages.HomePage.pages;

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

public class HomepageusingPagefactory {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[1]")
    WebElement movieposter1;
    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[2]")
    WebElement movieposter2;
    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[3]")
    WebElement movieposter3;
    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[4]")
    WebElement movieposter4;
    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[11]")
    WebElement movieposter11;
    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[12]")
    WebElement movieposter12;
    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[13]")
    WebElement movieposter13;
    @FindBy(how = How.XPATH, using = "(//img[@class='poster'])[14]")
    WebElement movieposter14;

    By posterHeading = By.className("movie-title");

    @FindBy(how = How.CLASS_NAME, using = "play-button")
    WebElement playbtn;
    @FindBy(how = How.CLASS_NAME, using = "contact-us-paragraph")
    WebElement contactUsSection;
    @FindBy(how = How.XPATH, using = "(//h1[@class='movies-list-heading'])[1]")
    WebElement displayedsection1;
    @FindBy(how = How.XPATH, using = "(//h1[@class='movies-list-heading'])[2]")
    WebElement displayedsection2;

    public HomepageusingPagefactory(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public void Movieposter1(){
        String section = displayedsection1.getText();
        movieposter1.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "No Time to Die";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
    public void Movieposter2(){
        String section = displayedsection1.getText();
        movieposter2.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "Shang-Chi and the Legend of the Ten Rings";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
    public void Movieposter3(){
        String section = displayedsection1.getText();
        movieposter3.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "Dune";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
    public void Movieposter4(){
        String section = displayedsection1.getText();
        movieposter4.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "The Suicide Squad";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
    public void Movieposter11(){
        String section = displayedsection2.getText();
        movieposter11.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "Death Proof";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
    public void Movieposter12(){
        String section = displayedsection2.getText();
        movieposter12.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "Clifford";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
    public void Movieposter13(){
        String section = displayedsection2.getText();
        movieposter13.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "Titanic";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
    public void Movieposter14(){
        String section = displayedsection2.getText();
        movieposter14.click();
        String currenttext =
                wait.until(ExpectedConditions.visibilityOfElementLocated(posterHeading)).getText();
        String expectedtext = "Avatar";
        Assert.assertEquals(expectedtext,currenttext,"Posters do not match");
        System.out.println("\"" + currenttext + "\"" + " Movie is Displayed in " + section + " section");

        boolean Playbtn = playbtn.isDisplayed();
        System.out.println("PlayButtonisDisplayed: " + Playbtn);
        boolean ContactUs = contactUsSection.isDisplayed();
        System.out.println("ContactUsSection: " + ContactUs);
    }
}











