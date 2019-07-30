package testingui.diplomadoumss.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Juan Montaño
 */
public class DashboardNasa extends BasePage {

    public DashboardNasa() {
        avoidToUse(5);
    }

    @FindBy(xpath = "//*[@id=\"tocify-header1\"]")
    private WebElement option_nasa_listener1;

    @FindBy(xpath = "//ul[@id='tocify-header8']")
    private WebElement option_earth;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/ul")
    private WebElement optionImagery;

    public DashboardNasa clickNasaListener() {
        clickWebElement(option_nasa_listener1);
        return this;
    }

    public DashboardNasa clickOptionEarth() {
        clickWebElement(option_earth);
        return this;
    }

    public DashboardNasa clickOptionImagery() {
        clickWebElement(optionImagery);
        return this;
    }

}
