package testingui.diplomadoumss.org.managepage.cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Juan Montaño
 */
public class CarsCars extends BasePage {

    @FindBy(xpath = "//a[@id = '10' and @title = 'DELETE']")
    private WebElement deleteButton;

    public CarsCars() {
        avoidToUse(5);
    }

    public CarsCars clickDeleteButton() {
        clickWebElement(deleteButton);
        return this;
    }
}
