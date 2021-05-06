import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTestExample {

    private WebDriver driver;

    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void seleniumTest() {
        driver.get("https://www.tut.by/");
        Assert.assertTrue(driver.getTitle().contains("TUT.BY"));
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
