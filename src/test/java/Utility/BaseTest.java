package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    Properties properties = new Properties();
    public static  WebDriver driver;

    @BeforeMethod
    public void initBrowser(){
        System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("./src/test/resources/prod.properties");
            properties.load(fileInputStream);
            String baseUrl = properties.getProperty("BASE_URL");
            driver.get(baseUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
