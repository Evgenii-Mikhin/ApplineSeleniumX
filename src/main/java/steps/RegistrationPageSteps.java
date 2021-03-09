package steps;

import io.qameta.allure.Step;
import pages.RegistrationPage;

public class RegistrationPageSteps {
        @Step("Нажать кнопку /Оформить/ С выбранной минимальной суммой {0}")
        public void waitSendAppClickable () {
            new RegistrationPage().waitSendAppClickable();
        }
}
