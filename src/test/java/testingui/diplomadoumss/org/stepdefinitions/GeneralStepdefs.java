package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.location.LocationList;

/**
 * @author Miguel A. Quispe Santos
 */
public class GeneralStepdefs {
    private Dashboard dashboard = new Dashboard();

    private LocationList locationList;

    @And("^click on option 'Location' in left panel$")
    public void clickOnOptionLocationInLeftPanel() throws Throwable {
        dashboard.clickOptionLocation();
    }

    @And("^click on option 'Location list'$")
    public void clickOnOptionLocationList() throws Throwable {
        locationList = dashboard.clickLocationList();
    }

    @And("^set field 'Country' with numbers$")
    public void setFieldCountryWithNumbers() throws Throwable {
        locationList.fillCountryWithNumbers();
    }

    @And("^set field 'location' with special chars$")
    public void setFieldLocationWithSpecialChars() throws Throwable {
        locationList.fillLocationWithSpecialChars();
    }

    @And("^set field 'Longitud'$")
    public void setFieldLongitud() throws Throwable {
        locationList.fillLongitud();
    }

    @And("^click on Add button$")
    public void clickOnAddButton() throws Throwable {
        locationList = locationList.clickAddButton();
    }

    @And("^click on option edit in list locations$")
    public void clickOnOptionEditInListLocations() throws Throwable {
        locationList.clickOnOptionEdit();
    }

    @And("^set field 'Longitud' with letters$")
    public void setFieldLongitudWithLetters() throws Throwable {
        locationList.fillLoongitudWithLetters();
    }
}