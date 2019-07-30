package testingui.diplomadoumss.org.manageloadpage;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.nasa.home.Nasa;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class LoadPage {

    public static Login loadPHPTravels() {
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());

        return new Login();
    }

    public static Nasa loadNasaAPI() {
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());

        return new Nasa();
    }
}
