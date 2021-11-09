package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.utils.BaseClass;

public class MainPage {
    private WebDriver driver;

    String PAGE_URL = "https://rozetka.com.ua/";

    @FindBy(how = How.LINK_TEXT, using = "Ноутбуки и компьютеры")
    private WebElement pcsAndLaptops;

    @FindBy(xpath = "//a[@title='Мониторы' and text()]")
    private WebElement monitors;

    @FindBy(xpath = "//input[@formcontrolname='max']")
    private WebElement priceInput;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void navigateToCategory() {
        pcsAndLaptops.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        monitors.click();
    }

}