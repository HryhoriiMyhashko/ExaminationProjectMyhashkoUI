package cartPageTest;

import baseTest.BaseTest;
import org.junit.Test;

public class CartPageTests extends BaseTest{
    @Test
    public void cartPageTestAddProduct_TC_04(){
        pageProvider.mainPage().openMainPageAndFillLoginFormWithValidData();
        pageProvider.homePage().enterTextIntoSearchField("Josera Festival");
        pageProvider.homePage().clickOnButtonSearch();
        pageProvider.productPage().clickOnButtonAddToCart();
        pageProvider.productPage().clickOnButtonGoToCartPage();

        pageProvider.cartPage().isBrandJoseraVisible("Josera");
        pageProvider.cartPage().isProductNameVisible("Сухий корм із лососем і птицею для собак усіх порід Josera Festival");
        pageProvider.cartPage().isProductArticleVisible("Артикул: JO-24");
        pageProvider.cartPage().isProductPriceVisible("3,375.00 грн");
    }

}
