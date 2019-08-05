package testingui.diplomadoumss.org.managepage.cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Juan Montaño
 */
public class CarsCars extends BasePage {

    @FindBy(xpath = "//a[@id = '10' and @title = 'DELETE']")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[12]/span/a[1]")
    private WebElement editButton;

    @FindBy(xpath = "//*[@id=\"GENERAL\"]/div[3]/div/input")
    private WebElement fieldCarName;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement clickButtonAdd;

    @FindBy(xpath = "//*[@id=\"add\"]")
    private WebElement clickButtonSubmit;

    public CarsCars() {
        avoidToUse(3);
    }

    public CarsCars clickDeleteButton() {
        clickWebElement(deleteButton);
        avoidToUse(3);
        return this;
    }

    public CarsCars clickEditButton() {
        clickWebElement(editButton);
        avoidToUse(3);
        return this;
    }

    public CarsCars fillFieldCarName(String desccription) {
        fillWebElement(fieldCarName, desccription);
        avoidToUse(3);
        return this;
    }

    public CarsCars clickAcceptPoppup() {
        DriverManager.getInstance().getWebDriver().switchTo().alert().accept();
        avoidToUse(3);
        return this;
    }

    public CarsCars clickButtonAdd() {
        clickWebElement(clickButtonAdd);
        avoidToUse(3);
        return this;
    }

    public CarsCars clickButtonSubmit() {
        clickWebElement(clickButtonSubmit);
        avoidToUse(3);
        return this;
    }
}
