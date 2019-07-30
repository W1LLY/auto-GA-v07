package testingui.diplomadoumss.org.managepage.nasa.earth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class Imagery extends BasePage {
    @FindBy(xpath = "/html/body/div[2]/div[2]/p[57]/code")
    private WebElement contentOfLink;


    public String getContentOfSection() {
        DriverManager.getInstance().getWebDriver().manage().window().maximize();
        return contentOfLink.getText();
    }
}
