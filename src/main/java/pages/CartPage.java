package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage{
    @FindBy(xpath = "//*[@class=\"brand\"]")
    private WebElement brand;
    @FindBy(xpath = "//td[@class=\"name\"]//*[@href=\"products/festival-korm-supier-priemium-linii-dlia-priwieriedliwych-sobak-8626\"]")
    private WebElement productName;
    @FindBy(xpath = "//*[@class=\"sku\"]")
    private WebElement productArticul;
    @FindBy(xpath = "//*[@class=\"price total\"]")
    private WebElement productPrice;

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CartPage isBrandJoseraVisible( String text) {
        checkTextInElement(brand, text.toUpperCase());
        logger.info("Brand Josera is visible");
        return this;
    }

    public CartPage isProductNameVisible(String text) {
        checkTextInElement(productName, text.toUpperCase());
        logger.info("Product name is visible");
        return this;
    }

    public CartPage isProductArticleVisible(String text) {
        checkTextInElement(productArticul, text.toUpperCase());
        logger.info("Product article is visible");
        return this;
    }

    public CartPage isProductPriceVisible(String text) {
        checkTextInElement(productPrice, text.toUpperCase());
        logger.info("Product price is visible");
        return this;
    }
}
