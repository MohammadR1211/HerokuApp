package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.PageInitializers;
import sun.jvm.hotspot.debugger.Page;

import java.util.concurrent.TimeUnit;

public class CommonFunctions extends PageInitializers {

    public static WebDriver driver;

    public void openBrowser() {
        ConfigReader.readProperties(Constants.CONFIGURATIOn_FILEPATH);
        if ("chrome".equals(ConfigReader.getPropertyValue("browser"))) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        initializeObjects();

    }

        public void tearDown(){
        driver.quit();
    }



}
