package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ImagesPage extends BasePage {
    public ImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img")
    List<WebElement> images;

    public ImagesPage checkBrokenImages() {
        System.out.println(images.size() + "-" + "images");
        for (int i = 0; i < images.size(); i++) {
            WebElement element = images.get(i);
            String imageURL = element.getDomAttribute("src");
            verifyLinks(imageURL);
            try {
                boolean imageDisplayed = (Boolean)
                        js.executeScript("return (typeof arguments[0].naturalWidth!=undefined && arguments[0].naturalWidth>0);", element);
                if (imageDisplayed) {
                    System.out.println("DISPLAY -OK");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("***********************************************************");
                }
            } catch (Exception e) {
                System.out.println("Error occurred");
            }

        }

        return this;
    }

}
