package testScenarios;

import Utility.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.WeatherDataPage;

    public class WeatherDataPageTest extends BaseTest{


    @Test
    public void VerifyWeatherDataPageTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        WeatherDataPage weatherDataPage = PageFactory.initElements(driver, WeatherDataPage.class);
        Thread.sleep(2000);
        weatherDataPage.selectRejectOptionalCookies();

        weatherDataPage.clickWeatherDataMenu();
        softAssert.assertEquals(weatherDataPage.getWeatherPageHeaderText(), weatherDataPage.actualWeatherPageHeader);

        weatherDataPage.sandSearchBoxText("Hyderabad");
        softAssert.assertEquals(weatherDataPage.getSearchHistoryPageText(),weatherDataPage.actualHistoryPageText);
        String currentURL = driver.getCurrentUrl();
        softAssert.assertTrue(currentURL.contains("Hyderabad"),"URL is not match");
        Thread.sleep(4000);
        softAssert.assertTrue(weatherDataPage.isMaxTempWeatherDisplayed(), "Max Temp Weather is not displayed.");
        softAssert.assertTrue(weatherDataPage.isMinTempWeatherDisplayed(), "Min Temp Weather is not displayed.");
        softAssert.assertTrue(weatherDataPage.istotalPrecipWeatherDisplayed(), "Total Precip Weather is not displayed.");
        softAssert.assertTrue(weatherDataPage.isMaxDailyPrecipWeatherDisplayed(), "Max Daily Precip Weather is not displayed.");
        softAssert.assertTrue(weatherDataPage.israinDaysWeatherDisplayed(), "Rain Days report is displayed.");
        softAssert.assertTrue(weatherDataPage.isMaxSustainedWindWeatherDisplayed(), "Max sustained wind Weather is not displayed.");
        softAssert.assertTrue(weatherDataPage.isMainGridDisplayed(), "Main Grid is not displayed.");
        softAssert.assertAll();
    }
}
