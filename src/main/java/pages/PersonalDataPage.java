package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDataPage extends ParentPage{

    private static String SavedTextOfNameFieldWhichWasEnteredOnPersonalDataPage;
    @FindBy(xpath = "//*[@name='name' and @placeholder=\"Введіть ім'я\"]")
    private WebElement inputName;
    @FindBy(xpath = "//*[@name=\"user\" and @class=\"button_submit\"]")
    private WebElement buttonSave;
    @FindBy(xpath = "//*[@class=\"log_name\"]")
    private WebElement inputLogName;

    public PersonalDataPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PersonalDataPage enterTextIntoNameField(String testName) {
        enterTextIntoInput(inputName, testName);
        this.SavedTextOfNameFieldWhichWasEnteredOnPersonalDataPage = testName;
        return this;
    }

    public void clickOnButtonSave() {
        clickOnElement(buttonSave);
    }

    public PersonalDataPage checkLoginAreChanged() {
        checkTextInElement(inputLogName, getEnteredNameField().toUpperCase());
        logger.info("Text in Name field are changed");
        return this;

    }
    public static String getEnteredNameField() {
        return SavedTextOfNameFieldWhichWasEnteredOnPersonalDataPage;
    }


}
