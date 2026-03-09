package test;

import framework.BaseTest;
import framework.ConfigReader;
import org.apache.logging.log4j.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

public class DashboardDataConsistencyTest extends BaseTest {

    private HomePage homePage;
    private NetworkPage networkPage;
    private PipelinePage pipelinePage;
    private static final Logger log = LogManager.getLogger(DashboardDataConsistencyTest.class);

    @BeforeMethod
    public void setUp() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));

        LoginPage loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        networkPage = new NetworkPage(driver);
        pipelinePage = new PipelinePage(driver);

        loginPage.setUserName(ConfigReader.getProperty("username"));
        loginPage.setPassword(ConfigReader.getProperty("password"));
        loginPage.clickLogin();

        log.info("Dashboard login successful for user: {}", ConfigReader.getProperty("username"));
    }
}