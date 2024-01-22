package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage{
    @FindBy(xpath = "//*[@name='register']")
    private WebElement buttonRegistration;
    @FindBy(xpath = "//*[@class='tooltip-inner' and contains(text(),'Введіть імя')]")
    private WebElement ErrorForNameOnRegistrationPage;
    @FindBy(xpath = "//*[@class='tooltip-inner' and contains(text(),'Введіть email')]")
    private WebElement ErrorForEmailOnRegistrationPage;
    @FindBy(xpath = "//*[@class='tooltip-inner' and contains(text(),'Введіть пароль')]")
    private WebElement ErrorForPasswordOnRegistrationPage;
    @FindBy(xpath = "//*[@class='tooltip-inner' and contains(text(),'Введіть пароль повторно')]")
    private WebElement ErrorForPasswordConfirmOnRegistrationPage;


    public RegistrationPage(WebDriver webDriver) {

        super(webDriver);
    }

    public void clickOnButtonRegistration() {
        clickOnElement(buttonRegistration);
    }

    public boolean isErrorForNameOnRegistrationPageVisible() {
        return isElementDisplayed(ErrorForNameOnRegistrationPage);
    }

    public boolean isErrorForEmailOnRegistrationPageVisible() {
        return isElementDisplayed(ErrorForEmailOnRegistrationPage);
    }

    public boolean isErrorForPasswordOnRegistrationPageVisible() {
        return isElementDisplayed(ErrorForPasswordOnRegistrationPage);
    }

    public boolean isErrorForConfirmPasswordOnRegistrationPageVisible() {
        return isElementDisplayed(ErrorForPasswordConfirmOnRegistrationPage);
    }
}
