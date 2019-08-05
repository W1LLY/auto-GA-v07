package testingui.diplomadoumss.org.managepage.accounts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class GuestCustomers extends BasePage {

    @FindBy(xpath = "//*[@id='content']/div[2]/form/button")
    private WebElement addCustomerButton;

    @FindBy(xpath = "//*[@id='content']/form/div/div[3]/button")
    private WebElement submitButton;

    @FindBy(xpath = "//input[@name = 'lname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name = 'email' and @type = 'email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name = 'password' and @type = 'password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"s2id_autogen1\"]/a")
    private WebElement country;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li[6]/div")
    private WebElement argentinaOption;

    public void clickOnAddNewCustomer() {
        clickWebElement(addCustomerButton);
        avoidToUse(4);
    }

    public void clickSubmitButton() {
        scroll();
        avoidToUse(1);
        clickWebElement(submitButton);
        avoidToUse(3);
    }

    private void scroll() {
        WebDriver driver = DriverManager.getInstance().getWebDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
    }

    public void fillLastName() {
        fillWebElement(lastName, "My lastName");
    }

    public void fillEmail() {
        fillWebElement(email, "correo@correo.com");
    }

    public void fillPassword() {
        fillWebElement(password, "asdfasdf");
    }

    public void selectCountry() {
        clickWebElement(country);
        avoidToUse(3);
        selectArgentina();
    }

    public void selectArgentina() {
        clickWebElement(argentinaOption);
        avoidToUse(4);
    }

}
