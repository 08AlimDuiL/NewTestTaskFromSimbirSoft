package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.allRealPages.*;
import runner.BaseTest;

public class E2ETests extends BaseTest {
    @Test
    public void testSuccessfulPurchase() {

        final String endExpectedResult = "Thank you for your order!";
        //Precondition
        openBaseURL();
        new MainPage(getDriver())
                .fillUserName()
                .fillPassword()
                .clickLog();

        // Case 01: "Verification of a successful purchase"
        new InventoryPage(getDriver())
                .clickBtnOfFirstGood()
                .clickShoppingLink();
        new CartPage(getDriver())
                .clickCheckoutBtn();
        new CheckoutStepOnePage(getDriver())
                .fillFirstName()
                .fillFLastName()
                .fillPostalCode()
                .clickBtnContinue();
        new CheckoutStepTwoPage(getDriver())
                .clickBtnFinish();

        String endActualResult = new CheckoutCompletePage(getDriver())
                .getTextCompleteHeader();

        Assert.assertEquals(endActualResult, endExpectedResult);
    }
}
