package util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FunctionalTestBase {
    final String URL = "https://google.com";
    public WebDriver driver;
    String chromeDriverProp = "webdriver.chrome.driver";
    String driverPath = "D:\\programs\\chromedriver.exe";

    @BeforeClass
    public void setup() {
        System.setProperty(chromeDriverProp, driverPath);
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}