import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private By registerButton = By.cssSelector("#vue-app > div.header-panel > div > div:nth-child(2) > div > div.header-panel__usr-new > a");
    private By NameField = By.cssSelector("#reg-name");
    private By EmailField = By.cssSelector("#reg-email");
    private By PassField = By.cssSelector("#reg-pass");
    private By CheckBoxRuls = By.cssSelector("#vue-app > section.section > div.container.container_desktop > div > form > div.order-auth-form__email-reg > div.order-auth-form__agreement > label:nth-child(1)");
    private By CheckBoxNews = By.cssSelector("#vue-app > section.section > div.container.container_desktop > div > form > div.order-auth-form__email-reg > div.order-auth-form__agreement > label:nth-child(2)");
    private By buttonRegister = By.cssSelector("#vue-app > section.section > div.container.container_desktop > div > form > div.order-auth-form__email-reg > p.order-auth__confirm-reg > button");

    public boolean PopapElementPresent() {
        $(registerButton).click();
        return $(NameField).isDisplayed()
                &&$(EmailField).isDisplayed()
                &&$(PassField).isDisplayed()
                &&$(CheckBoxRuls).isDisplayed()
                &&$(CheckBoxNews).isDisplayed()
                &&$(buttonRegister).isDisplayed();
    }

}
