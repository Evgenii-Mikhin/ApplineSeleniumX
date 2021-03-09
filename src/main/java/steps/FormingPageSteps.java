package steps;
import io.qameta.allure.Step;
import pages.FormingPage;


public class FormingPageSteps {
    @Step("Заполнить поле \"{0}\"")
    public void fillField (String nameOfCell, String value) {
        new FormingPage().fillField(nameOfCell,value);
    }
    @Step("Выбрать пол /Женский/ {0}")
    public void fameleButton () {
        new FormingPage().fameleButton();
    }
    @Step("Проверить поле \"{0}\"")
    public void checkField (String nameOfCell, String value) {
        new FormingPage().checkField(nameOfCell, value);
    }
    @Step("Нажать на кнопку /Продолжить/ {0}")
    public void confirmButton () {
        new FormingPage().confirmButton();
    }
    @Step("Проверить сообщение об ошибке {0}")
   public  void checkAlertText(String text){
        new FormingPage().checkAlertText(text);
    }
    @Step("Проверить сообщение об ошибке {0}")
    public  void checErrorMessage(String text) {
        new FormingPage().checErrorMessage(text);
    }
}
