package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishPage extends ParentPage{
    @FindBy(xpath = "//*[@class=\"the_good_price\"]")
    private WebElement price;
    @FindBy(xpath = "//*[@class=\"brand\"]")
    private WebElement brand;
    @FindBy(xpath = "//p//*[@href=\"/igrushka-dlia-sobak-swistiashtchij-miatch-dlia-sobak-sriednich-razm-29877\"]")
    private WebElement name;
    @FindBy(xpath = "//*[@href=\"javascript:;\"]")
    private WebElement deleteProductFromWishList;

    public WishPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WishPage isPriceVisible(String text) {
        checkTextInElement(price, text.toUpperCase());
        logger.info("Price is visible");
        return this;

    }

    public WishPage isProductBrandVisible(String text) {
        checkTextInElement(brand, text.toUpperCase());
        logger.info("Product brand is visible");
        return this;
    }

    public WishPage isProductNameVisible(String Text) {
        checkTextInElement(name, Text.toUpperCase());
        logger.info("Product name is visible");
        return this;
    }

    public void clickOnButtonDeleteProductFromWishList() {
        clickOnElement(deleteProductFromWishList);
    }
}
