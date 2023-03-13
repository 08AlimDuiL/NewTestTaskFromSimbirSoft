package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPageHeader;

public class InventoryPage extends MainPageHeader {
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

    public InventoryPage clickBtnOfFirstGood() {

        getFirstGood().click();
        return new InventoryPage(getDriver());
    }

    public InventoryPage clickShoppingLink() {

        getShoppingContainer().click();
        return new InventoryPage(getDriver());
    }
}
