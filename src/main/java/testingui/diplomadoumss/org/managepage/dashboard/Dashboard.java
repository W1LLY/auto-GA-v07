package testingui.diplomadoumss.org.managepage.dashboard;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.cars.CarsCars;
import testingui.diplomadoumss.org.managepage.cars.CarsExtras;
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

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin/cars']")
    private WebElement option_cars;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars/settings']")
    private WebElement cars_settings;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin/cars/extras']")
    private WebElement option_extras;

    @FindBy(xpath = "//a[@id = '14' and @title = 'DELETE']")
    private WebElement deleteButton;


    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(5);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public Dashboard clickExtraExpand() {
        clickWebElement(option_extras);
        return this;
    }

    public Dashboard clickCarsCars() {
        clickWebElement(option_extras);
        return this;
    }

    public CarsCars clickDeleteButton() {
        clickWebElement(deleteButton);
        return new CarsCars();
    }

    public void clickCars() {
        clickWebElement(cars);
    }

    public CarsCars selectOptionCarsCars() throws InterruptedException {
        clickWebElement(option_cars);
        avoidToUse(3);
        return new CarsCars();
    }

    public CarsExtras selectOptionCarsExtras() throws InterruptedException {
        clickCars();
        Thread.sleep(2000);
        clickWebElement(option_extras);
        return new CarsExtras();
    }

    public void clickOptionCarsSettings() {
        clickWebElement(cars_settings);
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
