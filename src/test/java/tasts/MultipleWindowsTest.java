package tasts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.alertsFrameWindows.MultipleWindowsPage;

public class MultipleWindowsTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWindows();

    }

    @Test
    public void multipleWindowsTest(){
        new MultipleWindowsPage(driver).swithMultipleWindows(1)
                .verifyNewWindow("New Window");
    }

}
