package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;

import java.util.concurrent.TimeUnit;

public class MainPage {

    private WebDriver driver;
    ExamplesMenu examplesMenu = new ExamplesMenu();

    private By siteName = By.cssSelector("#site-name");
    private By demoHomeButton = By.cssSelector(".navbar-brand");
    private By modalCloseButton = By.cssSelector("#at-cv-lightbox-close:nth-child(1)");

    public MainPage() {
        driver = DriverManager.getDriver();
    }

    public void accessPage() {
        driver.get("https://www.seleniumeasy.com/test/");
    }

    public String getSiteName() {
        return driver.findElement(siteName).getText();
    }

    public LeftNavMenu getLeftNavMenu() {
        return new LeftNavMenu();
    }

    public ExamplesMenu examplesMenu() {
        return new ExamplesMenu();
    }

    public void closeModal() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(modalCloseButton).click();
    }
}
