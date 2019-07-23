package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.accounts.Accounts;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;

/**
 * @author Yerko Manzel
 */
public class CustomersStepdefs {
    private Dashboard dashboard;

    private Accounts accounts;

    @Given("^I load page of Dashboard$")
    public void iLoadPageOfLogin() {
        dashboard = LoadPage.loadPHPTravelsDashboard();
    }

    @And("^expand 'Account' option and Customer settings on 'Left Panel' page$")
    public void expandAccountOptionOnOnLeftPanelPage() throws Throwable {
        accounts = dashboard.selectCustomerSettings();
    }

    @And("^add new Customer$")
    public void addNewCustomer() throws Throwable {
        accounts = accounts.createCustomer();
    }
}
