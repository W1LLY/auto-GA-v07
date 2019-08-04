package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.CarsCars;
import testingui.diplomadoumss.org.managepage.cars.CarsExtras;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.header.Header;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Juan Montaño
 */
public class generalStepdefs {
    private Login login;
    private Dashboard dashboard;
    private CarsExtras carsExtras;
    private CarsCars carsCars;
    private Header header = new Header();


    @Given("^I load PHPTravels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set credencials  on 'Login' page$")
    public void setCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
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

    @And("^click 'Logout' button on 'Header' page$")
    public void clickLogoutButtonOnHeaderPage() throws Throwable {
        header = header.logoutLink();
    }

    @And("^click 'ADD' button añadir$")
    public void clickADDButtonAñadir() throws Throwable {
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
