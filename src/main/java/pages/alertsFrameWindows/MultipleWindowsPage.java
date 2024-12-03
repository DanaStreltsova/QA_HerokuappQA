package pages.alertsFrameWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement newWindows;

    public MultipleWindowsPage swithMultipleWindows(int i) {
        click(newWindows);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(i));

        return this;
    }


    @FindBy(tagName = "h3")
    WebElement h3;

    public MultipleWindowsPage verifyNewWindow(String text) {

        Assert.assertTrue(h3.getText().contains(text));
        return this;
    }
}
