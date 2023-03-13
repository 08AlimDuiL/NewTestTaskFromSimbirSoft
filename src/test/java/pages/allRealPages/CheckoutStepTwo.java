package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CheckoutStepTwo extends BasePage {

    public CheckoutStepTwo(WebDriver driver) {

        super(driver);
    }

    private final By BTN_FINISH = By.id("finish");

    public WebElement getBtnFinish() {

        return getDriver().findElement(BTN_FINISH);
    }

    public void clickBtnFinish() {

        getBtnFinish().click();
    }
}
