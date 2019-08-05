package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Miguel A. Quispe Santos
 */
public class LocationManagement {

    WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[12]/a")
    private WebElement clikLocationListSelect;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/supplier/locations']")
    private WebElement clickLocation;

    public LocationManagement(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void clickLocationManageBoard() {
        avoidToUse(4);
        clickWebElement(clikLocationListSelect);
        avoidToUse(3);
        clickWebElement(clickLocation);
    }
}
