package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static data.TestData.VALID_LOGIN_UI;
import static data.TestData.VALID_PASSWORD_UI;

public class MainPage extends ParentPage {
    @FindBy(xpath = "//*[text()='Вхід']")
    protected WebElement buttonEnter;
    @FindBy(xpath = ".//*[@name='password']")
    protected WebElement inputPassword;
    @FindBy(xpath = "//*[@name='email' and @placeholder='Ваш e-mail або телефон']")
    protected WebElement inputLogin;
    @FindBy(xpath = "//*[@value='Увійти']")
    protected WebElement buttonEnterInLoginMenu;
    @FindBy(xpath = "//*[text()='Реєстрація']")
    private WebElement buttonRegistration;


    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void openMainPage() {
        try {
            webDriver.get("https://zoostar.ua/");
            logger.info("Main page was opened");
        } catch (Exception e) {
            logger.error("Can not open main page");
            Assert.fail("Can not open main page");
        }
    }
    public void enterTextIntoInputLogin(String login) {
        enterTextIntoInput(inputLogin, login);
    }
    public void enterTextIntoInputPassword(String password) {
        enterTextIntoInput(inputPassword, password);
    }
    public void clickONButtonEnter() {
        clickOnElement(buttonEnter);
    }
    public void clickONButtonEnterInLoginMenu() {
        clickOnElement(buttonEnterInLoginMenu);
    }
    public boolean isButtonEnterVisible() {
        return isElementDisplayed(buttonEnter);
    }

    public void clickOnButtonRegistration() {
        clickOnElement(buttonRegistration);
    }

    public HomePage openMainPageAndFillLoginFormWithValidData() {
        openMainPage();
        clickONButtonEnter();
        enterTextIntoInputLogin(VALID_LOGIN_UI);
        enterTextIntoInputPassword(VALID_PASSWORD_UI);
        clickONButtonEnterInLoginMenu();
        return new HomePage(webDriver);
    }
}
