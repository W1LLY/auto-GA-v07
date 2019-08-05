package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.location.LocationList;

/**
 * @author Willy Kelvis Sanchez Rojas
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
        locationList.fillLocationName("*çªº?$#");
    }

    @And("^set field 'Longitud'$")
    public void setFieldLongitud() throws Throwable {
        locationList.fillLongitud("-58.381559100000004");
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
        locationList.fillLongitud("ABCDEFGHI");
    }

    @And("^click on option 'Add' to add new location$")
    public void clickOnOptionAddToAddNewLocation() throws Throwable {
        locationList.clickOnAddLocation();
    }

    @And("^select any country$")
    public void selectAnyCountry() throws Throwable {
        locationList.selectAnyCountry();
    }

    @And("^set name of location$")
    public void setNameOfLocation() throws Throwable {
        locationList.fillLocationName("Buenos Aires, Argentina");
    }

    @And("^set field 'Latitude'$")
    public void setFieldLatitude() throws Throwable {
        locationList.fillLatitude("ABCDEFGHI");
    }

    @And("^set field 'Farsi' with special chars and numbers$")
    public void setFieldFarsiWithSpecialCharsAndNumbers() throws Throwable {
        locationList.fillFieldFarsi("*çªº?$#1234567");
    }

    @And("^set field 'Russian' with special chars and numbers$")
    public void setFieldRussianWithSpecialCharsAndNumbers() throws Throwable {
        locationList.fillFieldRussian("*çªº?$#1234567");
    }

    @And("^set field 'French' with special chars and numbers$")
    public void setFieldFrenchWithSpecialCharsAndNumbers() throws Throwable {
        locationList.fillFieldFrench("*çªº?$#1234567");
    }
}