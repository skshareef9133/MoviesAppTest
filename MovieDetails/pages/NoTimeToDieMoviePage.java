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
import java.util.List;

public class NoTimeToDieMoviePage {
    WebDriver driver;
    WebDriverWait wait;

    By clickNoTimemovieEl = By.xpath("(//img[@class='poster'])[1]");

    By websitelogo = By.xpath("//img[@class='website-logo']");
    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[1]")
    WebElement homeEl;
    @FindBy(how = How.XPATH, using = "(//a[@class='nav-link'])[2]")
    WebElement popularEl;
    @FindBy(how = How.CSS, using = "button.search-empty-button")
    WebElement searchlogo;
    @FindBy(how =How.CSS, using = "img.avatar-img")
    WebElement Accountlogo;

    @FindBy(how = How.CLASS_NAME, using = "movie-title")
    WebElement movietitle;
    @FindBy(how = How.CLASS_NAME, using = "watch-time")
    WebElement watchTime;
    @FindBy(how = How.CLASS_NAME, using = "sensor-rating")
    WebElement sensorRating;
    @FindBy(how = How.CLASS_NAME, using = "release-year")
    WebElement releaseyear;
    @FindBy(how = How.CLASS_NAME, using = "movie-overview")
    WebElement movieoverview;
    @FindBy(how = How.CLASS_NAME, using = "play-button")
    WebElement playbtn;

    @FindBy(how = How.CLASS_NAME, using = "genres-heading")
    WebElement genresheading;
    @FindBy(how = How.XPATH, using = "//div[@class='genres-container']/child::p[1]")
    WebElement adventuretext;
    @FindBy(how = How.XPATH, using = "//div[@class='genres-container']/child::p[2]")
    WebElement actiontext;
    @FindBy(how = How.XPATH, using = "//div[@class='genres-container']/child::p[3]")
    WebElement thrillertext;

    @FindBy(how = How.CLASS_NAME, using = "audio-heading")
    WebElement audioheading;
    @FindBy(how = How.XPATH, using = "//ul[@class='audio-container']/child::li[1]")
    WebElement spanishtext;
    @FindBy(how = How.XPATH, using = "//ul[@class='audio-container']/child::li[2]")
    WebElement frenchtext;
    @FindBy(how = How.XPATH, using = "//ul[@class='audio-container']/child::li[3]")
    WebElement englishtext;
    @FindBy(how = How.XPATH, using = "//ul[@class='audio-container']/child::li[4]")
    WebElement italiantext;
    @FindBy(how = How.XPATH, using = "//ul[@class='audio-container']/child::li[5]")
    WebElement russiantext;

    @FindBy(how = How.CLASS_NAME, using = "rating-heading")
    WebElement ratingcountheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[9]")
    WebElement counttext;

    @FindBy(how = How.CLASS_NAME, using = "rating-average-heading")
    WebElement ratingaverageheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[10]")
    WebElement averagetext;

    @FindBy(how = How.CLASS_NAME, using = "budget-heading")
    WebElement budgetheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[11]")
    WebElement budgettext;

    @FindBy(how = How.CLASS_NAME, using = "release-date-heading")
    WebElement releasedateheading;
    @FindBy(how = How.XPATH, using = "(//p[@class='category-paragraph'])[12]")
    WebElement datetext;

    @FindBy(how = How.CLASS_NAME, using = "similar-movies-heading")
    WebElement Morelikethisheading;
    By listofmovies = By.xpath("//ul[@class='similar-movies-list-container']/child::li");

    @FindBy(how = How.CLASS_NAME, using = "contact-us-paragraph")
    WebElement contactusparagraph;

    public NoTimeToDieMoviePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }
    public void Logopart(){
        boolean weblogo = wait.until(ExpectedConditions.visibilityOfElementLocated(websitelogo)).isDisplayed();
        System.out.println("WebsiteLogoisDisplayed: " + weblogo);
        boolean home = homeEl.isDisplayed();
        System.out.println(homeEl.getText() + " Navbar Element isDisplayed: " + home);
        boolean popular = popularEl.isDisplayed();
        System.out.println(popularEl.getText() + " Navbar Element isDisplayed: " + popular);
        boolean search = searchlogo.isDisplayed();
        System.out.println("SearchLogoisDisplayed: " + search);
        boolean account = Accountlogo.isDisplayed();
        System.out.println("AccountLogoisDisplayed: " + account);
    }
    public void Headingpart() {
        boolean title = movietitle.isDisplayed();
        System.out.println(movietitle.getText() + " isDisplayed: " + title);
        boolean time = watchTime.isDisplayed();
        System.out.println(watchTime.getText() + " isDisplayed: " + time);
        boolean sensor = sensorRating.isDisplayed();
        System.out.println(sensorRating.getText() + " isDisplayed: " + sensor);
        boolean year = releaseyear.isDisplayed();
        System.out.println(releaseyear.getText() + " isDisplayed: " + year);
        boolean overview = movieoverview.isDisplayed();
        System.out.println(movieoverview.getText() + " isDisplayed: " + overview);
        boolean btn = playbtn.isDisplayed();
        System.out.println(playbtn.getText() + " isDisplayed: " + btn);
    }
    public void Genrespart() {
        System.out.println("\"Genres Elements\"");
        boolean genres = genresheading.isDisplayed();
        System.out.println(genresheading.getText() + " isDisplayed: " + genres);
        boolean advanture = adventuretext.isDisplayed();
        System.out.println(adventuretext.getText() + " isDisplayed: " + advanture);
        boolean action = actiontext.isDisplayed();
        System.out.println(actiontext.getText() + " isDisplayed: " + action);
        boolean thriller = thrillertext.isDisplayed();
        System.out.println(thrillertext.getText() + " isDisplayed: " + thriller);
    }
    public void Audiopart() {
        System.out.println("\"Audio Available Elements\"");
        boolean audio = audioheading.isDisplayed();
        System.out.println(audioheading.getText() + " isDisplayed: " + audio);
        boolean spanish = spanishtext.isDisplayed();
        System.out.println(spanishtext.getText() + " isDisplayed: " + spanish);
        boolean french = frenchtext.isDisplayed();
        System.out.println(frenchtext.getText() + " isDisplayed: " + french);
        boolean english = englishtext.isDisplayed();
        System.out.println(englishtext.getText() + " isDisplayed: " + english);
        boolean italian = italiantext.isDisplayed();
        System.out.println(italiantext.getText() + " isDisplayed: " + italian);
        boolean russian = russiantext.isDisplayed();
        System.out.println(russiantext.getText() + " isDisplayed: " + russian);
    }
    public void Ratingcountpart() {
        System.out.println("\"Rating Count Elements\"");
        boolean rating = ratingcountheading.isDisplayed();
        System.out.println(ratingcountheading.getText() + " isDisplayed: " + rating);
        boolean count = counttext.isDisplayed();
        System.out.println(counttext.getText() + " isDisplayed: " + count);
    }
    public void RatingAveragepart() {
        System.out.println("\"Rating Average Elements\"");
        boolean average = ratingaverageheading.isDisplayed();
        System.out.println(ratingaverageheading.getText() + " isDisplayed: " + average);
        boolean text = averagetext.isDisplayed();
        System.out.println(averagetext.getText() + " isDisplayed: " + text);
    }
    public void Budgetpart() {
        System.out.println("\"Budget Elements\"");
        boolean budget = budgetheading.isDisplayed();
        System.out.println(budgetheading.getText() + " isDisplayed: " + budget);
        boolean BudgetText = budgettext.isDisplayed();
        System.out.println(budgettext.getText() + " isDisplayed: " + BudgetText);
    }
    public void Releasedatepart(){
        System.out.println("\"Release Date Elements\"");
        boolean date = releasedateheading.isDisplayed();
        System.out.println(releasedateheading.getText() + " isDisplayed: " + date);
        boolean Datetext = datetext.isDisplayed();
        System.out.println(datetext.getText() + " isDisplayed: " + Datetext);
    }

    public void Endpart() {
        boolean morelikethis = Morelikethisheading.isDisplayed();
        System.out.println(Morelikethisheading.getText() + " isDisplayed: " + morelikethis);
        List<WebElement> movielist = driver.findElements(listofmovies);
        int list = movielist.size();
        System.out.println("No.of Movies displayed in MorelikeThis section: " + list);

        boolean contactus = contactusparagraph.isDisplayed();
        System.out.println(contactusparagraph.getText() + " isDisplayed: " + contactus);
    }

    public void NoTimetodieUI() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickNoTimemovieEl)).click();
        Logopart();
        Headingpart();
        Genrespart();
        Audiopart();
        Ratingcountpart();
        RatingAveragepart();
        Budgetpart();
        Releasedatepart();
        Endpart();
    }

}
