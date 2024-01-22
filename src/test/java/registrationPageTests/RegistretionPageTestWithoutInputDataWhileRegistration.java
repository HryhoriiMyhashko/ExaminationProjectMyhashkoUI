package registrationPageTests;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class RegistretionPageTestWithoutInputDataWhileRegistration extends BaseTest {
    @Test
    public void registrationPageTestWithoutInputDataWhileRegistration_TC_2() {
        pageProvider.mainPage().openMainPage();
        pageProvider.mainPage().clickONButtonEnter();
        pageProvider.mainPage().clickOnButtonRegistration();
        pageProvider.registrationPage().clickOnButtonRegistration();


        Assert.assertTrue("Повідомлення про помилку для параметру ім'я присутнє",
                pageProvider.registrationPage().isErrorForNameOnRegistrationPageVisible());
        Assert.assertTrue("Повідомлення про помилку для параметру email присутнє",
                pageProvider.registrationPage().isErrorForEmailOnRegistrationPageVisible());
        Assert.assertTrue("Повідомлення про помилку для параметру пароль присутнє",
                pageProvider.registrationPage().isErrorForPasswordOnRegistrationPageVisible());
        Assert.assertTrue("Повідомлення про помилку для параметру підтвердження паролю присутнє",
                pageProvider.registrationPage().isErrorForConfirmPasswordOnRegistrationPageVisible());
    }


}
