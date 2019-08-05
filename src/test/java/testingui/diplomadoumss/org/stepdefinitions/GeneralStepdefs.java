package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.managepage.accounts.AccountsCustomers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.accounts.GuestCustomers;
import testingui.diplomadoumss.org.managepage.cars.CarsSettings;
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
      
    private CarsSettings settings;

    private GuestCustomers guestCustomers;

    @Given("^I load page of Dashboard$")
    public void iLoadPageOfLogin() {
        dashboard = LoadPage.loadPHPTravelsDashboard();
    }


    @And("^click on option 'Cars' in Left Panel$")
    public void clickOnOptionCarsInLeftPanel() throws Throwable {
        dashboard.clickCars();
    }

    @And("^click on Cars Settings$")
    public void clickOnCarsSettings() throws Throwable {
        settings = dashboard.clickOptionCarsSettings();
    }

    @Then("^write new dates in form$")
    public void writeCustomForm() throws Throwable {
        settings = settings.setForm();
    }

    @And("^click on tab 'Types' of 'Cars Settings'$")
    public void clickOnTabTypesOfCarsSettings() throws Throwable {
        settings = settings.selectTypes();
    }

    @And("^click on 'Add' in list types$")
    public void clickOnAddInListTypes() throws Throwable {
        settings = settings.clickOnAddNewType();
    }

    @And("^set new name on 'Form Type'$")
    public void setNewNameOnFormType() throws Throwable {
        settings = settings.setNameFormType();
    }

    @And("^click on 'Add' in form create new Type$")
    public void clickOnAddInFormCreateNewType() throws Throwable {
        settings = settings.clickOnAddFormType();
    }

    @Then("^click on icon X from something type in list types$")
    public void clickOnIconXFromSomethingTypeInListTypes() throws Throwable {
        settings = settings.clickOnDeleteTypeButton();
    }

    @And("^click on option Aceptar in panel dialog$")
    public void clickOnOptionAceptarInPanelDialog() throws Throwable {
        settings.clickOnOptionAccept();
    }

    @And("^click on 'Name' in list of types$")
    public void clickOnNameInListOfTypes() throws Throwable {
        settings.clickOnNameList();
    }

    @And("^click on icon of edition in any type of list$")
    public void clickOnIconOfEditionInAnyTypeOfList() throws Throwable {
        settings.clickOnEditButton();
    }

    @And("^click on checkbox for select all types$")
    public void clickOnCheckboxForSelectAllTypes() throws Throwable {
        settings.clickOnAllTypesCheckbox();
    }

    @And("^click on option 'Accounts' in left panel$")
    public void clickOnOptionAccountsInLeftPanel() throws Throwable {
        dashboard.clickAccounts();
    }

    @And("^click on option 'GuestCustomers'$")
    public void clickOnOptionGuestCustomers() throws Throwable {
        guestCustomers = dashboard.clickGuestCustomers();
    }

    @And("^click on add new Customer$")
    public void clickOnAddNewCustomer() throws Throwable {
        guestCustomers.clickOnAddNewCustomer();
    }

    @And("^click on Close button$")
    public void clickOnCloseButton() throws Throwable {
        settings.clickOnCloseForm();
    }

    @And("^click on tab 'Payment Method' of 'Cars Settings'$")
    public void clickOnTabPaymentMethodOfCarsSettings() throws Throwable {
        settings.clickOnTabPayment();
    }

    @And("^click on 'Submit' button$")
    public void clickOnSubmitButton() throws Throwable {
        guestCustomers.clickSubmitButton();
    }

    @And("^set lastName in form$")
    public void setLastNameInForm() throws Throwable {
        guestCustomers.fillLastName();
    }

    @And("^set email in form$")
    public void setEmailInForm() throws Throwable {
        guestCustomers.fillEmail();
    }

    @And("^set password in form$")
    public void setPasswordInForm() throws Throwable {
        guestCustomers.fillPassword();
    }

    @And("^select Country in form$")
    public void selectCountryInForm() throws Throwable {
        guestCustomers.selectCountry();
    }
}