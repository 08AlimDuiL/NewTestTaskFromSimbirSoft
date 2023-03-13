package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CheckoutComplete extends BasePage {

    public CheckoutComplete(WebDriver driver) {

        super(driver);
    }

    private final By COMPLETE_HEADER = By.className("complete-header");

    public WebElement getCompleteHeader() {

        return getDriver().findElement(COMPLETE_HEADER);
    }

    public String getTextCompleteHeader() {

        return getText(getCompleteHeader());
    }
}
