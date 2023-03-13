package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CheckoutStepOnePage extends BasePage {
    private static final String checkoutInfo = "test";

    public CheckoutStepOnePage(WebDriver driver) {

        super(driver);
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

    public CheckoutStepOnePage fillFirstName() {
        getFirstName().sendKeys(checkoutInfo);

        return this;
    }

    public CheckoutStepOnePage fillFLastName() {
        getLastName().sendKeys(checkoutInfo);

        return this;
    }

    public CheckoutStepOnePage fillPostalCode() {
        getPostalCode().sendKeys(checkoutInfo);

        return this;
    }

    public CheckoutStepOnePage clickBtnContinue() {
        getBtnContinue().click();

        return new CheckoutStepOnePage(getDriver());
    }
}
