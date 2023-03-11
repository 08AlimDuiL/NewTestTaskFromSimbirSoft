package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages._0MainPage;
import pages._1InventoryPage;
import pages._2CartPage;
import pages._3CheckoutStepOne;
import pages._4CheckoutStepTwo;
import pages._5CheckoutComplete;
import runner.BaseTest;

public class E2ETests extends BaseTest {
    private static final String BASE_URL = "https://www.saucedemo.com/";

    @Test
    // Case 01: "Verification of a successful purchase"
    public void testSuccessfulPurchase() {

        final String expectedResult = "Products";
        final String endExpectedResult = "Thank you for your order!";

        _0MainPage main = new _0MainPage(getDriver());
        _1InventoryPage inventory = new _1InventoryPage(getDriver());
        _2CartPage cart = new _2CartPage(getDriver());
        _3CheckoutStepOne stepOne = new _3CheckoutStepOne(getDriver());
        _4CheckoutStepTwo stepTwo = new _4CheckoutStepTwo(getDriver());
        _5CheckoutComplete complete = new _5CheckoutComplete(getDriver());
        //Precondition
        getDriver().get(BASE_URL);

        main.sendUserName();
        main.sendPassword();
        main.clickLog();

        String actualResult = inventory.getTextTitle();

        Assert.assertEquals(actualResult, expectedResult);

        inventory.clickBtnOfFirstGood();
        inventory.clickShoppingLink();

        cart.clickCheckoutBtn();

        stepOne.sendFirstName();
        stepOne.sendFLastName();
        stepOne.sendPostalCode();
        stepOne.clickBtnContinue();

        stepTwo.clickBtnFinish();

        String endActualResult = complete.getTextCompleteHeader();

        Assert.assertEquals(endActualResult, endExpectedResult);
    }
}
