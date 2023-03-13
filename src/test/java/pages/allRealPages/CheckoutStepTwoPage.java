package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CheckoutStepTwoPage extends BasePage {

    public CheckoutStepTwoPage(WebDriver driver) {

        super(driver);
    }

    private final By BTN_FINISH = By.id("finish");

    public WebElement getBtnFinish() {

        return getDriver().findElement(BTN_FINISH);
    }

    public  CheckoutStepTwoPage clickBtnFinish() {
        getBtnFinish().click();

        return this;
    }
}
