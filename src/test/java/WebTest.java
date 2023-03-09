import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class WebTest {
    @Test

    public void testMyFirstBuy() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "f:/QA/Installer/ChromeDriver111/chromedriver.exe";
        String url = "https://www.saucedemo.com/";

        String expectedResult = "Products";
        String endExpectedResult = "Thank you for your order!";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        //Precondition
        WebElement userName = driver.findElement(
                By.id("user-name")
        );
        userName.sendKeys("standard_user");
        WebElement passWord = driver.findElement(
                By.id("password")
        );
        passWord.sendKeys("secret_sauce");
        WebElement clickLog = driver.findElement(
                By.id("login-button")
        );
        clickLog.click();
        WebElement products = driver.findElement(
               By.xpath("//span[@class='title']")
        );

        String actualResult = products.getText();

        Assert.assertEquals(actualResult, expectedResult);

        // Case 01: "Verification of a successful purchase"
        WebElement firstInventory = driver.findElement(
                By.cssSelector(".inventory_list .inventory_item:first-child .btn")
        );
        firstInventory.click();
        WebElement shoppingLink = driver.findElement(
                By.cssSelector(".shopping_cart_link")
        );
        shoppingLink.click();
        WebElement checkoutButton = driver.findElement(
                By.cssSelector(".checkout_button")
        );
        checkoutButton.click();
        WebElement firstName = driver.findElement(
                By.cssSelector(".form_group [name=\"firstName\"]")
        );
        firstName.sendKeys("test");
        WebElement lastName = driver.findElement(
                By.cssSelector(".form_group [name=\"lastName\"]")
        );
        lastName.sendKeys("test");
        WebElement postalCode = driver.findElement(
                By.cssSelector(".form_group [name=\"postalCode\"]")
        );
        postalCode.sendKeys("test");
        WebElement btnContinue = driver.findElement(
                By.cssSelector(".btn[name=\"continue\"]")
        );
        btnContinue.click();
        WebElement btnFinish = driver.findElement(
                By.cssSelector(".btn[name=\"finish\"]")
        );
        btnFinish.click();
        WebElement completeHeader = driver.findElement(
                By.cssSelector(".complete-header")
        );

        String endActualResult = completeHeader.getText();

        Assert.assertEquals(endActualResult, endExpectedResult);

        driver.quit();
    }
}
