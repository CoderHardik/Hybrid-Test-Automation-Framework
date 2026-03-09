package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object representing the Login Portal.
 */
public class LoginPage {

    private final WebDriver driver;

    // Encapsulated WebElements (Private)
    @FindBy(id = "email_input") // Using 'id' is faster and cleaner than 'xpath'
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;
    
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void setUserName(String strUserName){
        usernameInput.sendKeys(strUserName);
    }
    
    public void setPassword(String strPassword){
        passwordInput.sendKeys(strPassword);
    }
 
    /**
     * Executes the login action and returns the HomePage object.
     * This demonstrates the 'Fluent' Page Object Model.
     */
    public HomePage clickLogin(){
        loginButton.click();
        return new HomePage(driver);
    }
}
