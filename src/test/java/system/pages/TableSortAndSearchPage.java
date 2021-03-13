package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;

public class TableSortAndSearchPage {

    private WebDriver driver;
    private By tableFilterField = By.cssSelector("#example_filter > label > input[type=search]");
    private By firstRowPositionText = By.cssSelector(".display .odd td:nth-child(2)");

    public TableSortAndSearchPage() {
        driver = DriverManager.getDriver();
    }

    public void filterBy(String txt) {
        driver.findElement(tableFilterField).sendKeys(txt);
    }

    public String getFirstRowPositionText() {
        return driver.findElement(firstRowPositionText).getText();
    }
}
