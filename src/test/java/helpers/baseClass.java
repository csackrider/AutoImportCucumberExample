package helpers;

import com.javaexample.selenium.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class baseClass extends DriverBase{

    public static RemoteWebDriver RMdriver;
    public static WebDriver driver;


//    public boolean elementIsPresent(String strXpath) {
//        try {
//            WebElement elm = driver.findElement(By.xpath(strXpath));
//            elm.isEnabled();
//            return true;
//        } catch (org.openqa.selenium.NoSuchElementException e) {
//            return false;
//        }
//    }

    public void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }


}


