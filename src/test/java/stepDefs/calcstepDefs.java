package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.baseClass;
import pageObjects.calcPage;

public class calcstepDefs extends baseClass {
    calcPage calcpage;
    public String calcFirstNum; public String calcSecondNum;

    @Given("^I have two numbers \"(.*?)\" and \"(.*?)\"$")
    public void i_have_two_numbers_and(String firstNum, String secondNum) throws Throwable {
        calcFirstNum = firstNum; calcSecondNum = secondNum;

    }

    @When("^I \"(.*?)\" them$")
    public void i_them(String calcMethod) throws Throwable {
        calcpage = new calcPage();
        calcpage.doCalcMethod(calcMethod, calcFirstNum, calcSecondNum);

    }

    @Then("^the total will be \"(.*?)\"$")
    public void the_total_will_be(String total) throws Throwable {
        calcpage = new calcPage();
        calcpage.verifyTotal(total);

    }
}
