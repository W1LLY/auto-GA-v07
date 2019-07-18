package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.cars.Cars;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//a[@href='#Cars']")
    private WebElement cars;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement option_cars;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    public Dashboard() {
        //isWebElementVisible(bookingLink);
        avoidToUse(10000);
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