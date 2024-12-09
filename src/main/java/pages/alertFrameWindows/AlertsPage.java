package pages.alertFrameWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[contains(text(),'for JS Alert')]")
    WebElement forJSAlertButton;
    public AlertsPage javaScriptAlert() {
        click(forJSAlertButton);
        driver.switchTo().alert().accept();
        return this;
    }


    @FindBy(xpath = "//button[contains(text(),'for JS Confirm')]")
    WebElement confirmButton;

    public AlertsPage selectResult(String result) {
        click(confirmButton);
            if (result != null && result.equals("Ok")) {
                driver.switchTo().alert().accept();
            } else if (result != null && result.equals("Cancel")) {
                driver.switchTo().alert().dismiss();
            }
            return this;
    }

    @FindBy(xpath = "//p[@id='result']")
    WebElement result;
    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }


    @FindBy(xpath = "//button[contains(text(),'for JS Prompt')]")
    WebElement promptButton;
    public AlertsPage sendMessageToAlert(String message) {
        click(promptButton);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(xpath = "//p[@id='result']")
    WebElement messageResult;
    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(messageResult.getText().contains(text));
        return this;
    }
}
