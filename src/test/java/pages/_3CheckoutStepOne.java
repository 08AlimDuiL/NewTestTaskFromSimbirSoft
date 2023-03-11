package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _3CheckoutStepOne {
    private static final String checkoutInfo = "test";

    private WebDriver driver;

    public _3CheckoutStepOne(WebDriver existingDriver) {
        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    private final By FIRST_NAME = By.cssSelector(".form_group [name=\"firstName\"]");
    private final By LAST_NAME = By.cssSelector(".form_group [name=\"lastName\"]");
    private final By POSTAL_CODE = By.cssSelector(".form_group [name=\"postalCode\"]");
    private final By BTN_CONTINUE = By.cssSelector(".btn[name=\"continue\"]");

    public WebElement getFirstName() {

        return getDriver().findElement(FIRST_NAME);
    }

    public WebElement getLastName() {

        return getDriver().findElement(LAST_NAME);
    }

    public WebElement getPostalCode() {

        return getDriver().findElement(POSTAL_CODE);
    }

    public WebElement getBtnContinue() {

        return getDriver().findElement(BTN_CONTINUE);
    }

    public void sendFirstName() {

        getFirstName().sendKeys(checkoutInfo);
    }

    public void sendFLastName() {

        getLastName().sendKeys(checkoutInfo);
    }

    public void sendPostalCode() {

        getPostalCode().sendKeys(checkoutInfo);
    }

    public void clickBtnContinue() {

        getBtnContinue().click();
    }
}
