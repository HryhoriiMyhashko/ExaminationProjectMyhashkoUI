package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends ParentPage{
    @FindBy(xpath = "//*[@data-price=\"3,375.00\" and @class=\"add_to_cart test03\"]")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//*[@href=\"./cart\"]")
    private WebElement buttonGoToCartPage;
    @FindBy(xpath = "//*[@class=\"add-wish-icon\"]")
    private WebElement buttonAddToWishList;
    @FindBy(xpath = "//header//div//a//i[@class=\"wish-icon\"]")
    private WebElement buttonGoToWishPage;


    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnButtonAddToCart() {
        clickOnElement(buttonAddToCart);
    }

    public void clickOnButtonGoToCartPage() {
        clickOnElement(buttonGoToCartPage);
    }

    public void clickOnButtonAddToWishList() { clickOnElement(buttonAddToWishList);

    }

    public void clickOnButtonGoToWishPage() {   clickOnElement(buttonGoToWishPage);

    }
}
