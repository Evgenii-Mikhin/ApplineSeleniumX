package pages;

import steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSteps {
    @FindBy(xpath = "//li[@class='kitt-top-menu__item kitt-top-menu__item_first']/a[contains(text(),'Страхование')]")
    public WebElement menuItems;

    @FindBy(xpath = "//a[contains(text(),'Перейти в каталог')]")
    WebElement menuInsurance;

    public MainPage(){

        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void selectMenuItems (String itemName) {
        menuItems.findElement(By.xpath("//li[@class='kitt-top-menu__item kitt-top-menu__item_first']/a[contains(text(),'" + itemName + "')]")).click();
    }
    public void selectInsuranceItem(String itemName) {
        menuInsurance.findElement(By.xpath("//a[contains(text(),'" + itemName + "')]")).click();
    }
}
