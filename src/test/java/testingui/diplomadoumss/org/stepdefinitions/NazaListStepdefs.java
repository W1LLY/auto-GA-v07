package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.quiz.LeftPanelNaza;

/**
 * @author Miguel A. Quispe Santos
 */
public class NazaListStepdefs {
    private LeftPanelNaza leftPanelNaza;

    @Given("^Load Naza api List$")
    public void loadNazaApiList() throws Throwable {
        leftPanelNaza = LoadPage.loadNazaPage();
    }
}
