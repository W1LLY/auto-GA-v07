package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.nasa.earth.Earth;
import testingui.diplomadoumss.org.managepage.nasa.earth.Imagery;
import testingui.diplomadoumss.org.managepage.nasa.home.Nasa;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class NasaAPIStepdefs {
    Nasa nasa;

    Earth earth;

    Imagery imagery;

    String content;

    @Given("^I load page Nasa API$")
    public void iLoadPageNasaAPI() throws Throwable {
        nasa = LoadPage.loadNasaAPI();
    }

    @And("^click on Nasa API 'Listing'$")
    public void clickOnNasaAPIListing() throws Throwable {
        nasa = nasa.clickOnListing();
    }

    @And("^click on 'Earth' on left panel$")
    public void clickOnEarthOnLeftPanel() throws Throwable {
        earth = nasa.clickOnEarth();
    }

    @And("^click on option 'Imagery'$")
    public void clickOnOptionImagery() throws Throwable {
        imagery = earth.clickOnImagery();
    }

    @And("^get content of Imagery$")
    public void getContentOfImagery() throws Throwable {
        content = imagery.getContentOfSection();
    }

    @Then("^verify the \"([^\"]*)\" content on 'Imagery' page$")
    public void verifyTheContentOnImageryPage(String example) throws Throwable {
        Assert.assertEquals(content, example, "Verifying content of Imagery with example parameter");
    }
}
