package tasts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.alertsFrameWindows.DropDownPage;

public class DropDownTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropDown();
    }

    @Test
    public void dropDownTest(){
        new DropDownPage(driver).choseOption(2)
                .verifyDropDown("Option 2");
    }


}
