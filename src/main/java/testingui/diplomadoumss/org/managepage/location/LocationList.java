package testingui.diplomadoumss.org.managepage.location;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Miguel A. Quispe Santos
 */
public class LocationList extends BasePage {

    @FindBy(xpath = "//a[@href = '#LocationList']")
    private WebElement locationList;

    @FindBy(xpath = "//input[@href = '#Country']")
    private WebElement countryField;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin/locations/add']")
    private WebElement addButton;

    @FindBy(xpath = "//input[@id='location']")
    private WebElement locationName;

    @FindBy(xpath = "//*[@id='s2id_autogen1']/a")
    private WebElement countrySelect;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li[6]/div")
    private WebElement optionArgentina;

    @FindBy(xpath = "//input[@name = 'longitude' and @type = 'text']")
    private WebElement fieldLongitude;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/button")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[8]/span/a[1]")
    private WebElement anyEdit;

    @FindBy(xpath = "//input[@name = 'latitude']")
    private WebElement fieldLatitude;

    @FindBy(xpath = "//input[@name = 'translated[fa][name]']")
    private WebElement fieldFarsi;

    @FindBy(xpath = "//input[@name = 'translated[ru][name]']")
    private WebElement fieldRussian;

    @FindBy(xpath = "//input[@name = 'translated[fr][name]']")
    private WebElement fieldFrench;

    public LocationList() {
        avoidToUse(5);
    }


    public void fillCountryWithNumbers() {
        fillWebElement(countryField, "1234");
    }

    public void fillLocationName(String val) {
        fillWebElement(locationName, val);
    }

    public void fillLongitud(String val) {
        fillWebElement(fieldLongitude, val);
    }

    public LocationList clickAddButton() {
        scroll();
        clickWebElement(submitButton);
        avoidToUse(5);
        return this;
    }

    public void clickOnOptionEdit() {
        clickWebElement(anyEdit);
        avoidToUse(3);
    }

    public void clickOnAddLocation() {
        clickWebElement(addButton);
    }

    public void selectAnyCountry() {
        clickWebElement(countrySelect);
        avoidToUse(1);
        clickWebElement(optionArgentina);
    }

    private void scroll() {
        WebDriver driver = DriverManager.getInstance().getWebDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
    }

    public void fillLatitude(String val) {
        fillWebElement(fieldLatitude, val);
    }

    public void fillFieldFarsi(String val) {
        fillWebElement(fieldFarsi, val);
    }

    public void fillFieldRussian(String val) {
        fillWebElement(fieldRussian, val);
    }

    public void fillFieldFrench(String val) {
        fillWebElement(fieldFrench, val);
    }
}
