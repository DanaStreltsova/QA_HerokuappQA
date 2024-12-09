package pages.wigets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".figure:nth-child(3)")
    WebElement user1;
    public HoversPage moveToFirstElement() {
        pause(1000);
        new Actions(driver).moveToElement(user1).perform();
        return this;
    }

    @FindBy(css = "h5")
    WebElement userName;
    public HoversPage verifyByText() {
        Assert.assertEquals(userName.getText(),"name: user1");
        return this;
    }
}
