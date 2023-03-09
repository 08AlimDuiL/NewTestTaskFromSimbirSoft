import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    private static final String URL = "https://www.saucedemo.com/";
    @Test(priority=1)
    // Case 01: "Verification of a successful purchase"
    public void testSuccessfulPurchase() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "f:/QA/Installer/ChromeDriver111/chromedriver.exe";

        String expectedResult = "Products";
        String endExpectedResult = "Thank you for your order!";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

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
    @Test
    //Case 2: "Checking an error message when trying to enter a login for a non-existent user"
    public void testErrorMessage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "f:/QA/Installer/ChromeDriver111/chromedriver.exe";

        String expectedResult = "Epic sadface: Username and password do not match any user in this service";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement userName = driver.findElement(
                By.xpath("//div[@class = 'form_group']/input[@name='user-name']")
        );
        userName.sendKeys("test");
        WebElement passWord = driver.findElement(
                By.xpath("//div[@class = 'form_group']/input[@name='password']")
        );
        passWord.sendKeys("test");
        WebElement clickLog = driver.findElement(
                By.xpath("//input[@class ='submit-button btn_action']")
        );
        clickLog.click();

        WebElement headerError= driver.findElement(
                By.xpath("//h3")
        );

        String actualResult =headerError.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
}
