package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.managepage.dashboard.LocationManagement;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Miguel A. Quispe Santos
 */
public class PageObjectManager {
    WebDriver webDriver;
    Login login;
    LocationManagement locationManagement;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Login getLoginPage() {
        return (login == null) ? new Login(webDriver) : login;
    }

    public LocationManagement getReviewsManagePage() {
        return (locationManagement == null) ? new LocationManagement(webDriver) : locationManagement;
    }
}
