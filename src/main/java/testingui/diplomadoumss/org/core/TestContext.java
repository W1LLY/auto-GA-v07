package testingui.diplomadoumss.org.core;

/**
 * @author Miguel A. Quispe Santos
 */
public class TestContext {
    private PageObjectManager pageObjectManager;

    public TestContext() {
        pageObjectManager = new PageObjectManager(DriverManager.getInstance().getWebDriver());
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
