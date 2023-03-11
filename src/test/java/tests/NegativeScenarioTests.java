package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages._0MainPage;
import runner.BaseTest;

public class NegativeScenarioTests extends BaseTest {
    private static final String BASE_URL = "https://www.saucedemo.com/";
    private static final String checkoutInfo = "test";

    @Test
    /*Case 2: "Checking an error message when trying to enter a login for a
      non-existent user"*/
    public void testErrorMessage() {

        final String expectedResult = "Epic sadface: Username and password do" +
                " not match any user in this service";

        _0MainPage main = new _0MainPage(getDriver());

        getDriver().get(BASE_URL);

        main.sendNotValidUserName();
        main.sendNotValidPassword();
        main.clickLog();

        String actualResult = main.getTextError();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
