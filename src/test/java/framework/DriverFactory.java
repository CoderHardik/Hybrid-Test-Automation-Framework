package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {

        if (driver.get() == null) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            driver.set(new ChromeDriver(options));
        }

        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}