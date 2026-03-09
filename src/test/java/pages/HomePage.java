package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object for the Main Application Dashboard.
 * Focuses on Revenue Analytics and Network Activity Tracking.
 * Sanitized for Portfolio use.
 */
public class HomePage {

    private final WebDriver driver;

    // --- Locators: Loading & Spinners ---
    @FindBy(xpath = "//div[contains(@class, 'forecast-value-container')]//span[contains(@class, 'loader-wrap')]")
    private WebElement forecastSpinner;

    @FindBy(xpath = "//div[contains(@class, 'link conn-cont')]//span[contains(@class, 'loader-wrap')]")
    private WebElement topLeftSectionSpinner;

    // --- Locators: Forecast Section ---
    @FindBy(xpath = "//span[contains(@class, 'forecast-highlight-revenue')]")
    private WebElement predictiveForecastValue;

    @FindBy(xpath = "//button[contains(@analytics-event, 'Month')]")
    private WebElement monthlyForecastFilter;

    @FindBy(xpath = "//div[@data-id='forecast-box']//div[@class='valueLabelText']") 
    private WebElement detailPageForecastValue;

    // --- Locators: Navigation & Sections ---
    @FindBy(xpath = "//div[contains(@class, 'link conn-cont')]")
    private WebElement topLeftSectionNetwork;

    @FindBy(xpath = "//div[text()='Highest Revenue']")
    private WebElement topDealsRevenueLabel;

    // --- Constructor ---
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // --- Methods for Forecast Analytics ---
    
    public void Monthly_predicitive_forecast_click() {
        monthlyForecastFilter.click();
    }

    public String Homepage_predicitive_forecast() {
        return predictiveForecastValue.getText();
    }

    public void Homepage_predicitive_forecast_click() {
        predictiveForecastValue.click();
    }

    public String Manage_predicitive_forecast_text() {
        return detailPageForecastValue.getText();
    }

    public String getPredictiveForecastValue() {
        return predictiveForecastValue.getText();
    }

    // --- Methods for Network / Connections ---

    public String TopLeftSectionNetworkText() {
        return topLeftSectionNetwork.getText();
    }

    public void TopLeftSectionNetworkClick() {
        topLeftSectionNetwork.click();
    }

    // --- Getters for Explicit/Lambda Waits (Returns WebElements) ---

    public WebElement getForecastSpinner() {
        return forecastSpinner;
    }

    public WebElement getTopLeftSectionSpinner() {
        return topLeftSectionSpinner;
    }

    public WebElement getMonthlyForecastFilter() {
        return monthlyForecastFilter;
    }

    public WebElement getManage_predicitive_forecast() {
        return detailPageForecastValue;
    }
    
    public WebElement getPredictiveForecastValueElement() {
        return predictiveForecastValue;
    }
        /**
     * Clean method name for clicking the monthly filter.
     * Matches the call in ForecastDisplayTest.java
     */
    public void clickMonthlyForecastFilter() {
        Monthly_predicitive_forecast_click(); // Just calls the other method to avoid duplication
    }

}
