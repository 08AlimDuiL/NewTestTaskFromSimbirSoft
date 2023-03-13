package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.allRealPages.MainPage;
import runner.BaseTest;

public class NegativeScenarioTests extends BaseTest {
        @Test
    /*Case 2: "Checking an error message when trying to enter a login for a
      non-existent user"*/
    public void testErrorMessage() {

        final String expectedResult = "Epic sadface: Username and password do" +
                " not match any user in this service";

        MainPage main = new MainPage(getDriver());

        openBaseURL();

        main.sendNotValidUserName();
        main.sendNotValidPassword();
        main.clickLog();

        String actualResult = main.getTextError();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
