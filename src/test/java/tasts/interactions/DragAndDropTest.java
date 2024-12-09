package tasts.interactions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.interactions.DragAndDropPage;
import tasts.TestBase;

public class DragAndDropTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDragAndDrop();
    }

    @Test
    public void dragAndDropTest(){
        new DragAndDropPage(driver).actionA()
                .verifyDragA("B");
    }
}
