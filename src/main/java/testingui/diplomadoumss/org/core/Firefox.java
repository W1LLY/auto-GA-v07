package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Implement the Firefox for Webdriver
 * @author Marcelo Garay
 */
public class Firefox implements Browser {
    @Override
    public WebDriver getWebDriver() {
        return  new FirefoxDriver();
    }
}
