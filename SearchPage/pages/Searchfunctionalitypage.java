package MoviesAppPages.SearchPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Searchfunctionalitypage {
    WebDriver driver;
    WebDriverWait wait;

    By searchEl = By.cssSelector( "button[class='search-empty-button']");

    @FindBy(how = How.ID, using = "search")
    WebElement searchfield;
    @FindBy(how = How.CSS, using = "button[class='search-button']")
    WebElement searchbtn;

    By displayedmovies = By.cssSelector("ul.search-movies-container li.movie-icon-item");
    By errormsg = By.cssSelector("p.not-found-search-paragraph");

    public Searchfunctionalitypage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }
    public void searchFunctionality(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchEl)).click();
        searchfield.sendKeys("No");
        searchbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(displayedmovies));
        List<WebElement> items1 = driver.findElements(displayedmovies);
        int count1 = items1.size();
        System.out.println("'No' Number of Movies Displayed: " + count1);

        searchfield.clear();
        searchfield.sendKeys("Time");
        searchbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(displayedmovies));
        List<WebElement> items2 = driver.findElements(displayedmovies);
        int count2 = items2.size();
        System.out.println("'Time' Number of Movies Displayed: " + count2);

        searchfield.clear();
        searchfield.sendKeys("To");
        searchbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(displayedmovies));
        List<WebElement> items3 = driver.findElements(displayedmovies);
        int count3 = items3.size();
        System.out.println("'To' Number of Movies Displayed: " + count3);

        searchfield.clear();
        searchfield.sendKeys("Die");
        searchbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(displayedmovies));
        List<WebElement> items4 = driver.findElements(displayedmovies);
        int count4 = items4.size();
        System.out.println("'Die' Number of Movies Displayed: " + count4);

        searchfield.clear();
        searchfield.sendKeys("Air");
        searchbtn.click();
        String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(errormsg)).getText();
        System.out.println("ErrorMsg: " + msg);
    }
}
