package pages.wigets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import java.time.Duration;

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

    @FindBy(id = "range")
    WebElement range;

    public void verifySliderValue(String text) {
        Assert.assertTrue(shouldHaveText(range, text, 5));
    }

    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}
