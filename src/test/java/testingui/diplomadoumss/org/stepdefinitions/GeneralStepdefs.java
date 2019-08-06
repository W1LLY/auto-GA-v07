package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.managepage.accounts.AccountsCustomers;
import testingui.diplomadoumss.org.managepage.accounts.GuestCustomers;
import testingui.diplomadoumss.org.managepage.cars.CarsCars;
import testingui.diplomadoumss.org.managepage.cars.CarsExtras;
import testingui.diplomadoumss.org.managepage.cars.CarsSettings;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.location.LocationList;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class GeneralStepdefs {
    private Dashboard dashboard = new Dashboard();
    private AccountsCustomers accountsCustomers;
    private CarsSettings settings;
    private GuestCustomers guestCustomers;
    private CarsExtras carsExtras;
    private CarsCars carsCars;

    private LocationList locationList;

    @And("^click on option 'Location' in left panel$")
    public void clickOnOptionLocationInLeftPanel() throws Throwable {
        dashboard.clickOptionLocation();
    }

    @And("^click on option 'Location list'$")
    public void clickOnOptionLocationList() throws Throwable {
        locationList = dashboard.clickLocationList();
    }

    @And("^set field 'Country' with numbers$")
    public void setFieldCountryWithNumbers() throws Throwable {
        locationList.fillCountryWithNumbers();
    }

    @And("^set field 'location' with special chars$")
    public void setFieldLocationWithSpecialChars() throws Throwable {
        locationList.fillLocationName("*çªº?$#");
    }

    @And("^set field 'Longitud'$")
    public void setFieldLongitud() throws Throwable {
        locationList.fillLongitud("-58.381559100000004");
    }

    @And("^click on Add button$")
    public void clickOnAddButton() throws Throwable {
        locationList = locationList.clickAddButton();
    }

    @And("^click on option edit in list locations$")
    public void clickOnOptionEditInListLocations() throws Throwable {
        locationList.clickOnOptionEdit();
    }

    @And("^set field 'Longitud' with letters$")
    public void setFieldLongitudWithLetters() throws Throwable {
        locationList.fillLongitud("ABCDEFGHI");
    }

    @And("^click on option 'Add' to add new location$")
    public void clickOnOptionAddToAddNewLocation() throws Throwable {
        locationList.clickOnAddLocation();
    }

    @And("^select any country$")
    public void selectAnyCountry() throws Throwable {
        locationList.selectAnyCountry();
    }

    @And("^set name of location$")
    public void setNameOfLocation() throws Throwable {
        locationList.fillLocationName("Buenos Aires, Argentina");
    }

    @And("^set field 'Latitude'$")
    public void setFieldLatitude() throws Throwable {
        locationList.fillLatitude("ABCDEFGHI");
    }

    @And("^set field 'Farsi' with special chars and numbers$")
    public void setFieldFarsiWithSpecialCharsAndNumbers() throws Throwable {
        locationList.fillFieldFarsi("*çªº?$#1234567");
    }

    @And("^set field 'Russian' with special chars and numbers$")
    public void setFieldRussianWithSpecialCharsAndNumbers() throws Throwable {
        locationList.fillFieldRussian("*çªº?$#1234567");
    }

    @And("^set field 'French' with special chars and numbers$")
    public void setFieldFrenchWithSpecialCharsAndNumbers() throws Throwable {
        locationList.fillFieldFrench("*çªº?$#1234567");
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

    @And("^click 'CARS' link on 'Left Panel'$")
    public void clickCARSLinkOnLeftPanel() throws Throwable {
        dashboard.clickCarsExpand();
    }

    @And("^click 'EXTRAS' link on 'left panel'$")
    public void clickEXTRASLinkOnLeftPanel() throws Throwable {
        carsExtras = dashboard.selectOptionCarsExtras();
    }

    @And("^click 'Edit' link on icon 'right panel'$")
    public void clickEditLinkOnIconRightPanel() throws Throwable {
        carsExtras = carsExtras.clickeditIcon();
    }

    @And("^update \"([^\"]*)\" name field on 'form edit' page$")
    public void updateNameFieldOnFormEditPage(String name) throws Throwable {
        carsExtras.updateName(name);
    }

    @And("^update \"([^\"]*)\" price field on 'form edit' page$")
    public void updatePriceFieldOnFormEditPage(String price) throws Throwable {
        carsExtras.updatePrice(price);
    }

    @And("^click 'SAVE&RETURN' button to save$")
    public void clickSAVERETURNButtonToSave() throws Throwable {
        carsExtras.clickButtonSaveReturn();
    }

    @And("^click 'ADD' button añadir$")
    public void clickADDButtonAniadir() throws Throwable {
        carsExtras.clickAddButton();
    }

    @And("^fill \"([^\"]*)\" name field on 'form add'$")
    public void fillNameFieldOnFormAdd(String name) throws Throwable {
        carsExtras.updateName(name);
    }

    @And("^fill \"([^\"]*)\" price field on 'form add'$")
    public void fillPriceFieldOnFormAdd(String price) throws Throwable {
        carsExtras.updatePrice(price);
    }

    @And("^click 'Icon delete'' link delete extras$")
    public void clickIconDeleteLinkDeleteExtras() throws Throwable {
        carsExtras.clickButtonDelete();
    }

    @And("^Click opcion Accept ''pop pup''$")
    public void clickOpcionAcceptPopPup() throws Throwable {
        carsExtras.clickAcceptPoppup();
    }

    @And("^click 'CARS' link opcion cars-cars$")
    public void clickCARSLinkOpcionCarsCars() throws Throwable {
        carsCars = dashboard.selectOptionCarsCars();
    }

    @And("^click 'Icon edit' opcion edit car$")
    public void clickIconEditOpcionEditCar() throws Throwable {
        carsCars.clickEditButton();
    }

    @And("^fill \"([^\"]*)\" field on formulario edit$")
    public void fillFieldOnFormularioEdit(String carName) throws Throwable {
        carsCars.fillFieldCarName(carName);
    }

    @And("^click 'Icon delete' opcion delete car$")
    public void clickIconDeleteOpcionDeleteCar() throws Throwable {
        carsCars.clickDeleteButton();
    }

    @And("^click 'Acept' opcion on pop pup$")
    public void clickAceptOpcionOnPopPup() throws Throwable {
        carsCars.clickAcceptPoppup();
    }

    @And("^click 'ADD' link opcion add car$")
    public void clickADDLinkOpcionAddCar() throws Throwable {
        carsCars.clickButtonAdd();
    }

    @And("^click 'Submit' button to add car$")
    public void clickSubmitButtonToAddCar() throws Throwable {
        carsCars.clickButtonSubmit();
    }
}