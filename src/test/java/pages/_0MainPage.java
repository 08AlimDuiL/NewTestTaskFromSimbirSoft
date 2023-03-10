package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _0MainPage {
    private WebDriver driver;

    public _0MainPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    private final By USER_NAME = By.id("user-name");
    private final By PASSWORD = By.id("password");
    private final By CLICK_LOG = By.id("login-button");
    private final By HEADER_ERROR = By.xpath("//h3");

    public WebElement getUserName() {

        return getDriver().findElement(USER_NAME);
    }

    public WebElement getPassword() {

        return getDriver().findElement(PASSWORD);
    }

    public WebElement getClickLog() {

        return getDriver().findElement(CLICK_LOG);
    }

    public WebElement getError() {

        return getDriver().findElement(HEADER_ERROR);
    }

}


