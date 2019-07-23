package testingui.diplomadoumss.org.managepage.accounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.isWebElementVisible;

/**
 * @author Yerko Manzel
 */
public class Accounts extends BasePage {

    @FindBy(xpath = "//form/button")
    private WebElement btnCreateCustomer;

    public Accounts createCustomer() {
        return selectCreateCustomer(1);
    }

    private Accounts selectCreateCustomer(int position) {
        isWebElementVisible(btnCreateCustomer);
        clickWebElement(btnCreateCustomer);

        return this;
    }
}
