package testingui.diplomadoumss.org.managepage.accounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class AccountsCustomers extends BasePage {

    @FindBy(xpath = "//div[2]/form/button")
    private WebElement addButon;

    @FindBy(xpath = "//span/a[1]")
    private WebElement editButon;

    @FindBy(xpath = "//span/a[2]")
    private WebElement deleteButon;

    @FindBy(xpath = "//button[text()= '25']")
    private WebElement twentyFiveButon;

    @FindBy(xpath = "//button[text()= '100']")
    private WebElement oneHundredButon;

    @FindBy(xpath = "//a[text()= 'Customers']")
    private WebElement customersOption;

    public AccountsCustomers() {
        avoidToUse(3);
        clickWebElement(customersOption);
    }

    public void clickOn25Option() {
        clickWebElement(twentyFiveButon);
    }

    public void clickOnDeleteOption() {
        clickWebElement(deleteButon);
    }

    public void clickOnAceptarOption() {
        this.clickOnOptionAccept();
    }

    public void clickOnCancelarOption() {
        this.clickOnOptionCancel();
    }

    public void clickOnEditCustomer() {
        clickWebElement(editButon);
    }

    public void clickAddCustomer() {
        clickWebElement(addButon);
    }

    public void clickOnAddButtonToCreateCustomer() {
    }

    public void clickOn100Option() {
        clickWebElement(oneHundredButon);
    }
}
