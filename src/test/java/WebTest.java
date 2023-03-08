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

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        sleep(2000);

        WebElement passWord = driver.findElement(By.xpath("//div[@class = 'form_group']/input[@type='password']"));
        sleep(2000);
        passWord.sendKeys("secret_sauce");

        WebElement clickLog = driver.findElement(By.xpath("//input[@class ='submit-button btn_action']"));
        clickLog.click();
        sleep(2000);

        WebElement products = driver.findElement(By.xpath("//span[@class='title']"));

        String actualResult = products.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }
}
