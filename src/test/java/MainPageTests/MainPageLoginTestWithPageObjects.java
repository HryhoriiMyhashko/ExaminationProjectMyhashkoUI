package MainPageTests;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static data.TestData.VALID_LOGIN_UI;
import static data.TestData.VALID_PASSWORD_UI;

public class MainPageLoginTestWithPageObjects extends BaseTest {
    @Test
    public void validLogin_TC_1() {
        pageProvider.mainPage().openMainPage();
        pageProvider.mainPage().clickONButtonEnter();
        pageProvider.mainPage().enterTextIntoInputLogin(VALID_LOGIN_UI);
        pageProvider.mainPage().enterTextIntoInputPassword(VALID_PASSWORD_UI);
        pageProvider.mainPage().clickONButtonEnterInLoginMenu();

        Assert.assertFalse("Відсутня кнопка 'Вхід'", pageProvider.mainPage().isButtonEnterVisible());
        Assert.assertTrue("Присутній логін користувача", pageProvider.homePage().isLoginVisible());
        Assert.assertTrue("Присутня іконка списку бажань", pageProvider.homePage().isIconWishVisible());
    }

}
