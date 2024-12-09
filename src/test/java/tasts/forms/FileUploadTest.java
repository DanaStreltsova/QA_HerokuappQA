package tasts.forms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.forms.FileUploadPage;
import tasts.TestBase;

public class FileUploadTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectFileUpload();
    }

    @Test
    public void fileUploadTest(){
        new FileUploadPage(driver)
                .uploadFile("C:/Users/strel/Downloads/мару1.jpg")
                .verifyUploadFile()
        ;
    }
}
