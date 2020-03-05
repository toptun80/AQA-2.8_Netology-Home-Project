package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

@Name("Личный кабинет")
public class DashboardPage extends AkitaPage {

    private String card1Info = $(withText("**** 0001")).getText();
    private String sumInfo = card1Info.substring(card1Info.indexOf("баланс:") + 7, card1Info.lastIndexOf("р.")).trim();

    @Name("Баланс карты")
    public int balance = Integer.parseInt(sumInfo);

    @Name("Пополнить")
    @FindAll({
            @FindBy(css = "[data-test-id=action-deposit]")
    } )
    public List<SelenideElement> replenishButtons;
}
