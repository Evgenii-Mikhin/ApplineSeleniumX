package steps;
import io.qameta.allure.Step;
import pages.MainPage;


public class MainPageSteps {
    @Step("Перейти в страхование {0}")
    public void selectMenuItems(String menuItem1){

        new MainPage().selectMenuItems(menuItem1);
    }
    @Step("Переход в каталог {0}")
    public void selectInsuranceItem (String menuItem2){

        new MainPage().selectInsuranceItem(menuItem2);
    }
}
