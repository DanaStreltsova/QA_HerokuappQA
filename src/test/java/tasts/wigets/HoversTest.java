package tasts.wigets;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.wigets.HoversPage;
import tasts.TestBase;

public class HoversTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHovers();
    }

    @Test
    public void hoversTest(){
        new HoversPage(driver).moveToFirstElement()
                .verifyByText();
    }
}
