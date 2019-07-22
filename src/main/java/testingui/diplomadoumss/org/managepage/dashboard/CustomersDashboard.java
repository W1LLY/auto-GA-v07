package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.accounts.Accounts;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Yerko Manzel
 */
public class CustomersDashboard extends BasePage {


    @FindBy(xpath = "//ul[@id='social-sidebar-menu' and @class='list-unstyled components']")
    private WebElement leftPanel;

    @FindBy(xpath = "//a[@href='#ACCOUNTS']")
    private WebElement accounts;

    @FindBy(xpath = "//a[text()='Customers']")
    private WebElement customersLink;

    public CustomersDashboard clickAccounts() {
        clickWebElement(accounts);
        return this;
    }


    public Accounts clickCustomerLink() {
        avoidToUse(1);
        isWebElementVisible(customersLink);
        clickWebElement(customersLink);
        return new Accounts();
    }

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Accounts') and @aria-expanded='false']")
    private WebElement accountsExpand;

    public CustomersDashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public CustomersDashboard clickCarsExpand() {
        clickWebElement(accountsExpand);
        return this;
    }
}
