package com.javaexample.selenium.tests;

import com.javaexample.selenium.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CalcExampleIT extends DriverBase {

    @Test
    public void addingExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // go to the calc url
        driver.get("http://web2.0calc.com/");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // add 9 + 9
        driver.findElement(By.id("Btn9")).click();
        driver.findElement(By.id("BtnPlus")).click();
        driver.findElement(By.id("Btn9")).click();
        driver.findElement(By.id("BtnCalc")).click();

        // verify the sum is 18

        System.out.println("The total is: " + driver.findElement(By.id("input")).getAttribute("value"));
        String strTotal = driver.findElement(By.id("input")).getAttribute("value");
        assertEquals("Total found " + strTotal + " does not match expected 18", strTotal, "18");

    }

}