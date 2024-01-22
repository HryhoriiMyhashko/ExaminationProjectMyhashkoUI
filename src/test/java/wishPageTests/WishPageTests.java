package wishPageTests;

import baseTest.BaseTest;
import org.junit.After;
import org.junit.Test;

public class WishPageTests extends BaseTest {
    @Test
    public void wishPageTestAddProduct_TC_05() {
        pageProvider.mainPage().openMainPageAndFillLoginFormWithValidData();
        pageProvider.homePage().enterTextIntoSearchField("CK-27");
        pageProvider.homePage().clickOnButtonSearch();
        pageProvider.productPage().clickOnButtonAddToWishList();
        pageProvider.productPage().clickOnButtonGoToWishPage();

        pageProvider.wishPage().isPriceVisible("249.00");
        pageProvider.wishPage().isProductBrandVisible("CHUCKIT");
        pageProvider.wishPage().isProductNameVisible("Іграшка для собак свистячий м'яч для собак середніх розмірів THE WHISTLER");
    }
    @After
    public void deleteProductFromWishList() {
        pageProvider.wishPage().clickOnButtonDeleteProductFromWishList();
    }
}
