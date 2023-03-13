package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CartPage extends BasePage {

     public CartPage(WebDriver  driver) {

         super(driver);
     }
    private final By CHECKOUT_BTN = By.id("checkout");

    public WebElement getCheckoutBtn() {

        return getDriver().findElement(CHECKOUT_BTN);
    }

    public void clickCheckoutBtn() {

        getCheckoutBtn().click();
    }
}
