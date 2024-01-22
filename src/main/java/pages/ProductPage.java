package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends ParentPage{
    @FindBy(xpath = "//*[@data-price=\"3,375.00\" and @class=\"add_to_cart test03\"]")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//*[@href=\"./cart\"]")
    private WebElement buttonGoToCartPage;


    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnButtonAddToCart() {
        clickOnElement(buttonAddToCart);
    }

    public void clickOnButtonGoToCartPage() {
        clickOnElement(buttonGoToCartPage);
    }
}
