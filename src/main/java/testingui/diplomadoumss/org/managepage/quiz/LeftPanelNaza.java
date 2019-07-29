package testingui.diplomadoumss.org.managepage.quiz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;

/**
 * @author Miguel A. Quispe Santos
 */
public class LeftPanelNaza extends BasePage {

    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li/a")
    private WebElement nasaApiList;

    public LeftPanelNaza() {
        avoidToUse(2);
    }

//    @Given("^Load Naza api List$")
//    public void loadNazaApiList() {
//    }
//
//    @Given("^clik en la opcion \"([^\"]*)\"$")
//    public void clikEnLaOpcion(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}
