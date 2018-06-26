package pages;

import basePage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhoneNumberConPage extends PageObject {
    public static final String confirmCodeXpath = "//h3[text()='Kod']/..//input";
    public static final String submitButtonXpath = "//button[contains(@class,\'submit-button\')]";


    @FindBy(xpath = confirmCodeXpath)
    WebElement confirmCode;
    @FindBy(xpath = submitButtonXpath)
    WebElement submitButton;

    public PhoneNumberConPage(WebDriver driver) {
        super(driver);
    }

    public void inputCode() {
        isElementPresent(confirmCodeXpath);
        confirmCode.sendKeys("100100");
    }

    public BookingPage submit() {
        submitButton.click();
        return new BookingPage(driver);
    }
}
