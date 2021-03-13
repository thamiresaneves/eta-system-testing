package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;

import java.util.concurrent.TimeUnit;

public class AutomationPracticeMainPage {

    private WebDriver driver;

    private By contactUsButton = By.id("contact-link");
    private By form = By.cssSelector(".contact-form-box");

    public AutomationPracticeMainPage() {
        driver = DriverManager.getDriver();
    }

    public void accessPage() {
        driver.get("http://automationpractice.com/");
    }

    public void accessContactUs() {
        driver.findElement(contactUsButton).click();
    }

    public Boolean isFormDisplayed() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver.findElement(form).isDisplayed();
    }
}
