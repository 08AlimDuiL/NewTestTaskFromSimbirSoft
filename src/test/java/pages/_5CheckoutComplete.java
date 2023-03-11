package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _5CheckoutComplete {
    private WebDriver driver;

    public _5CheckoutComplete(WebDriver existingDriver) {
        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }

    private final By COMPLETE_HEADER = By.className("complete-header");
    public WebElement getCompleteHeader() {

        return getDriver().findElement(COMPLETE_HEADER);
    }
    public String getTextCompleteHeader() {

        return getCompleteHeader().getText();
    }
}
