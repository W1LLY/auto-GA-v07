package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.managepage.accounts.Accounts;
import testingui.diplomadoumss.org.managepage.dashboard.CustomersDashboard;

/**
 * @author Yerko Manzel
 */
public class CustomersStepdefs {
    private CustomersDashboard customersDashboard;

    private Accounts accounts;

    @And("^expand 'Account' option on on 'Left Panel' page$")
    public void expandAccountOptionOnOnLeftPanelPage() {
        customersDashboard = customersDashboard.clickAccounts();
    }

    @And("^click 'Customer' link on 'Account' panel$")
    public void clickCustomerLinkOnAccountPanel() {
        accounts = customersDashboard.clickCustomerLink();
    }
}
