package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {
    BaseSteps baseSteps = new BaseSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    KatalogPageSteps katalogPageSteps = new KatalogPageSteps();
    LifeTravelPageSteps lifeTravelPageSteps   = new LifeTravelPageSteps();
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps ();
    FormingPageSteps formingPageSteps = new FormingPageSteps ();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItems(String menuItem1){
        mainPageSteps.selectMenuItems(menuItem1);
    }
    @When("^выполнен переход в каталог \"(.+)\"$")
    public void selectInsuranceItem(String menuItem2){
        mainPageSteps.selectInsuranceItem(menuItem2);
    }
    @When("^нажать на кнопку Страхование путешественников\"$")
    public void selectKatalogMenuItem() {katalogPageSteps.selectKatalogMenuItem();
    }
    @Then("^проверить содержимое заголовка \"(.*)\"$")
    public void checkText(String text) {
        lifeTravelPageSteps.checkText(text);
    }
    @When("^нажать кнопку \"Оформить онлайн\"$")
    public void confirmButttonLifeTravel() {
        lifeTravelPageSteps.confirmButttonLifeTravel();
    }
    @When("^нажать кнопку Оформить с выбраной минимальной суммой$")
    public void waitSendAppClickable() {
        registrationPageSteps.waitSendAppClickable();
    }
    @When("^заполнение формы:$")
    public void fillField(DataTable dataTable) {
        dataTable.asMap(String.class, String.class)
                .forEach((nameOfCell, value) -> formingPageSteps.fillField(nameOfCell, value));
    }
    @Then("^выбран пол$")
    public void fameleButton() {
        formingPageSteps.fameleButton();
    }
    @Then("^проверка полей:$")
    public void checkField(DataTable dataTable) {
        dataTable.asMap(String.class, String.class)
                .forEach((nameOfCell, value) -> formingPageSteps.checkField(nameOfCell, value));
    }

    @When("^нажать кнопку Продолжить$")
    public void stepConfirmButtonClick() {
        formingPageSteps.confirmButton();
    }
    @Then("^проверить сообщение об ошибке:\"(.*)\"$")
    public void checkAlertText(String text) {
        formingPageSteps.checkAlertText(text);
    }
    @Then("^проверить сообщение об ошибке - \"(.*)\"$")
    public void checErrorMessage(String text) {
        formingPageSteps.checErrorMessage(text);
    }
}
