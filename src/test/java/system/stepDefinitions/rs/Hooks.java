package system.stepDefinitions.rs;

import org.junit.After;
import org.junit.Before;
import system.helpers.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.getDriver();
    }

    @After
    public void tearDown() {
        DriverManager.endSession();
    }
}
