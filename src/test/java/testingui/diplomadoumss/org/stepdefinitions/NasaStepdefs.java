package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.Nasa.Earth;
import testingui.diplomadoumss.org.managepage.Nasa.Nasa;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Yerko Manzel
 */
public class NasaStepdefs {
    private Dashboard dashboard;
    private Nasa nasa;
    private Earth earth;

    @Given("^I load Nasa Open APIs$")
    public void iLoadNasaOpenAPIs() throws Throwable {
        LoadPage.loadNasaDashboard();
    }

    @And("^Show nasa Listing$")
    public void showNasaListing() throws Throwable {
        LoadPage.loadNasaApi();
    }

    @And("^Click Earth$")
    public void clickEarth() throws Throwable {
        earth= nasa.clickEarth();
    }
}
