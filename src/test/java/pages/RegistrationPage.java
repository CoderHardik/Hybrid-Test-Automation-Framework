package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    private final WebDriver driver;

    @FindBy(xpath = "//label[@for='roundedOne']")
    private WebElement termsCheckbox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptTerms() {
        termsCheckbox.click();
    }

    public void fillPassword(String password) {
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public boolean isSubmitVisible() {
        return submitButton.isDisplayed();
    }
}
