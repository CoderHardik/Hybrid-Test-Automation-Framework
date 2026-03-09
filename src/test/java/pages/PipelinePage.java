package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class PipelinePage {
    private final WebDriver driver;

    @FindBy(xpath = "//div[contains(@class, 'pipeline-filter-container')]//span[contains(text(),'My Opportunities')]")
    private WebElement myOpportunity;

    @FindBy(className = "opportunity-card")
    private List<WebElement> opportunityCards; 

    @FindBy(className = "new-act-cont")
    private List<WebElement> activityCountBadges;

    public PipelinePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Extracts and sums the numeric activity counts from all badges on the page.
     * Demonstrates data parsing and list iteration.
     */
    public int getTotalActivitiesCount() {
        int totalCount = 0;
        for (WebElement badge : activityCountBadges) {
            // Regex to extract only digits
            String countText = badge.getText().replaceAll("\\D+", "");
            if (!countText.isEmpty()) {
                totalCount += Integer.parseInt(countText);
            }
        }
        return totalCount;
    }
    
    // ... other sanitized methods ...
}
