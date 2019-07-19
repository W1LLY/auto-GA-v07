package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cards.Cars;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.location.Location;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepdefs {
    private Login login;

    private Dashboard dashboard;

    private Cars cars;

    private Location location;

    @Given("^I load PHP Travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^Set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
        Thread.sleep(11000);
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        cars = dashboard.selectCars();
    }

    @And("^click 'Location' link on 'Left Panel' page$")
    public void clickLocationLinkOnLeftPanelPage() throws Throwable {
        location = dashboard.selectLocation();
    }
}
