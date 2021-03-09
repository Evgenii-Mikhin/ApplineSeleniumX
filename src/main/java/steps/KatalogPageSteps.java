package steps;

import io.qameta.allure.Step;
import pages.KatalogPage;

public class KatalogPageSteps {
    @Step("Нажать на - Страхование путешественников {0}")
    public void selectKatalogMenuItem () {
        new KatalogPage().selectKatalogMenuItem();
    }

}