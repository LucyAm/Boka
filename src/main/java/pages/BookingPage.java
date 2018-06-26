package pages;

import basePage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends PageObject {
    public static final String categoryFormXpath = "//*[@id=\"customer\"]/div/div/div/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]";
    public static final String categorySelectXpath = "/html/body/div[5]/div[1]/div[1]/ul/li[2]/span";
    public static final String dateChooseXpath = "//span[contains(@class,'flatpickr-day today')] ";
    public static final String helpNeedXpath = "//h3[text()='Vad behöver du hjälp med?']/..//textarea";
    public static final String priceXpath = "//a[text()='Välj']";
    public static final String checkBoxXpath = "//div[@class='buttons']//span[@class='el-checkbox__input']";

    @FindBy(xpath = categoryFormXpath)
    WebElement categoryForm;
    @FindBy(xpath = categorySelectXpath)
    WebElement categorySelect;
    @FindBy(xpath = dateChooseXpath)
    WebElement dateChoose;
    @FindBy(name = "when-day")
    WebElement dateConfirm;
    @FindBy(xpath = helpNeedXpath)
    WebElement helpNeed;
    @FindBy(xpath = priceXpath)
    WebElement price;
    @FindBy(xpath = checkBoxXpath)
    WebElement checkBox;

    public BookingPage(WebDriver driver) {
        super(driver);
    }
    public void selectCategory() {
        categoryForm.click();
    }
}
