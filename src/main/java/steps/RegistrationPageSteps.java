package steps;

import pages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

public class RegistrationPageSteps {
        @Step("Нажать кнопку /Оформить/ С выбранной минимальной суммой {0}")
        public void waitSendAppClickable () {
            new RegistrationPage().waitSendAppClickable();
        }
}
