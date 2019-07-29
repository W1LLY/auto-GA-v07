package testingui.diplomadoumss.org.managepage.location;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.fillWebElement;

/**
 * @author Miguel A. Quispe Santos
 */
public class LocationList extends BasePage {

    @FindBy(xpath = "//a[@href = '#LocationList']")
    private WebElement locationList;

    @FindBy(xpath = "//input[@href = '#Country']")
    private WebElement countryField;

    public LocationList() {
        avoidToUse(5);
    }


    public void fillCountryWithNumbers() {
        fillWebElement(countryField, "1234");
    }

    public void fillLocationWithSpecialChars() {
    }

    public void fillLongitud() {
    }

    public LocationList clickAddButton() {
        return this;
    }

    public void clickOnOptionEdit() {
    }

    public void fillLoongitudWithLetters() {
    }
}
