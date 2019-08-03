package testingui.diplomadoumss.org.managepage.cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Juan Montaño
 */
public class CarsExtras extends BasePage {

    @FindBy(xpath = "//a[@class = 'btn btn-success xcrud-action' and @href = 'javascript:;']")
    private WebElement addButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[9]/span/a[2]")
    private WebElement editButton;

    @FindBy(xpath = "//input[@name='cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--' and @type='text']")
    private WebElement nameUpdate;

    @FindBy(xpath = "//input[@name='cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--' and @type='text']")
    private WebElement priceUpdate;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a[1]")
    private WebElement buttonSaveReturn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[9]/span/a[3]")
    private WebElement buttonDelete;

    public CarsExtras() {
        avoidToUse(2);
    }

    public CarsExtras clickAddButton() {
        clickWebElement(addButton);
        avoidToUse(3);
        return this;
    }

    public CarsExtras clickeditIcon() {
        clickWebElement(editButton);
        avoidToUse(3);
        return this;
    }

    public CarsExtras updateName(String name) {
        fillWebElement(nameUpdate, name);
        avoidToUse(3);
        return this;
    }

    public CarsExtras updatePrice(String price) {
        fillWebElement(priceUpdate, price);
        avoidToUse(3);
        return this;
    }

    public CarsExtras clickButtonSaveReturn() {
        clickWebElement(buttonSaveReturn);
        avoidToUse(3);
        return this;
    }

    public CarsExtras clickButtonDelete() {
        clickWebElement(buttonDelete);
        avoidToUse(3);
        return this;
    }

    public CarsExtras clickAcceptPoppup() {
        DriverManager.getInstance().getWebDriver().switchTo().alert().accept();
        avoidToUse(3);
        return this;
    }
}
