package ru.netology.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Пополнение карты")
public class FundsTransferPage extends AkitaPage {

    @Name("Сумма")
    @FindBy(css = "[data-test-id=amount] input")
    public SelenideElement amountField;

    @Name("Откуда")
    @FindBy(css = "[data-test-id=from] input")
    public SelenideElement formCardField;

    @Name("Пополнить")
    @FindBy(css = "[data-test-id=action-transfer]")
    public SelenideElement transferButton;
}
