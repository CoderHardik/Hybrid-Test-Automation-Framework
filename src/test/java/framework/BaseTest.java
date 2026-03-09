package framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void globalSetUp() {

        driver = DriverFactory.getDriver();
    }

    @AfterClass
    public void globalTearDown() {

        DriverFactory.quitDriver();
    }
}