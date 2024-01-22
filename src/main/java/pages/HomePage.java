package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{
    @FindBy(xpath = "//*[@class='log_name']")
    private WebElement login;
    @FindBy(xpath = "//header//div//div//a//i[@class='wish-icon']")
    private WebElement iconWish;
    @FindBy(xpath = "//*[@href='/user#tab-1']")
    private WebElement buttonPersonalData;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public boolean isLoginVisible() {
        return isElementDisplayed(login);
    }

    public boolean isIconWishVisible() {
        return isElementDisplayed(iconWish);
    }

    public void clickOnButtonMyAccount() {
        clickOnElement(login);
    }

    public void clickOnButtonPersonalData() {
        clickOnElement(buttonPersonalData);
    }
}
