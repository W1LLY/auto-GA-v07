package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.cars.Car;

/**
 * @author Juan
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu' and @class='list-unstyled components']")
    private WebElement leftPanel;

    @FindBy(xpath = "//a[@href='#Car']")
    private WebElement cars;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement option_cars;

    public void clickCars() {
        cars.click();
    }

    public void clickOptionCars() {
        option_cars.click();
    }

    public Car selectCars() {
        clickCars();
        clickOptionCars();

        return new Car();
    }
}
