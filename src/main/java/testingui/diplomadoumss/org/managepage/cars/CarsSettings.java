package testingui.diplomadoumss.org.managepage.cars;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class CarsSettings extends BasePage {

    @FindBy(xpath = "//select[@class = 'form-control' and @name = 'target']")
    private WebElement target;

    private Select selectTarget;

    @FindBy(xpath = "//input[@name = 'headertitle' and @type = 'text']")
    private WebElement headerTitle;

    @FindBy(xpath = "//input[@name = 'home' and @type = 'text' and @class = 'form-control']")
    private WebElement featuredCars;

    @FindBy(xpath = "//select[@class = 'form-control' and @name = 'homeorder']")
    private WebElement displayOrder;

    private Select selectDisplayOrder;

    @FindBy(xpath = "//input[@name = 'listings' and @type = 'text' and @class = 'form-control']")
    private WebElement listingsCars;

    @FindBy(xpath = "//select[@class = 'form-control' and @name = 'listingsorder']")
    private WebElement displayOrderListings;

    private Select selectDisplayListings;

    @FindBy(xpath = "//input[@name = 'searchresult' and @type = 'text' and @class = 'form-control']")
    private WebElement searchResult;

    @FindBy(xpath = "//select[@class = 'form-control' and @name = 'searchorder']")
    private WebElement displayOrderSearch;

    private Select selectDisplaySearch;

    @FindBy(xpath = "//input[@name = 'related' and @type = 'text' and @class = 'form-control']")
    private WebElement relatedCars;

    @FindBy(xpath = "//input[@name = 'keywords' and @type = 'text' and @class = 'form-control']")
    private WebElement metaKeywords;

    @FindBy(xpath = "//input[@name = 'description' and @type = 'text' and @class = 'form-control']")
    private WebElement metaDescription;

    @FindBy(xpath = "//input[@name = 'minprice' and @type = 'text' and @class = 'form-control']")
    private WebElement minPrice;

    @FindBy(xpath = "//input[@name = 'maxprice' and @type = 'text' and @class = 'form-control']")
    private WebElement maxPrice;

    @FindBy(xpath = "//button[@type = 'submit' and @class = 'btn btn-primary']")
    private WebElement submitGeneral;

    @FindBy(xpath = "//a[@href = '#CARTYPES']")
    private WebElement carTypes;

    @FindBy(xpath = "//button[@data-target = '#ADD_CARS_TYPES']")
    private WebElement addTypeButton;

    @FindBy(xpath = "//*[@id=\"ADD_CARS_TYPES\"]/div[2]/div/form/div[2]/div[1]/div/input")
    private WebElement nameTypeForm;

    @FindBy(xpath = "//*[@id=\"ADD_CARS_TYPES\"]/div[2]/div/form/div[3]/button[2]")
    private WebElement newTypeButton;

    @FindBy(xpath = "//*[@id=\"16\"]")
    private WebElement deleteButton;

    public CarsSettings() {
        avoidToUse(9);
        selectTarget = new Select(target);
        selectDisplayOrder = new Select(displayOrder);
        selectDisplayListings = new Select(displayOrderListings);
        selectDisplaySearch = new Select(displayOrderSearch);

    }

    public CarsSettings setForm() {
        return selectBlankOfTargetOnGeneral(1)
                .setHeaderTitle("My Custom Title of Willy")
                .setFeaturedCars(10)
                .setDisplayOrderFeatures(3)
                .scroll()
                .setListingsCars(11)
                .setDisplayOrderListings(3)
                .setSearchResult(10)
                .setDisplayOrderSearch(3)
                .setRelatedCars(10)
                .setMetaKeywords("Customkeyword")
                .setMetaDescription("Custom description")
                .setMinPrice(50)
                .setMaxPrice(500)
                .clickSubmitButton();
    }

    public CarsSettings selectBlankOfTargetOnGeneral(int position) {
        clickWebElement(target);
        selectedDropdown(selectTarget, position);
        scroll();
        return this;
    }

    public CarsSettings setHeaderTitle(String text) {
        fillWebElement(headerTitle, text);

        return this;
    }

    public CarsSettings setFeaturedCars(int number) {
        fillWebElementNumber(featuredCars, number);

        return this;
    }

    public CarsSettings setDisplayOrderFeatures(int position) {
        clickWebElement(displayOrder);
        selectedDropdown(selectDisplayOrder, position);

        return this;
    }

    public CarsSettings setListingsCars(int number) {
        fillWebElementNumber(listingsCars, number);

        return this;
    }

    public CarsSettings setDisplayOrderListings(int position) {
        clickWebElement(displayOrderListings);
        selectedDropdown(selectDisplayListings, position);

        return this;
    }

    public CarsSettings setSearchResult(int number) {
        fillWebElementNumber(searchResult, number);

        return this;
    }

    public CarsSettings setDisplayOrderSearch(int position) {
        clickWebElement(displayOrderSearch);
        selectedDropdown(selectDisplaySearch, position);

        return this;
    }

    public CarsSettings setRelatedCars(int number) {
        fillWebElementNumber(relatedCars, number);

        return this;
    }

    public CarsSettings setMetaKeywords(String keywords) {
        fillWebElement(this.metaKeywords, keywords);

        return this;
    }

    public CarsSettings setMetaDescription(String description) {
        fillWebElement(metaDescription, description);

        return this;
    }

    public CarsSettings setMinPrice(int quantity) {
        fillWebElementNumber(minPrice, quantity);

        return this;
    }

    public CarsSettings setMaxPrice(int quantity) {
        fillWebElementNumber(maxPrice, quantity);

        return this;
    }

    public CarsSettings clickSubmitButton() {
        clickWebElement(submitGeneral);
        avoidToUse(11);
        return this;
    }

    private CarsSettings scroll() {
        WebDriver driver = DriverManager.getInstance().getWebDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");

        return this;
    }

    public CarsSettings selectTypes() {
        clickWebElement(carTypes);
        return this;
    }

    public CarsSettings clickOnAddNewType() {
        clickWebElement(addTypeButton);
        return this;
    }

    public CarsSettings setNameFormType() {
        avoidToUse(1);
        fillWebElement(nameTypeForm, "New Type Test");
        return this;
    }

    public CarsSettings clickOnAddFormType() {
        clickWebElement(newTypeButton);
        avoidToUse(5);
        return this;
    }

    public CarsSettings clickOnDeleteTypeButton() {
        clickWebElement(deleteButton);

        return this;
    }

    public void clickOnOptionAccept() {
        System.out.println(DriverManager.getInstance().getWebDriver().getWindowHandle());
    }

    public void clickOnNameList() {

    }

    public void clickOnEditButton() {

    }

    public void clickOnAllTypesCheckbox() {

    }
}
