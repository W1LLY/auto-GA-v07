package testingui.diplomadoumss.org;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Juan Montaño
 */
public class LoginStepdefs {
    private Login login;

    private Dashboard dashboard;

    @Given("^I load PHP Travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^Set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickCarsExpand();
    }

    @When("^click 'extras' link on 'Left Panel' page$")
    public void clickExtrasLinkOnLeftPanelPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dashboard.clickExtraExpand();

    }
}
