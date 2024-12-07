package pages.alertsFrameWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;
import pages.HomePage;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "input")
    WebElement input;

    public HorizontalSliderPage moveSliderInHorizontalDirection() {
        pause(1000);


        new Actions(driver).dragAndDropBy(input,255,0).perform();
        return this;
    }

    public HorizontalSliderPage verifySliderValue(String number) {
        Assert.assertEquals(input.getDomAttribute("value"),number);
        return this;
    }
}
