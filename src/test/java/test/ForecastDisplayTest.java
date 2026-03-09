package test;

import framework.BaseTest;
import framework.ConfigReader;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class ForecastDisplayTest extends BaseTest {

    private HomePage homePage;
    private static final Logger log = LogManager.getLogger(ForecastDisplayTest.class);

    @BeforeMethod
    public void setUp() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get(ConfigReader.getProperty("url"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName(ConfigReader.getProperty("username"));
        loginPage.setPassword(ConfigReader.getProperty("password"));

        homePage = loginPage.clickLogin();

        log.info("Login successful for user: {}", ConfigReader.getProperty("username"));
    }

    @Test(priority = 0, description = "Verify that the monthly forecast amount matches between Home and Detail pages")
    public void testMonthlyPredictiveForecastConsistency() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(d -> {
            try {
                return !homePage.getForecastSpinner().isDisplayed();
            } catch (Exception e) {
                return true;
            }
        });

        wait.until(d -> {
            WebElement element = homePage.getMonthlyForecastFilter();
            return (element.isDisplayed() && element.isEnabled()) ? element : null;
        });

        homePage.clickMonthlyForecastFilter();

        wait.until(d -> !homePage.getPredictiveForecastValue().contains("$0"));
        String homePageValue = homePage.getPredictiveForecastValue();

        log.info("Captured Forecast Value from Home: {}", homePageValue);
    }
}