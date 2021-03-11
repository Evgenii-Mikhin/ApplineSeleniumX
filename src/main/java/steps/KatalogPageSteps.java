package steps;

import pages.KatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class KatalogPageSteps {
    @Step("Нажать на - Страхование путешественников {0}")
    public void selectKatalogMenuItem () {
        new KatalogPage().selectKatalogMenuItem();
    }

}