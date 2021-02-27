package system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static system.helpers.Constants.CHROME_DRIVER_PATH;

public class Main {

    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        System.setProperty("webdriver.chrome.silentOutput", "true");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesar.school");
        driver.manage().window().maximize();
        driver.quit();
    }
}
