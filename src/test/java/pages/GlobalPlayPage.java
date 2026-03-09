package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object for the Analytics/Plays Dashboard.
 */
public class GlobalPlayPage { // Standardized to PascalCase

    private final WebDriver driver; // Marked as final (Best Practice)
	
    // SANITIZED: Replaced proprietary class names with generic ones
    // IMPROVED: Replaced brittle 'child' indices with more stable attributes
    @FindBy(xpath = "//div[contains(@class, 'dashboard-main')]//button[contains(@text, 'Team')]") 
    private WebElement playedByTeamButton;
    
    public GlobalPlayPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    /**
     * Captures the text for team-level analytics.
     */
    public String getPlayedByTeamText(){ // Standard Java camelCase
    	return playedByTeamButton.getText();
    }
}
