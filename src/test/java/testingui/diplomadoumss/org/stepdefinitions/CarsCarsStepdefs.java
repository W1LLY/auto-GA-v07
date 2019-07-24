package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.CarsCars;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;

/**
 * @author Juan Montaño
 */
public class CarsCarsStepdefs {
    private Dashboard dashboard;

    private CarsCars carsCars;

    @Given("^I load page admi$")
    public void iLoadPageAdmi() throws Throwable {
        dashboard = LoadPage.loadPHPTravelsDashboard();
    }

    @And("^click 'CARS' link over 'left panel' page$")
    public void clickCARSLinkOverLeftPanelPage() throws Throwable {
        dashboard.clickCarsExpand();
    }


    @When("^click 'CARS' sub link over 'left panel' page$")
    public void clickCARSSubLinkOverLeftPanelPage() throws Throwable {
        dashboard.selectOptionCarsCars();
    }
}
