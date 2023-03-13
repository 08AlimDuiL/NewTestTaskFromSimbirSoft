package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class InventoryPage extends BasePage {
    public InventoryPage(WebDriver driver) {

        super(driver);
    }
    private final By TITLE = By.cssSelector(".title");
    private final By FIRST_GOOD = By.cssSelector(".inventory_list .inventory_item:first-child .btn");
    private final By SHOPPING_CONTAINER = By.cssSelector(".shopping_cart_link");

    public WebElement getTitle() {

        return getDriver().findElement(TITLE);
    }

    public WebElement getFirstGood() {

        return getDriver().findElement(FIRST_GOOD);
    }

    public WebElement getShoppingContainer() {

        return getDriver().findElement(SHOPPING_CONTAINER);
    }

    public String getTextTitle() {

        return getTitle().getText();
    }

    public void clickBtnOfFirstGood() {

        getFirstGood().click();
    }

    public void clickShoppingLink() {

        getShoppingContainer().click();
    }
}
