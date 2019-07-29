package testingui.diplomadoumss.org.managepage.cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Juan Montaño
 */
public class CarsExtras extends BasePage {

    @FindBy(xpath = "//a[@class = 'btn btn-success xcrud-action' and @href = 'javascript:;']")
    private WebElement addButton;

    public CarsExtras() {
        avoidToUse(3);
    }

    public CarsExtras clickAddButton() {
        clickWebElement(addButton);
        return this;
    }
}
