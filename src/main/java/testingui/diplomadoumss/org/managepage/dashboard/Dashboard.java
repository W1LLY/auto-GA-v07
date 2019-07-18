package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Juan
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu' and @class='list-unstyled components']")
    private WebElement leftPanel;

    @FindBy(xpath = "//a[@href='#Cars']")
    private WebElement carsExpand;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars/extras']")
    private WebElement extrasExpand;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(5);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public Dashboard clickExtraExpand() {
        clickWebElement(extrasExpand);
        return this;
    }
}
