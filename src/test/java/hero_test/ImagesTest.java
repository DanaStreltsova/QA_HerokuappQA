package hero_test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.elements.ImagesPage;
import tasts.TestBase;

public class ImagesTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectBrockenImages();
    }

    @Test
    public void brokenImagesTest(){
        new ImagesPage(driver).checkBrokenImages();
    }
}
