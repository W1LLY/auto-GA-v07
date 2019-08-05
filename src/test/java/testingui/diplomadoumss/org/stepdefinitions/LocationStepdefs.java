package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.core.TestContext;
import testingui.diplomadoumss.org.managepage.dashboard.LocationManagement;

/**
 * @author Miguel A. Quispe Santos
 */
public class LocationStepdefs {
    TestContext context;
    LocationManagement locationManagement;

    public LocationStepdefs(TestContext context) {
        this.context = context;
        locationManagement = context.getPageObjectManager().getReviewsManagePage();
    }

    @And("^click 'Location' link on 'Left Panel' page$")
    public void clickLocationLinkOnLeftPanelPage() {
        locationManagement.clickLocationManageBoard();
    }
}
