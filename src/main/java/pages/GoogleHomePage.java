package pages;

import basePage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends PageObject {
    @FindBy(name = "q")
    WebElement searchElement;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public AllResultsPage searchLink(String searchLink) {
        searchElement.click();
        searchElement.sendKeys(searchLink);
        searchElement.submit();
        return  new AllResultsPage(driver);
    }

}
