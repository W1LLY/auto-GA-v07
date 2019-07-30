package testingui.diplomadoumss.org.managepage.Nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Yerko Manzel
 */
public class Earth extends BasePage {
    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/ul/li[1]/a")


    private WebElement optionImagery;

    public Imagery clickOnImagery() {
        clickWebElement(optionImagery);
        return new Imagery();

    }
}
