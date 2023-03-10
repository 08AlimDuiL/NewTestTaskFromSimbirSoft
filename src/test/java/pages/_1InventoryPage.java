package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1InventoryPage {
    private WebDriver driver;

    public _1InventoryPage(WebDriver existingDriver) {
        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }


    private final By TITLE = By.xpath("//span[@class='title']");
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

}