package pages;
import org.openqa.selenium.JavascriptExecutor;
import steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//7. На вкладке – Выбор полиса  выбрать сумму страховой защиты – Минимальная
//8. Нажать Оформить

public class RegistrationPage {


    @FindBy(xpath = "//button[contains(text(),'Оформить')]")
    public WebElement button;
    @FindBy(xpath = "//div[@class='online-card-program']/*[text()='Минимальная']")
    public WebElement buttonNonSelectedMin;

    public RegistrationPage() { PageFactory.initElements(BaseSteps.getDriver(), this); }
    public void waitSendAppClickable() {

      //  BaseSteps.getDriver().findElement(By.xpath("//div[contains(text(),'РФ и страны СНГ')]")).click();
      //  BaseSteps.getDriver().findElement(By.xpath("//a[contains(text(),'Шенген и страны Совета Европы, кроме РФ')]")).click();  //Проверка кейса else
        JavascriptExecutor js = (JavascriptExecutor)BaseSteps.getDriver(); //Javascript прокрутка к элементу

        if (BaseSteps.getDriver().findElements(By.xpath("//div[@class='online-card-program selected']/*[text()='Минимальная']")).size() > 0) {
            System.out.println("Выбран полис за минимальную стоимость");
            button.click();
        }
        else{
            if (BaseSteps.getDriver().findElements(By.xpath("//div[@class='online-card-program']/*[text()='Минимальная']")).size() > 0) {
                js.executeScript("return arguments[0].scrollIntoView(true);", buttonNonSelectedMin);
                buttonNonSelectedMin.click();
                button.click();
            }
        }
    }
}

