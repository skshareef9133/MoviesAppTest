package MoviesAppPages.PopularPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopularsectionUIpage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(how = How.XPATH, using = "//a[@class='nav-link']")
    WebElement popularsection;
    By Movie1 = By.xpath("(//a[@class='link-item'])[1]");
    @FindBy(how = How.XPATH, using = "(//a[@class='link-item'])[6]")
    WebElement Movie6;
    @FindBy(how = How.XPATH, using = "(//a[@class='link-item'])[11]")
    WebElement Movie11;
    @FindBy(how = How.XPATH, using = "(//a[@class='link-item'])[16]")
    WebElement Movie16;

    public PopularsectionUIpage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }
    public void movieslist(){
        popularsection.click();
        boolean m1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Movie1)).isDisplayed();
        System.out.println("Venom Movie is displayed: " + m1);

        boolean m6 = Movie6.isDisplayed();
        System.out.println("The Boss Baby: Family Business Movie is displayed: " + m6);

        boolean m11 = Movie11.isDisplayed();
        System.out.println("Black Widow Movie is displayed: " + m11);

        boolean m16 = Movie16.isDisplayed();
        System.out.println("Narnia Movie is displayed: " + m16);
    }
}
