package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Авторизация")
public class LoginPage extends AkitaPage {

    @Name("Логин")
    @FindBy(css = "[name=login]")
    public SelenideElement loginField;

    @Name("Пароль")
    @FindBy(css = "[name=password]")
    public SelenideElement passwordField;

    @Name("Продолжить")
    @FindBy(css = "[data-test-id=action-login]")
    public SelenideElement loginButton;
}