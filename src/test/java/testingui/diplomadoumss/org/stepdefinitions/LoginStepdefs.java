package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.json.Json;
import testingui.diplomadoumss.org.core.TestContext;
import testingui.diplomadoumss.org.managefile.ManageFile;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.header.Header;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    TestContext context;
    private Login login;
    private Dashboard dashboard;
    private Header header = new Header();
    private Json files = ManageFile.getInstance().getJsonFile("simplejson.json");

    public LoginStepdefs(TestContext context) {
        this.context = context;
        login = context.getPageObjectManager().getLoginPage();
    }

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login.loadPHPTravels();
    }

    @And("^set my credencials at 'Login php travel' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

//    @And("^click 'Cars' link on 'Left Panel' page$")
//    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
//        dashboard.clickCarsExpand();
//    }
//
//    @And("^fill \"([^\"]*)\" email field on 'Login' page$")
//    public void fillEmailFieldOnLoginPage(String email) throws Throwable {
//        login.setEmail(email);
//    }
//
//    @And("^fill \"([^\"]*)\" password field on 'Login' page$")
//    public void fillPasswordFieldOnLoginPage(String password) throws Throwable {
//        login.setPassword(password);
//    }
//
//    @Then("^verify the \"([^\"]*)\" label button is displayed on 'Login' page$")
//    public void verifyTheLabelButtonIsDisplayedOnLoginPage(String loginLabelButton) throws Throwable {
//        String loginLabelButtonCurrent = login.getLoginLabelButton();
//
//        Assert.assertEquals(loginLabelButtonCurrent, loginLabelButton, "Login page is verifying the 'LOGIN' label button.");
//    }
//
//    @And("^click 'Logout' button on 'Header' page$")
//    public void clickLogoutButtonOnHeaderPage() throws Throwable {
//        header.logoutLink();
//    }
//
//    @And("^fill email field using json file on 'Login' page$")
//    public void fillEmailFieldUsingJsonFileOnLoginPage() throws Throwable {
//
//    }
}
