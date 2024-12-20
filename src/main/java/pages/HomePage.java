package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.alertFrameWindows.AlertsPage;
import pages.alertFrameWindows.FramePage;
import pages.elements.*;
import pages.forms.FileUploadPage;
import pages.interactions.DragAndDropPage;
import pages.interactions.DropDownPage;
import pages.wigets.HorizontalSliderPage;
import pages.wigets.HoversPage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement alerts;

    public AlertsPage getJavaScriptAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }


    @FindBy(css = "[href='/frames']")
    WebElement frames;

    public FramePage getFrames() {
        click(frames);
        return new FramePage(driver);
    }

    @FindBy(css = "[href='/windows']")
    WebElement windows;

    public void getWindows() {
        click(windows);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement dropdown;

    public DropDownPage getDropDown() {
        click(dropdown);
        return new DropDownPage(driver);
    }


    @FindBy(css = "[href='/horizontal_slider']")
    WebElement slider;
    public HorizontalSliderPage getSlider() {
        click(slider);
        return new HorizontalSliderPage(driver);
    }


    @FindBy(xpath ="//a[contains(text(),'Drag and Drop')]" )
    WebElement dragDrop;
    public DragAndDropPage getDragAndDrop() {
         click(dragDrop);
        return new DragAndDropPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Hovers')]")
    WebElement hover;

    public HoversPage getHovers() {
        click(hover);
        return new HoversPage(driver);
    }

    @FindBy(css = "[href='/redirector']")
    WebElement redirectLink;

    public RedirectLinkPage selectRedirectLink() {
        click(redirectLink);
        return new RedirectLinkPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Broken Images')]")
    WebElement image;

    public ImagesPage selectBrockenImages() {
        click(image);
        return new ImagesPage(driver);
    }


    @FindBy(xpath = "//a[contains(text(),'File Upload')]")
    WebElement fileUpload;
    public FileUploadPage selectFileUpload() {
        click(fileUpload);
        return new FileUploadPage(driver);
    }
}
