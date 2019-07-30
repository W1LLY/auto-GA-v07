package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.nasa.DashboardNasa;

/**
 * @author Juan Montaño
 */
public class ImageryStepdefs {

    private DashboardNasa dashboardNasa;


    @Given("^cargar pagina nasa$")
    public void cargarPaginaNasa() throws Throwable {
        dashboardNasa = LoadPage.loadNasaPage();
    }

    @And("^Click opcion NASA API Listing$")
    public void clickOpcionNASAAPIListing() throws Throwable {
        dashboardNasa.clickNasaListener();
    }

    @And("^Click opcion NASA API Listing(\\d+)$")
    public void clickOpcionNASAAPIListing(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dashboardNasa.clickNasaListener();
    }

    @And("^Click opcion Earth$")
    public void clickOpcionEarth() throws Throwable {
        dashboardNasa.clickOptionEarth();
    }

    @And("^Cick opcion Imagery$")
    public void cickOpcionImagery() throws Throwable {
        dashboardNasa.clickOptionImagery();
    }
}
