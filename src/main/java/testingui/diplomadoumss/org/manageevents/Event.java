package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import testingui.diplomadoumss.org.core.DriverManager;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Event {
    public static void clickWebElement(WebElement element) {
        isWebElementClickable(element);
        element.click();
    }

    public static void fillWebElement(WebElement element, String value) {
        isWebElementVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public static void selectedDropdown(Select select, int position) {
        select.selectByIndex(position);
    }

    public static void fillWebElementNumber(WebElement element, int number) {
        isWebElementVisible(element);
        element.clear();
        element.sendKeys(String.valueOf(number));
    }

    public static void clickWebElement(By by) {
        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillWebElement(By by) {
        DriverManager.getInstance().getWebDriver().findElement(by).sendKeys("holas");
    }

    public static void isWebElementVisible(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void isWebElementClickable(WebElement element) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void avoidToUse(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public static String getWebElementText(WebElement element) {
        return element.getText();
    }
}
