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

public class WebTest extends BaseTest {
    private static final String BASE_URL = "https://www.saucedemo.com/";
    private static final String checkoutInfo = "test";

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

        main.getUserName().sendKeys("standard_user");
        main.getPassword().sendKeys("secret_sauce");
        main.getClickLog().click();

        String actualResult = inventory.getTitle().getText();

        Assert.assertEquals(actualResult, expectedResult);

        inventory.getFirstGood().click();
        inventory.getShoppingContainer().click();

        cart.getCheckoutBtn().click();

        stepOne.getFirstName().sendKeys(checkoutInfo);
        stepOne.getLastName().sendKeys(checkoutInfo);
        stepOne.getPostalCode().sendKeys(checkoutInfo);
        stepOne.getBtnContinue().click();

        stepTwo.getBtnFinish().click();

        String endActualResult = complete.getCompleteHeader().getText();

        Assert.assertEquals(endActualResult, endExpectedResult);
    }

    @Test
    //Case 2: "Checking an error message when trying to enter a login for a non-existent user"
    public void testErrorMessage() {

        final String expectedResult = "Epic sadface: Username and password do not match any user in this service";

        _0MainPage main = new _0MainPage(getDriver());

        getDriver().get(BASE_URL);

        main.getUserName().sendKeys(checkoutInfo);
        main.getPassword().sendKeys(checkoutInfo);
        main.getClickLog().click();

        String actualResult = main.getError().getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
