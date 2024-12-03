package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.alertsFrameWindows.AlertsPage;
import pages.alertsFrameWindows.FramePage;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement alerts;
    public AlertsPage getJavaScriptAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }


    @FindBy(css = "[href='/frames']")
    WebElement frames;
    public FramePage getFrames() {
        click(frames);
        return new FramePage(driver);
    }
}
