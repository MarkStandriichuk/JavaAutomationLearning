package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MonitorsPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@formcontrolname='max']")
    private WebElement priceInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//img[@title='Монітор \"19\" Qualvision QV-LED19A-2K'][1]")
    private WebElement firstMonitor;

    @FindBy(xpath = "//img[@title='Монитор Philips Brilliance B-line 225B, 22\", 1680х1050 Б/У 5475-2179']")
    private WebElement secondMonitor;

    @FindBy(xpath = "//button[@class='compare-button ng-star-inserted']")
    private WebElement compareBtn;

    @FindBy(xpath = "//a[@class='comparison-modal__link']")
    private WebElement comparisonLink;

    @FindBy(xpath = "//span[@class='counter counter--gray ng-star-inserted']")
    private WebElement counterIcon;

    @FindBy(className = "products-grid__cell ng-star-inserted")
    private WebElement listOfProductsInComperison;

    String price = "3000";

    public MonitorsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void choosingMonitors() {
        priceInput.clear();
        priceInput.sendKeys(price);
        submitBtn.click();
    }

    public void firstMonitor() {
        Actions actions = new Actions(driver);
        actions.moveToElement(firstMonitor).click().perform();
        compareBtn.click();
        counterIcon.isDisplayed();
        driver.navigate().back();
    }

    public void secondMonitor() {
        Actions actions = new Actions(driver);
        actions.moveToElement(secondMonitor).click().perform();
        compareBtn.click();
        counterIcon.isDisplayed();
        counterIcon.click();
        comparisonLink.click();
    }

    public void compareMonitors() {
    }
}
