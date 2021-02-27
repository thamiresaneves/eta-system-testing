package system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;

public class Main {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://www.cesar.school/");
    }

    @Test
    public void cesarSchool_visit() {
        DriverManager.endSession();
    }

    @Test
    public void cesarSchool_goToEndPage() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public static void main(String [] args) {
        WebDriver driver = DriverManager.getDriver();

        driver.get("https://www.cesar.school/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.cesar.school/graduacao/");
        driver.navigate().back();
        driver.navigate().refresh();

        DriverManager.endSession();
    }
}
