package testingui.diplomadoumss.org.managepage.nasa.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.nasa.earth.Earth;

import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class Nasa extends BasePage {

    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li/a")
    private WebElement optionListing;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/li/a")
    private WebElement optionEarth;

    public Nasa() {
        DriverManager.getInstance().getWebDriver().manage().window().fullscreen();
    }

    public Nasa clickOnListing() {
        clickWebElement(optionListing);

        return this;
    }

    public Earth clickOnEarth() {
        clickWebElement(optionEarth);

        return new Earth();
    }
}
