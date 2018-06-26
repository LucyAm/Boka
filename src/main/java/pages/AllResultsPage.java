package pages;

import basePage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllResultsPage extends PageObject {
    public static final String bokaLinkXpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a";
    @FindBy(xpath = bokaLinkXpath)
    WebElement bokaLink;

    public AllResultsPage(WebDriver driver) {
        super(driver);
    }

    public BokaPage jumpToBoka() {
        bokaLink.click();
        return new BokaPage(driver);
    }
}
