package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    private WebDriver driver;
    private final String BASE_URL = "https://www.saucedemo.com/";

    @BeforeMethod
    protected void beforeMethod() {
        driver = BaseUtils.createDriver();
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public void openBaseURL(){

        getDriver().get(BASE_URL);
    }
}