package testingui.diplomadoumss.org.managepage.Nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Yerko Manzel
 */
public class Nasa extends BasePage {

    @FindBy(xpath = "//a[text()='NASA API Listing']")
    private WebElement btnListing;

    @FindBy(xpath = "//a[text()='Earth']")
    private WebElement btnEarth;

    @FindBy(xpath = "//a[text()='Imagery']")
    private WebElement btnImagery;

    public Nasa nasaListing() {
        return selectNasaListing();
    }

    public Nasa clickEarthActive() {
        return clickEarth();
    }

    public Nasa selectNasaListing() {
        avoidToUse(3);
        isWebElementVisible(btnListing);
        clickWebElement(btnListing);

        return this;
    }

    private Nasa clickEarth() {
        avoidToUse(3);
        isWebElementVisible(btnEarth);
        clickWebElement(btnEarth);

        return this;
    }


}
