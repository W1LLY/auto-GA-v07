package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.CarsCars;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;

/**
 * @author Juan Montaño
 */
public class CarsCarsDeleteStepdefs {

    private Dashboard dashboard;
    private CarsCars carsCars;

    @Given("^I have list of Cars$")
    public void iHaveListOfCars() throws Throwable {
        dashboard = dashboard = LoadPage.loadPHPTravelsDashboard();
        dashboard.clickCarsExpand();
        dashboard.clickOptionCars();
    }

    @And("^click 'Icon delete'$")
    public void clickIconDelete() throws Throwable {
        dashboard.clickDeleteButton();
    }

    @And("^click 'Aceptar' on pop pup$")
    public void clickAceptarOnPopPup() throws Throwable {
    }
}
