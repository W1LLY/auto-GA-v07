package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import testingui.diplomadoumss.org.managefile.ManageFile;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.Cars;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.header.Header;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Cars cars;
    private Header header = new Header();
    private Json files = ManageFile.getInstance().getJsonFile("simplejson.json");

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        cars = dashboard.selectCars();
    }

    @And("^fill \"([^\"]*)\" email field on 'Login' page$")
    public void fillEmailFieldOnLoginPage(String email) throws Throwable {
        login.setEmail(email);
    }

    @And("^fill \"([^\"]*)\" password field on 'Login' page$")
    public void fillPasswordFieldOnLoginPage(String password) throws Throwable {
        login.setPassword(password);
    }

    @Then("^verify the \"([^\"]*)\" label button is displayed on 'Login' page$")
    public void verifyTheLabelButtonIsDisplayedOnLoginPage(String loginLabelButton) throws Throwable {
        String loginLabelButtonCurrent = login.getLoginLabelButton();

        Assert.assertEquals(loginLabelButtonCurrent, loginLabelButton, "Login page is verifying the 'LOGIN' label button.");
    }

    @And("^click 'Logout' button on 'Header' page$")
    public void clickLogoutButtonOnHeaderPage() throws Throwable {
        header.logoutLink();
    }

    @And("^fill email field using json file on 'Login' page$")
    public void fillEmailFieldUsingJsonFileOnLoginPage() throws Throwable {

    }
}
