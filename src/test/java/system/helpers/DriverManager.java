package system.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static system.helpers.Constants.CHROME_DRIVER_PATH;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        System.setProperty("webdriver.chrome.silentOutput", "true");

        if (driver == null) {
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void endSession() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
