package tasts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.alertsFrameWindows.RedirectLinkPage;

public class RedirectLinkTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectRedirectLink();
    }

    @Test
    public void checkAllLinksTest(){
        new RedirectLinkPage(driver).selectHere().checkAllLinks();
    }

    @Test
    public void checkBrokenLinks(){
        new RedirectLinkPage(driver).selectHere().checkBrokenLinks();
    }
}
