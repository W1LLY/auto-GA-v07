package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.CarsExtras;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;

/**
 * @author Juan Montaño
 */
public class CarsExtrasAdd {
    private Dashboard dashboard;
    private CarsExtras carsExtras;

    @Given("^I load page from Dashboard(\\d+)$")
    public void iLoadPageFromDashboard2(int arg0) throws Throwable {
        dashboard = LoadPage.loadPHPTravelsDashboard();
    }

    @And("^click on Cars and Cars->Cars of Left Panel$")
    public void clickOnCarsAndCarsCarsOfLeftPanel() throws Throwable {
        carsExtras = dashboard.selectOptionCarsExtras();
    }

    @And("^click 'Opcion ADD'$")
    public void clickOpcionADD() throws Throwable {
        carsExtras.clickAddButton();
    }
}
