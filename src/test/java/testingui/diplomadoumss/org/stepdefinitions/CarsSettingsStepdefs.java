package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.CarsSettings;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class CarsSettingsStepdefs {
    private Dashboard dashboard;

    private CarsSettings settings;

    @Given("^I load page of Dashboard$")
    public void iLoadPageOfLogin() {
        dashboard = LoadPage.loadPHPTravelsDashboard();
    }

    @And("^click on Cars and Cars Settings of Left Panel$")
    public void clickOnCarsAndCarsSettingsOfLeftPanel() throws Throwable {
        settings = dashboard.selectCarsSettings();
    }

    @Then("^write new dates in form$")
    public void writeCustomForm() throws Throwable {
        settings = settings.setForm();
    }
}
