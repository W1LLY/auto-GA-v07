package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.cards.Cars;
import testingui.diplomadoumss.org.managepage.location.Location;

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

    @FindBy(xpath = "//a[@href='#Cars']")
    private WebElement cars;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement option_cars;

    @FindBy(xpath = "//a[@href='#Locations']")
    private WebElement location;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/supplier/locations']")
    private WebElement option_location;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public void clickLocation() {
        location.click();
    }

    public void clickOptionLocation() {
        option_location.click();
    }

    public Location selectLocation() {
        clickLocation();
        clickOptionLocation();

        return new Location();
    }

    public void clickCars() {
        cars.click();
    }

    public void clickOptionCars() {
        option_cars.click();
    }

    public Cars selectCars() {
        clickCars();
        clickOptionCars();

        return new Cars();
    }
}
