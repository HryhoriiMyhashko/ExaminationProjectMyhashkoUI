package pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    protected WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage mainPage() {
        return new MainPage(webDriver);
    }

    public HomePage homePage() {
        return new HomePage(webDriver);
    }
    public RegistrationPage registrationPage() {
        return new RegistrationPage(webDriver);
    }
    public PersonalDataPage personalDataPage() {
        return new PersonalDataPage(webDriver);
    }
}
