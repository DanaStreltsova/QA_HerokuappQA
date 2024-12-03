package pages.alertsFrameWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement iFrame;

    public FramePage selectIframe() {
        click(iFrame);
        return new FramePage(driver);
    }

    @FindBy(id = "mce_0_ifr")
    WebElement iframe;
    
    public FramePage switchToIframeById() {
        driver.switchTo().frame(iframe);
        return this;
    }

    @FindBy(id = "tinymce")
    WebElement tinymce;
    public FramePage verifyIframeByText(String text) {
        Assert.assertTrue(shouldHaveText(tinymce,text, 1));
        return this;
    }
}




