package pages.alertsFrameWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='column-a']")
    WebElement a;

    @FindBy(xpath = "//div[@id='column-b']")
    WebElement b;

    public DragAndDropPage actionA() {
        new Actions(driver).dragAndDrop(a,b).perform();
        return this;
    }

    public DragAndDropPage verifyDragA(String text) {
        Assert.assertEquals(a.getText(),"B");
        return this;
    }
}
