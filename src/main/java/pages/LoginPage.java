package pages;

import basePage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    public static final String bokaPageConfirmXpath = "//h4[text()='Boka en TechBuddy']";
    public static final String phoneNumberXpath = "//*[@id=\"customer\"]/div/div/div/div/div/div[2]/form/div[2]/div/div/input";
    public static final String submitButtonXpath = "//button[contains(@class,\'submit-button\')]";

    @FindBy(xpath = bokaPageConfirmXpath)
    WebElement bokaPageConfirm;

    @FindBy(xpath = phoneNumberXpath)
    WebElement phoneElement;


    @FindBy(xpath = submitButtonXpath)
    WebElement buttonElement;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputNumber() {
        isElementPresent(phoneNumberXpath);
        phoneElement.sendKeys("46701234567");

    }

    public PhoneNumberConPage navigateToConfirmPage() {
        buttonElement.click();
        return new PhoneNumberConPage(driver);
    }


}
