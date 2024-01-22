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
    @FindBy(xpath = "//*[@class='search-field live-search__field js-live-search-field input_search']")
    private WebElement inputSearch;
    @FindBy(xpath = "//*[@class='button_search live-search__submit']")
    private WebElement buttonSearch;


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

    public void enterTextIntoSearchField(String text) {
        enterTextIntoInput(inputSearch, text);

    }

    public void clickOnButtonSearch() {
        clickOnElement(buttonSearch);
    }
}
