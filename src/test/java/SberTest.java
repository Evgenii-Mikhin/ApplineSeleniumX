import steps.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SberTest extends BaseSteps {

    @DisplayName("Заявка на страховку путешественника")
    @Test
    public void testInsurance() {
        MainPageSteps mainPageSteps = new MainPageSteps();
        KatalogPageSteps katalogPageSteps = new KatalogPageSteps();
        LifeTravelPageSteps lifeTravelPageSteps   = new LifeTravelPageSteps();
        RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps ();
        FormingPageSteps formingPageSteps = new FormingPageSteps ();

        mainPageSteps.selectMenuItems("Страхование");
        mainPageSteps.selectInsuranceItem("Перейти в каталог");

        katalogPageSteps.selectKatalogMenuItem();

        lifeTravelPageSteps.checkText("Страхование путешественников");
        lifeTravelPageSteps.confirmButttonLifeTravel();

        registrationPageSteps.waitSendAppClickable();

        formingPageSteps.fillField("Фамилия застрахованного", "Аладар");
        formingPageSteps.fillField("Имя застрахованного", "Кирилл");
        formingPageSteps.fillField("Дата рождения застрахованного", "02.02.1990");

        formingPageSteps.fillField("Фамилия страхователя", "Иванов");
        formingPageSteps.fillField("Имя страхователя", "Иван");
        formingPageSteps.fillField("Имя отчества страхователя", "Иванович");
        formingPageSteps.fillField("Дата рождения страхователя", "02.02.1990");

        formingPageSteps.fillField("Серия паспорта", "5555");
        formingPageSteps.fillField("Номер паспорта", "123456");
        formingPageSteps.fillField("Дата регистрации", "02021990");
        formingPageSteps.fillField("Кем выдан паспорт", "Тест");

        formingPageSteps.fameleButton();

        formingPageSteps.checkField("Фамилия застрахованного", "Аладар");
        formingPageSteps.checkField("Имя застрахованного", "Кирилл");
        formingPageSteps.checkField("Дата рождения застрахованного", "02.02.1990");

        formingPageSteps.checkField("Фамилия страхователя", "Иванов");
        formingPageSteps.checkField("Имя страхователя", "Иван");
        formingPageSteps.checkField("Имя отчества страхователя", "Иванович");
        formingPageSteps.checkField("Дата рождения страхователя", "02.02.1990");

        formingPageSteps.checkField("Серия паспорта", "5555");
        formingPageSteps.checkField("Номер паспорта", "123456");
        formingPageSteps.checkField("Дата регистрации", "02.02.2010");
        formingPageSteps.checkField("Кем выдан паспорт", "Тест");

        formingPageSteps.confirmButton();

        formingPageSteps.checkAlertText("Поле не заполнено.");
        formingPageSteps.checErrorMessage("При заполнении данных произошла ошибка");

    }
}