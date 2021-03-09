package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;


//5.Проверить наличие на странице заголовка – Страхование путешественников
//6. Нажать на – Оформить Онлайн
public class LifeTravelPage {
    @FindBy(xpath = "//*[text()='Страхование путешественников']")
    public static WebElement elementOfSite;
    @FindBy(xpath = "//span[contains(text(),'Оформить онлайн')]")
    public static WebElement registrationButton;


    public LifeTravelPage()  {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void assertEqualsElements (String text) {
       assertEquals(text, elementOfSite.getText());
    }
    public void confirmButton () {
        registrationButton.click();
    }
}