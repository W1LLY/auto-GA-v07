package testingui.diplomadoumss.org.managepage.dashboard;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.cars.Cars;
import testingui.diplomadoumss.org.managepage.cars.CarsSettings;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {
    @FindBy(xpath = "//a[@href='#Cars']")
    private WebElement cars;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement option_cars;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars/settings']")
    private WebElement cars_settings;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
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
    public void clickCars() {
        clickWebElement(cars);
    }

    public void clickOptionCars() {
        clickWebElement(option_cars);
    }

    public void clickOptionCarsSettings() {
        clickWebElement(cars_settings);
    }

    public Cars selectCars() {
        clickCars();
        clickOptionCars();

        return new Cars();
    }

    public CarsSettings selectCarsSettings() throws InterruptedException {
        clickCars();
        fullScreen(true);
        Thread.sleep(2000);
        clickOptionCarsSettings();
        fullScreen(false);

        return new CarsSettings();
    }

    private void fullScreen(boolean isFull) {
        if (isFull)
            DriverManager.getInstance().getWebDriver().manage().window().fullscreen();
        else
            DriverManager.getInstance().getWebDriver().manage().window().maximize();
    }
}
