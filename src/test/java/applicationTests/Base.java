package applicationTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Base {

    @BeforeSuite
    public void beforeSuite(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        getWebDriver().manage().window().maximize();
    }

    @AfterSuite
    public void afterSuite(){
        clearBrowserCache();
    }
}
