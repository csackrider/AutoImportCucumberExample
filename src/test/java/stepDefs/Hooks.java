package stepDefs;

import com.javaexample.selenium.config.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.baseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.javaexample.selenium.DriverBase;
import java.util.concurrent.TimeUnit;

public class Hooks extends baseClass {

    final static Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void openBrowser() throws Exception {

        WebDriverWait wait;



        driver = new DriverFactory().getDriver();

        //WebDriver driver = getDriver();

//        switch (strBrowser.toLowerCase()) {
//            case "chrome":
//                String browser_name = "chrome";
//                DesiredCapabilities capabilities = new DesiredCapabilities();
//                capabilities.setBrowserName(browser_name);
//                driver = new ChromeDriver();
//                break;
//            case "firefox":
//                System.setProperty("webdriver.gecko.driver", "geckodriver");
//                DesiredCapabilities cap = DesiredCapabilities.firefox();
//                cap.setCapability("marionette", true);
//                cap.setBrowserName("firefox");
//                driver = new FirefoxDriver(cap);
//                break;
//            case "grid":
//                //driver = new RemoteWebDriver(new URL("https://turbo-seleniumgrid.hesos.net/wd/hub"), cap);
//
//                break;
//            default:
//                blnBrowserSupported = false;
//                logger.error("Browser '" + strBrowser + "' not supported yet.");
//                break;
//        }


            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get("http://web2.0calc.com/");


    }

    @After
    public static void shutDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
