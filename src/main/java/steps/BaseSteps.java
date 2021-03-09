package steps;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.TestProperties;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    private static WebDriver driver;
    public static WebDriver getDriver(){

        return driver;
    }
    public static Properties properties = TestProperties.getInstance().getProperties();

    @Before
    public void setUp() {
        String browser = properties.getProperty("browser");
        if ("firefox".equals(browser)) {
            System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
            driver = new FirefoxDriver();
        } else if ("chrome".equals(browser)) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver .get("https://www.sberbank.ru/ru/person");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver .manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

  }


    @AfterClass
    public static void afterMethod(){
        driver.quit();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) BaseSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}


