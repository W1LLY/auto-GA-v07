package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.managepage.accounts.AccountsCustomers;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class GeneralStepdefs {
    private Dashboard dashboard = new Dashboard();

    private AccountsCustomers accountsCustomers;


    @And("^click on option 'Accounts' in left panel$")
    public void clickOnOptionAccountsInLeftPanel() throws Throwable {
        dashboard.clickOptionAccounts();
    }

    @And("^click on option 'Customers'$")
    public void clickOnOptionCustomers() throws Throwable {
        accountsCustomers = dashboard.clickOnCustomers();
    }

    @And("^click on option twenty five in list$")
    public void clickOnOptionTwentyFiveInList() throws Throwable {
        accountsCustomers.clickOn25Option();
    }

    @And("^click on option delete in any customer of list$")
    public void clickOnOptionDeleteInAnyCustomerOfList() throws Throwable {
        accountsCustomers.clickOnDeleteOption();
    }

    @And("^click on Aceptar in confirmation panel$")
    public void clickOnAceptarInConfirmationPanel() throws Throwable {
        accountsCustomers.clickOnAceptarOption();
    }

    @And("^click on Cancelar in confirmation panel$")
    public void clickOnCancelarInConfirmationPanel() throws Throwable {
        accountsCustomers.clickOnCancelarOption();
    }

    @And("^click on option edit in any customer of list$")
    public void clickOnOptionEditInAnyCustomerOfList() throws Throwable {
        accountsCustomers.clickOnEditCustomer();
    }

    @And("^click on option 'Add'$")
    public void clickOnOptionAdd() throws Throwable {
        accountsCustomers.clickAddCustomer();
    }

    @And("^click on button Add in form to create customer$")
    public void clickOnButtonAddInFormToCreateCustomer() throws Throwable {
        accountsCustomers.clickOnAddButtonToCreateCustomer();
    }

    @And("^click on option one hundred in list$")
    public void clickOnOptionOneHundredInList() throws Throwable {
        accountsCustomers.clickOn100Option();
    }

    @And("^click on option 'All' in list$")
    public void clickOnOptionAllInList() throws Throwable {
        accountsCustomers.clickOnAllOption();
    }

    @And("^select any country on form edit customer$")
    public void selectAnyCountryOnFormEditCustomer() throws Throwable {
        accountsCustomers.clickOnAnyCountry();
    }
}