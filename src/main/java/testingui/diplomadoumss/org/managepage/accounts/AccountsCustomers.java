package testingui.diplomadoumss.org.managepage.accounts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class AccountsCustomers extends BasePage {

    @FindBy(xpath = "//div[2]/form/button")
    private WebElement addButon;

    @FindBy(xpath = "//span/a[1]")
    private WebElement editButon;

    @FindBy(xpath = "//span/a[2]")
    private WebElement deleteButon;

    @FindBy(xpath = "//button[text()= '25']")
    private WebElement twentyFiveButon;

    @FindBy(xpath = "//button[text()= '100']")
    private WebElement oneHundredButon;

    @FindBy(xpath = "//a[text()= 'Customers']")
    private WebElement customersOption;

    @FindBy(xpath = "//button[text()= 'All']")
    private WebElement allOption;

    @FindBy(xpath = "//*[@id='s2id_autogen1']/a")
    private WebElement selectCountry;

    @FindBy(xpath = "//*[@id='select2-drop']/ul/li[6]/div")
    private WebElement optionArgentina;

    @FindBy(xpath = "//button[text()= 'Submit']")
    private WebElement submitButton;

    public AccountsCustomers() {
        avoidToUse(3);
        clickWebElement(customersOption);
    }

    public void clickOn25Option() {
        clickWebElement(twentyFiveButon);
    }

    public void clickOnDeleteOption() {
        clickWebElement(deleteButon);
    }

    public void clickOnAceptarOption() {
        this.clickOnOptionAccept();
    }

    public void clickOnCancelarOption() {
        this.clickOnOptionCancel();
    }

    public void clickOnEditCustomer() {
        clickWebElement(editButon);
    }

    public void clickAddCustomer() {
        clickWebElement(addButon);
    }

    public void clickOnAddButtonToCreateCustomer() {
        scroll();
        avoidToUse(2);
        clickWebElement(submitButton);
        avoidToUse(10);
    }

    public void clickOn100Option() {
        clickWebElement(oneHundredButon);
    }

    public void clickOnAllOption() {
        clickWebElement(allOption);
    }

    public void clickOnAnyCountry() {
        clickWebElement(selectCountry);
        clickWebElement(optionArgentina);
    }

    private void scroll() {
        WebDriver driver = DriverManager.getInstance().getWebDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
    }
}
