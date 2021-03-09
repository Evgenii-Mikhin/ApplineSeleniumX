package steps;

import io.qameta.allure.Step;
import pages.LifeTravelPage;

public class LifeTravelPageSteps {
    @Step("Проверить содержание заголовка {0}")
    public void checkText (String text) {
        new LifeTravelPage().assertEqualsElements (text);

    }
    @Step("Нажать на кнопку /Оформить онлайн/ {0}")
    public void confirmButttonLifeTravel () {
        new LifeTravelPage().confirmButton ();

    }

}
