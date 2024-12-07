package pages.alertsFrameWindows;

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

    private void verifyLinks(String url) {
        try {
            URL linkUrl = new URL(url);

            HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
            connection.setConnectTimeout(5000);
            if (connection.getResponseCode() >= 400) {
                System.out.println(url + "-" + connection.getResponseMessage() + "is a broken link");
            } else {
                System.out.println(url + "-" + connection.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println(url + "-" + e.getMessage() + "Error occurred");
        }
    }
}
