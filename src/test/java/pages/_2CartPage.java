package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2CartPage {

    private WebDriver driver;

    public _2CartPage(WebDriver existingDriver) {
        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    private final By CHECKOUT_BTN = By.id("checkout");

    public WebElement getCheckoutBtn() {

        return getDriver().findElement(CHECKOUT_BTN);
    }

    public void clickCheckoutBtn() {

        getCheckoutBtn().click();
    }

}
