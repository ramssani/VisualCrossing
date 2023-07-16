package pages;

import Utility.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherDataPage extends BaseTest {
     WebDriver driver;

     public String actualWeatherPageHeader = "Total Weather Data";
     public String actualHistoryPageText = "Historical weather data for Hyderabad";



    public WeatherDataPage(WebDriver driver) {
        this.driver = driver;

    }
    @FindBy(xpath = "//*[text()='Reject optional cookies']")
     private WebElement rejectOptionalCookies;

    @FindBy(xpath = "//*[@id='navbarNav']/ul/li[1]")
    private WebElement weatherDataMenu;

    @FindBy(xpath = "//*[text()='Total Weather Data']")
    WebElement weatherPageHeader;

    @FindBy(id = "wxlocation")
    WebElement searchBoxElement;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg rounded-pill w-100 w-md-auto ms-sm-3']")
    WebElement searchButtonElement;

    @FindBy(xpath = "//*[@class='h3 d-flex align-items-end justify-content-between mb-4']")
    WebElement getHistoryPageTextElement;

    @FindBy(xpath = "//*[@id='weatherSummary']/div/div/div/div[3]/div[1]")
    WebElement maxTempElement;

    @FindBy(xpath = "//*[@id='weatherSummary']/div/div/div/div[3]/div[2]")
    WebElement minTempElement;

    @FindBy(xpath = "//*[@id='weatherSummary']/div/div/div/div[3]/div[3]")
    WebElement totalPrecipElement;
    @FindBy(xpath = "//*[@id='weatherSummary']/div/div/div/div[3]/div[4]")
    WebElement maxDailyPrecipElement;
    @FindBy(xpath = "//*[@id='weatherSummary']/div/div/div/div[3]/div[5]")
    WebElement rainDaysElement;

    @FindBy(xpath = "//*[@id='weatherSummary']/div/div/div/div[3]/div[6]")
    WebElement maxSustainedWindElement;

    @FindBy(xpath = "//*[@class='maingrid']")
    WebElement mainGridElement;

    @FindBy(xpath = "//*[@class='stationsMap leaflet-container leaflet-touch leaflet-retina leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom']")
    WebElement stationsMapElement;


    public void selectRejectOptionalCookies() {
        rejectOptionalCookies.click();
    }
    public void clickWeatherDataMenu(){
        weatherDataMenu.click();
    }
    public String getWeatherPageHeaderText(){
        String weatherPageHeaderText = weatherPageHeader.getText();
        return weatherPageHeaderText;
    }

    public String getSearchHistoryPageText(){
        String historyPageText = getHistoryPageTextElement.getText();
        return historyPageText;
    }

    public void sandSearchBoxText(String cityName){
        searchBoxElement.clear();
        searchBoxElement.sendKeys(cityName);
        searchButtonElement.click();
    }

    public boolean isMaxTempWeatherDisplayed() {
        return maxTempElement.isDisplayed();
    }

    public boolean isMinTempWeatherDisplayed() {
        return minTempElement.isDisplayed();
    }

    public boolean istotalPrecipWeatherDisplayed() {
        return totalPrecipElement.isDisplayed();
    }
    public boolean isMaxDailyPrecipWeatherDisplayed() {
        return maxDailyPrecipElement.isDisplayed();
    }
    public boolean israinDaysWeatherDisplayed() {
        return rainDaysElement.isDisplayed();
    }
    public boolean isMaxSustainedWindWeatherDisplayed() {
        return maxSustainedWindElement.isDisplayed();
    }
    public boolean isMainGridDisplayed() {
        return mainGridElement.isDisplayed();
    }
}
