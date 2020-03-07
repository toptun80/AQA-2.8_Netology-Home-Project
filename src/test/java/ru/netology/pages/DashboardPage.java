package ru.netology.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Личный кабинет")
public class DashboardPage extends AkitaPage {

    @Name("Информация о карте")
    @FindBy(css = ".list__item")
    public SelenideElement cardInfo;

    @Name("Пополнить")
    @FindBy(css = "[data-test-id=action-deposit]")
    public SelenideElement replenishButtons;
}
