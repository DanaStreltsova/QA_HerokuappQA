package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class RedirectLinkPage extends BasePage {
    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[@id='redirect']")
    WebElement here;
    public RedirectLinkPage selectHere() {
        click(here);
        return this;
    }

    @FindBy(css = "a")
    List<WebElement> allLinks;
    public RedirectLinkPage checkAllLinks() {
        String url = "";
        System.out.println("Total links on the page: " + allLinks.size());
        Iterator<WebElement> iterator = allLinks.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
            System.out.println("*******************************************");
        }
        return this;
    }

    public RedirectLinkPage checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element = allLinks.get(i);
            String url = element.getDomAttribute("href");
            verifyLinks(url);
        }

        return this;
    }

    public void verifyLinks(String url) {
        super.verifyLinks(url);
    }
}
