package pageObjects;

import helpers.baseClass;
import org.openqa.selenium.By;
import com.javaexample.selenium.DriverBase;
import static org.junit.Assert.assertEquals;

public class calcPage extends baseClass {


    public void doCalcMethod(String calcMethod,String firstNum, String secondNum) throws InterruptedException {

        clickNumberButtons(firstNum);

        switch (calcMethod.toLowerCase()) {
            case "add":
                driver.findElement(By.id("BtnPlus")).click();
                break;
            case "subtract":
                driver.findElement(By.id("BtnMinus")).click();
            default:
                System.out.println("Method " + calcMethod + " not implemented yet.");
                break;
        }

        clickNumberButtons(secondNum);
        driver.findElement(By.id("BtnCalc")).click();
        pause(1000);
    }

    //function to handle all numbers.  send in 10, 200, 1000 etc and it will click all the buttons needed
    public void clickNumberButtons(String strNumber){
        for(int i = 0; i < strNumber.length(); i++)
        {
            String c = String.valueOf(strNumber.charAt(i));
            driver.findElement(By.id("Btn" + c)).click();
        }

    }

    public void verifyTotal(String total){

            assertEquals("!!! Math does not add up !!!",total,driver.findElement(By.id("input")).getAttribute("value"));



    }

}
