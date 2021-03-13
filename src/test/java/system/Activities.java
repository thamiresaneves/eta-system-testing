package system;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activities {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("http://automationpractice.com/");
    }

    @AfterEach
    public void tearDown() {
        DriverManager.endSession();
    }

    @Test
    public void implicitlyWait_1Minute() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        try {
            driver.findElement(By.cssSelector("#name"));
        }catch(Exception e) {
            System.out.println("Something went wrong");
        }
    }

    @Test
    public void implicitlyWait_30Seconds() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            driver.findElement(By.cssSelector("#block_top_menu .submenu-container"));
        }catch(Exception e) {
            System.out.println("Something went wrong");
        }
    }

    @Test
    public void implicitlyWait_5minutes() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        try {
            driver.findElement(By.cssSelector("#block_top_menu .menu-content"));
        }catch(Exception e) {
            System.out.println("Something went wrong");
        }
    }

    @Test
    public void explicitWait_notVisibleElement() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#block_top_menu .submenu-container")));
        }catch(Exception e) {
            System.out.println("Something went wrong");
        }
    }

    @Test
    public void explicitWait_fillFormFields() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        driver.findElement(By.id("title")).sendKeys("Dereck");
        driver.findElement(By.id("description")).sendKeys("I am a cool person");
        driver.findElement(By.id("btn-submit")).click();

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("#submit-control img"))));
        System.out.println("Success message: " + driver.findElement(By.id("submit-control")).getText());
    }

    @Test
    public void example_Assertions() {
        Assertions.assertEquals("lala", "lala", "Strings matched");
        Assertions.assertAll("Testing assertAll",
        () -> Assertions.assertTrue(true, "Numbers matched"),
        () -> Assertions.assertFalse(false, "Not true")
        );
    }

    @Test
    public void seleniumEasy_sendForm() {
        driver.navigate().to("https://www.seleniumeasy.com/test/input-form-demo.html");
        List<WebElement> elements = driver.findElements(By.cssSelector(".form-control"));

        for(int i = 0; i < elements.size(); i++) {
            elements.get(i).sendKeys("dummy text");
        }
        driver.findElement(By.cssSelector("input[value='yes']")).click();

        Assertions.assertTrue(elements.get(0).getText().isEmpty(), "Empty form field");
    }

    @Test
    public void seleniumEasy_compareRowValues() {
        driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        List<WebElement> elements = driver.findElements(By.cssSelector(".table-hover tbody tr:nth-child(1) td"));

        Assertions.assertEquals("Wireframes", elements.get(1).getText(), "Task");
        Assertions.assertEquals("John Smith", elements.get(2).getText(), "Assignee");
        Assertions.assertEquals("in progress", elements.get(3).getText(), "Status");
    }

    @Test
    public void seleniumEasy_compareColumnValues() {
        driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        System.out.println(driver.findElement(By.cssSelector(".table-hover thead tr th:nth-child(3)")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".table-hover tbody tr td:nth-child(3)"));

        Assertions.assertAll("Comparing column values",
                () -> Assertions.assertEquals("John Smith", elements.get(0).getText(), "Row 1"),
                () -> Assertions.assertEquals("Mike Trout", elements.get(1).getText(), "Row 2"),
                () -> Assertions.assertEquals("Loblab Dan", elements.get(2).getText(), "Row 3"),
                () -> Assertions.assertEquals("Emily John", elements.get(3).getText(), "Row 4"),
                () -> Assertions.assertEquals("Holden Charles", elements.get(4).getText(), "Row 5"),
                () -> Assertions.assertEquals("Jane Doe", elements.get(5).getText(), "Row 6"),
                () -> Assertions.assertEquals("Kilgore Trout", elements.get(6).getText(), "Row 7")
        );
    }

    @Test
    public void seleniumEasy_tableSortSearch() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.navigate().to("https://www.seleniumeasy.com/test/");

        driver.findElement(By.cssSelector("#at-cv-lightbox-close:nth-child(1)")).click();


        driver.findElement(By.cssSelector("#navbar-brand-centered .navbar-nav:nth-child(1) .dropdown:nth-child(3)")).click();
        driver.findElement(By.cssSelector("#navbar-brand-centered .navbar-nav:nth-child(1) .dropdown:nth-child(3) .dropdown-menu li:nth-child(4)")).click();

        driver.findElement(By.cssSelector("#example_filter > label > input[type=search]")).sendKeys("Junior");

        String firstRowPosition = driver.findElement(By.cssSelector(".display .odd td:nth-child(2)")).getText();

        Assertions.assertEquals("Junior Technical Author", firstRowPosition, "Position name matched");
    }
}
