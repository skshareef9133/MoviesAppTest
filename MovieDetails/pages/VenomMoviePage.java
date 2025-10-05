package MoviesAppPages.MovieDetails.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VenomMoviePage{
    WebDriver driver;
    WebDriverWait wait;
    NoTimeToDieMoviePage noTimeToDieMoviePage;

    @FindBy(how = How.XPATH, using = "//a[@class='nav-link']")
    WebElement clickpopularEl;
    By venomMovie = By.xpath("(//img[@class='movie-image'])[1]");
    @FindBy(how = How.CLASS_NAME,using = "audio-heading")
    WebElement audioheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[4]")
    WebElement englishtext;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[5]")
    WebElement mandarintext;

    @FindBy(how = How.CLASS_NAME, using = "rating-average-heading")
    WebElement ratingaverageheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[7]")
    WebElement ratingaveragetext;

    @FindBy(how = How.CLASS_NAME, using = "budget-heading")
    WebElement budgetheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[8]")
    WebElement budgettext;

    @FindBy(how = How.CLASS_NAME, using = "release-date-heading")
    WebElement releasedateheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[9]")
    WebElement datetext;

    public VenomMoviePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }

    public void Audiopart(){
        System.out.println("\"Audio Available Elements\"");
        boolean audio = audioheading.isDisplayed();
        System.out.println(audioheading.getText() + " isDisplayed: " + audio);
        boolean english = englishtext.isDisplayed();
        System.out.println(englishtext.getText() + " isDisplayed: " + english);
        boolean mandarin = mandarintext.isDisplayed();
        System.out.println(mandarintext.getText() + " isDisplayed: " + mandarin);
    }
    public void RatingAveragepart(){
        System.out.println("\"Rating Average Elements\"");
        boolean ratingaverage = ratingaverageheading.isDisplayed();
        System.out.println(ratingaverageheading.getText() + " isDisplayed: " + ratingaverage);
        boolean ratingtext = ratingaveragetext.isDisplayed();
        System.out.println(ratingaveragetext.getText() + " isDisplayed: " + ratingtext);
    }
    public void Budgetpart(){
        System.out.println("\"Budget Elements\"");
        boolean budget = budgetheading.isDisplayed();
        System.out.println(budgetheading.getText() + " isDisplayed: " + budget);
        boolean budgetText = budgettext.isDisplayed();
        System.out.println(budgettext.getText() + " isDisplayed: " + budgetText);
    }
    public void Releasedatepart(){
        System.out.println("\"Release Date Elements\"");
        boolean releasedate = releasedateheading.isDisplayed();
        System.out.println(releasedateheading.getText() + " isDisplayed: " + releasedate);
        boolean date = datetext.isDisplayed();
        System.out.println(datetext.getText() + " isDisplayed: " + date);
    }
    public void VenomUI(){
        noTimeToDieMoviePage = new NoTimeToDieMoviePage(driver);
        clickpopularEl.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(venomMovie)).click();
        noTimeToDieMoviePage.Logopart();
        noTimeToDieMoviePage.Headingpart();
        noTimeToDieMoviePage.Genrespart();
        Audiopart();
        noTimeToDieMoviePage.Ratingcountpart();
        RatingAveragepart();
        Budgetpart();
        Releasedatepart();
        noTimeToDieMoviePage.Endpart();
    }
}
