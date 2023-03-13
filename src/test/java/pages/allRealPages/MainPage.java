package pages.allRealPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class MainPage extends BasePage {
    private static final String notValidData = "test";
    private static final String validUserName = "standard_user";
    private static final String validPassword = "secret_sauce";

    public MainPage(WebDriver driver) {

        super(driver);
    }

    private final By USER_NAME = By.xpath(
            "//div[@class = 'form_group']/input[@name='user-name']"
    );
    private final By PASSWORD = By.xpath(
            "//div[@class = 'form_group']/input[@type='password']"
    );
    private final By CLICK_LOG = By.xpath(
            "//input[@class ='submit-button btn_action']"
    );
    private final By HEADER_ERROR = By.xpath(
            "//div[@class = 'error-message-container error']"
    );

    public WebElement getUserName() {

        return getDriver().findElement(USER_NAME);
    }

    public WebElement getPassword() {

        return getDriver().findElement(PASSWORD);
    }

    public WebElement getClickLog() {

        return getDriver().findElement(CLICK_LOG);
    }

    public WebElement getError() {

        return getDriver().findElement(HEADER_ERROR);
    }

    public void sendUserName() {

        getUserName().sendKeys(validUserName);
    }

    public void sendNotValidUserName() {

        getUserName().sendKeys(notValidData);
    }

    public void sendPassword() {

        getPassword().sendKeys(validPassword);
    }

    public void sendNotValidPassword() {

        getPassword().sendKeys(notValidData);
    }

    public void clickLog() {

        getClickLog().click();
    }

    public String getTextError() {

        return getText(getError());
    }
}


