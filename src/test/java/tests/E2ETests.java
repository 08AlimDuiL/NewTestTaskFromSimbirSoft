package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.allRealPages.MainPage;
import pages.allRealPages.InventoryPage;
import pages.allRealPages.CartPage;
import pages.allRealPages.CheckoutStepOne;
import pages.allRealPages.CheckoutStepTwo;
import pages.allRealPages.CheckoutComplete;
import runner.BaseTest;

public class E2ETests extends BaseTest {
      @Test
    // Case 01: "Verification of a successful purchase"
    public void testSuccessfulPurchase() {

        final String expectedResult = "Products";
        final String endExpectedResult = "Thank you for your order!";

        MainPage main = new MainPage(getDriver());
        InventoryPage inventory = new InventoryPage(getDriver());
        CartPage cart = new CartPage(getDriver());
        CheckoutStepOne stepOne = new CheckoutStepOne(getDriver());
        CheckoutStepTwo stepTwo = new CheckoutStepTwo(getDriver());
        CheckoutComplete complete = new CheckoutComplete(getDriver());
        //Precondition
        openBaseURL();

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
