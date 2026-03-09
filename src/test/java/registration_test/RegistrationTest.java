package registration_test;

import framework.BaseTest;
import framework.ConfigReader;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    private RegistrationPage registrationPage;

    @BeforeMethod
    public void setUp() {

        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));

        registrationPage = new RegistrationPage(driver);
    }

    @Test(priority=0, description = "Verify end-to-end user registration flow")
    public void testUserRegistrationFlow() {

        registrationPage.acceptTerms();
        registrationPage.clickSubmit();

        registrationPage.fillPassword("DemoPassword123!");
        registrationPage.clickSubmit();

        Assert.assertTrue(
            registrationPage.isSubmitVisible(),
            "Registration submit button should be visible on the final step."
        );
    }
}