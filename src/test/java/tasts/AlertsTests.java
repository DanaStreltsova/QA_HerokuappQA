package tasts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.alertsFrameWindows.AlertsPage;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlerts();
    }

    @Test

    public void clickForJsAlertTest() {
        new AlertsPage(driver).javaScriptAlert();

    }

    @Test
    public void clickForJsConfirmTest() {
        new AlertsPage(driver).selectResult("Ok").verifyResult("Ok");
    }


    @Test
    public void clickForJsPromptTest() {
        new AlertsPage(driver).sendMessageToAlert("QA").verifyMessage("QA");

    }



}
