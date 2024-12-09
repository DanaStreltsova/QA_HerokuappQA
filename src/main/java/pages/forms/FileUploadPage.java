package pages.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement uploadPicture;

    public FileUploadPage uploadFile(String path) {
        uploadPicture.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement fileSubmit;

    @FindBy(tagName = "h3")
    WebElement uploadedFile;

    public FileUploadPage verifyUploadFile() {
        Assert.assertTrue(uploadedFile.isDisplayed());
        return this;
    }
}
