package pages;

import steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertEquals;

/*
9.На вкладке Оформление заполнить поля:
        •Фамилию и Имя, Дату рождения застрахованных
        •Данные страхователя: Фамилия, Имя, Отчество, Дата рождения, Пол
        •Паспортные данные
        •Контактные данные не заполняем
10.Проверить, что все поля заполнены правильно
11.Нажать продолжить
12.Проверить, что появилось сообщение - "При заполнении данных произошла ошибка", "Поле не заполнено"
 */
public class FormingPage {
    // Застрахованные.
    @FindBy(id = "surname_vzr_ins_0")
    public WebElement surnameVZR;

    @FindBy(id = "name_vzr_ins_0")
    public WebElement nameVZR;

    @FindBy(id = "birthDate_vzr_ins_0")
    public WebElement dateVZR;

    // Страхователь
    @FindBy(id = "person_lastName")
    public WebElement person_lastName;

    @FindBy(id = "person_firstName")
    public WebElement person_firstName;

    @FindBy(id = "person_middleName")
    public WebElement person_middleName;

    @FindBy(id = "person_birthDate")
    public WebElement person_birthDate;

    // Выбрать пол.
    @FindBy(xpath = "//label[contains(text(),'Женский')]")
    public WebElement btn;

    // Паспортные данные.
    @FindBy(id = "passportSeries")
    public WebElement passportSeries;

    @FindBy(id = "passportNumber")
    public WebElement passportNumber;

    @FindBy(id = "documentDate")
    public WebElement documentDate;

    @FindBy(id = "documentIssue")
    public WebElement documentIssue;

    //кнопка 'Продолжить'
    @FindBy(xpath = "//*[contains(text(),'Продолжить')]")
    public WebElement btnContinue;

    // Найти ошибки
    @FindBy(xpath = "//*[text()='Поле не заполнено.']")
    public WebElement alertText;

    @FindBy(xpath = "//div[@class='alert-form alert-form-error']")
    public static WebElement textErrorMessage;


   /* // Найти ошибку "Поле не заполнено"
    @FindBy(xpath = "//*[text()='Поле не заполнено.']")
    public static WebElement fieldError;
    // Найти ошибку "При заполнении данных произошла ошибка"
    @FindBy(xpath = "//div[@class='alert-form alert-form-error']")
    public static WebElement textErrorMessage;

    */

    public FormingPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    private void fillField(WebElement element, String value) {
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    private String checkField(WebElement element) {
        return element.getAttribute("value");
    }

    public void confirmButton() {
        btnContinue.click();
    }


    public void fillField(String nameOfCell, String value) {
        switch (nameOfCell) {
            case "Фамилия застрахованного":
                fillField(surnameVZR, value);
                break;
            case "Имя застрахованного":
                fillField(nameVZR, value);
                break;
            case "Дата рождения застрахованного":
                fillField(dateVZR, value);
                break;
            case "Фамилия страхователя":
                fillField(person_lastName, value);
                break;
            case "Имя страхователя":
                fillField(person_firstName, value);
                break;
            case "Имя отчества страхователя":
                fillField(person_middleName, value);
                break;
            case "Дата рождения страхователя":
                fillField(person_birthDate, value);
                break;
            case "Серия паспорта":
                fillField(passportSeries, value);
                break;
            case "Номер паспорта":
                fillField(passportNumber, value);
                break;
            case "Дата регистрации":
                fillField(documentDate, value);
                break;
            case "Кем выдан паспорт":
                fillField(documentIssue, value);
                break;
            default:
                throw new AssertionError("Поле '" + nameOfCell + "'отсутсвует на странице");

        }
    }

    public String getfillField(String nameOfCell) {
        switch (nameOfCell) {
            case "Фамилия застрахованного":
                return checkField(surnameVZR);
            case "Имя застрахованного":
                return checkField(nameVZR);
            case "Дата рождения застрахованного":
                return checkField(dateVZR);
            case "Фамилия страхователя":
                return checkField(person_lastName);
            case "Имя страхователя":
                return checkField(person_firstName);
            case "Имя отчества страхователя":
                return checkField(person_middleName);
            case "Дата рождения страхователя":
                return checkField(person_birthDate);
            case "Серия паспорта":
                return checkField(passportSeries);
            case "Номер паспорта":
                return checkField(passportNumber);
            case "Дата регистрации":
                return checkField(documentDate);
            case "Кем выдан паспорт":
                return checkField(documentIssue);
        }
        throw new AssertionError("Поле не объявлено на странице");
    }

    public void checkField(String nameOfCell, String text) {
        assertEquals(text, getfillField(nameOfCell));
    }

    public void fameleButton() {
        btn.click();
    }

    public void checkAlertText(String text) {
        assertEquals(text, alertText.getText());
    }

    public void checErrorMessage(String text) {
        assertEquals(text, textErrorMessage.getText());

    }
}