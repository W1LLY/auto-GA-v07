package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.CarsCars;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;

/**
 * @author Juan Montaño
 */
public class CarsCarsDeleteStepdefs {

    private Dashboard dashboard;
    private CarsCars carsCars;

    @Given("^I load page from Dashboard$")
    public void iLoadPageFromDashboard() throws Throwable {
        dashboard = LoadPage.loadPHPTravelsDashboard();
    }

    @And("^click on Cars and Cars Cars of Left Panel$")
    public void clickOnCarsAndCarsCarsOfLeftPanel() throws Throwable {
        carsCars = dashboard.selectOptionCarsCars();
    }

    @And("^click 'Icon delete'$")
    public void clickIconDelete() throws Throwable {
        carsCars.clickDeleteButton();
    }

    @And("^click option accept of pop pup$")
    public void clickOptionAcceptOfPopPup() throws Throwable {
        DriverManager.getInstance().getWebDriver().switchTo().alert().accept();
    }
}
