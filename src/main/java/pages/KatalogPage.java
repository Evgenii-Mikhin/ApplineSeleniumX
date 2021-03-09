package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

// 4.Нажать на - Страхование путешественников
public class KatalogPage {
    @FindBy(xpath = "//div[@class='uc-full__block uc-full__block_header']//child::a[contains(@href, '/life/travel')]")
    public static WebElement lifeTravel;

    public KatalogPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void selectKatalogMenuItem () {
        JavascriptExecutor js = (JavascriptExecutor)BaseSteps.getDriver(); //Javascript прокрутка к элементу
        js.executeScript("return arguments[0].scrollIntoView(true);", lifeTravel);
        lifeTravel.click();
    }
}
