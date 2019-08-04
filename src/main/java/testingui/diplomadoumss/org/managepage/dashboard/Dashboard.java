package testingui.diplomadoumss.org.managepage.dashboard;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.location.LocationList;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin/cars/settings']")
    private WebElement cars_settings;

    @FindBy(xpath = "//a[text()= 'Locations List']")
    private WebElement locationList;

    public Dashboard() {
        avoidToUse(6);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    private void fullScreen(boolean isFull) {
        if (isFull)
            DriverManager.getInstance().getWebDriver().manage().window().fullscreen();
        else
            DriverManager.getInstance().getWebDriver().manage().window().maximize();
    }

    public void clickOptionLocation() {
        fullScreen(true);
        clickWebElement(By.xpath(String.format(PANEL_LEFT_OPTION, "Locations")));
    }

    public LocationList clickLocationList() {
        clickWebElement(locationList);
        fullScreen(false);
        return new LocationList();
    }
}
