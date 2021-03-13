package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;

public class LeftNavMenu {

    private WebDriver driver;

    public LeftNavMenu() {
        driver = DriverManager.getDriver();
    }

    private By leftNavMenu = By.cssSelector(".navbar-nav:nth-child(1)");
    private By inputForms = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1)");
    private By datePickers = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(2)");
    private By table = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(3)");

    //Input Forms menu options
    private By simpleFormDemo = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1) .dropdown-menu li:nth-child(1)");
    private By checkboxDemo = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1) .dropdown-menu li:nth-child(2)");
    private By radioButtonsDemo = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1) .dropdown-menu li:nth-child(3)");
    private By selectDropdownList = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1) .dropdown-menu li:nth-child(4)");
    private By inputFormSubmit = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1) .dropdown-menu li:nth-child(5)");
    private By ajaxFormSubmit = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1) .dropdown-menu li:nth-child(6)");
    private By jQuerySelectDropdown = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(1) .dropdown-menu li:nth-child(7)");

    //Date Pickers menu options
    private By bootstrapDatePicker = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(2) .dropdown-menu li:nth-child(1)");
    private By jQueryDatePicker = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(2) .dropdown-menu li:nth-child(2)");

    //Table menu options
    private By tablePagination = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(3) .dropdown-menu li:nth-child(1)");
    private By tableDataSearch = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(3) .dropdown-menu li:nth-child(2)");
    private By tableFilter = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(3) .dropdown-menu li:nth-child(3)");
    private By tableSortAndSearch = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(3) .dropdown-menu li:nth-child(4)");
    private By tableDataDownload = By.cssSelector(".navbar-nav:nth-child(1) .dropdown:nth-child(3) .dropdown-menu li:nth-child(5)");

    public void accessTableSortAndSearch() {
        driver.findElement(table).click();
        driver.findElement(tableSortAndSearch).click();
    }
}
