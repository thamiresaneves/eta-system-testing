package system;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import system.helpers.DriverManager;
import system.pages.AutomationPracticeMainPage;
import system.pages.MainPage;
import system.pages.TableSortAndSearchPage;

public class SeleniumEasyPageObjectTest {

    MainPage mainPage = new MainPage();
    TableSortAndSearchPage tableSortAndSearchPage = new TableSortAndSearchPage();
    AutomationPracticeMainPage automationPracticeMainPage = new AutomationPracticeMainPage();

    @Before
    public void setUp() {
        mainPage.accessPage();
    }

    @AfterEach
    public void tearDown() {
        DriverManager.endSession();
    }

    @Test
    public void pageObject_test() {
        Assertions.assertEquals("Selenium Easy", mainPage.getSiteName(),  "Title is correct");
    }

    @Test
    public void activity28_tableSortAndSearch() {
        mainPage.accessPage();
        mainPage.closeModal();

        mainPage.getLeftNavMenu().accessTableSortAndSearch();
        tableSortAndSearchPage.filterBy("Junior");

        Assertions.assertEquals("Junior Technical Author", tableSortAndSearchPage.getFirstRowPositionText()
                , "Position name matched");
    }

    @Test
    public void activity29_automationPractice_contactUsFormDisplayed() {
        automationPracticeMainPage.accessPage();
        automationPracticeMainPage.accessContactUs();

        Assertions.assertTrue(automationPracticeMainPage.isFormDisplayed());
    }
}
