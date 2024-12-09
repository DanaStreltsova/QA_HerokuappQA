package tasts.alertFrameWindows;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.alertFrameWindows.FramePage;
import tasts.TestBase;

public class FrameTasts extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFrames();
    }

    @Test
    public void iframeTest() {
        new FramePage(driver).selectIframe()
                .switchToIframeById()
                .verifyIframeByText("Your content goes here.");
    }
}
