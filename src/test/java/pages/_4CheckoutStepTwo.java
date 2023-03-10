package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _4CheckoutStepTwo {

    private WebDriver driver;

    public _4CheckoutStepTwo(WebDriver existingDriver) {
        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    private final By BTNFINISH = By.cssSelector(".btn[name=\"finish\"]");

    public WebElement getBtnFinish() {

        return getDriver().findElement(BTNFINISH);
    }
}
