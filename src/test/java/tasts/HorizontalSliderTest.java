package tasts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.alertsFrameWindows.HorizontalSliderPage;

public class HorizontalSliderTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getSlider();
    }

    @Test
    public void sliderTest(){
        new HorizontalSliderPage(driver).moveSliderInHorizontalDirection()
                .verifySliderValue("0");
    }
}
