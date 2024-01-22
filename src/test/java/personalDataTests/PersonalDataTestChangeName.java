package personalDataTests;

import baseTest.BaseTest;
import org.junit.After;
import org.junit.Test;

public class PersonalDataTestChangeName extends BaseTest {

    @Test
    public void personalDataTestChangeName() {
        pageProvider.mainPage().openMainPageAndFillLoginFormWithValidData();
        pageProvider.homePage().clickOnButtonMyAccount();
        pageProvider.homePage().clickOnButtonPersonalData();
        pageProvider.personalDataPage().enterTextIntoNameField("TestName");
        pageProvider.personalDataPage().clickOnButtonSave();

        pageProvider.personalDataPage().checkLoginAreChanged();
    }

    @After
    public void changeNameBack() {
        pageProvider.homePage().clickOnButtonMyAccount();
        pageProvider.homePage().clickOnButtonPersonalData();
        pageProvider.personalDataPage().enterTextIntoNameField("2");
        pageProvider.personalDataPage().clickOnButtonSave();
    }
}
