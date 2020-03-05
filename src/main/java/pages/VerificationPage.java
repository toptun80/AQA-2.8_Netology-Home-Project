package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("СМС подтверждение авторизации")
public class VerificationPage extends AkitaPage {

    @Name("СМС-код")
    @FindBy(css = "[name=code]")
    public SelenideElement codeField;

    @Name("Подтвердить")
    @FindBy(css = "[data-test-id=action-verify]")
    public SelenideElement verifyButton;
}