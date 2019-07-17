package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.cars.Cars;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//a[@href='#Cars']")
    private WebElement cars;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement option_cars;

    public Dashboard() {

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