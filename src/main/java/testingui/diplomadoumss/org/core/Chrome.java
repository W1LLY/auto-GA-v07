package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Implement the webdriver
 * @author Marcelo Garay
 */
public class Chrome implements Browser {
    @Override
    public WebDriver getWebDriver() {
        return new ChromeDriver();
    }
}
