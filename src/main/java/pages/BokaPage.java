package pages;

import basePage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BokaPage extends PageObject {
    public static final String startBookingXpath = "//a[text()='BOKA ETT HEMBESÖK']";

    @FindBy(xpath = startBookingXpath)
    WebElement startBooking;


    public BokaPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage startLoging() {
        startBooking.click();
        return new LoginPage(driver);
    }
}
