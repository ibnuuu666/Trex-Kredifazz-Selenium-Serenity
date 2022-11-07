package starter.pages.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import starter.pages.BasePageObject;

public class PersonalLoanPage extends BasePageObject {

    //get cookies login
    public void getCookiesLogin() {
        getDriver().navigate().to("https://auth-staging.kredifazz.id/oauth2/authorize?client_id=54b33e1f-e139-4536-9aa5-c243eae94084&redirect_uri=https://trex-staging.kredifazz.id/auth/oauth2callback&response_type=code&scope=offline_access");
        getDriver().manage().getCookies();
    }

    //refresh page
    public void refreshPage() {
        Actions actions = new Actions(getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
    }

    public void clickButton(String value) {
        By element = By.xpath("//div[contains(text(),\"" + value + "\")]");
        clickOn(element);
    }

    public void selectDate() {
        By element = By.xpath("//tbody/tr[1]/td[5]/div[1]");
        clickOn(element);
    }

    public void changeMonth() {
        By element = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/h3[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/span[1]/span[1]");
        clickOn(element);
    }

    public void clickButtonPopulate() {
        By element = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/h3[1]/button[1]/span[1]");
        clickOn(element);
    }

    public void clickButtonPopulateOnPopup() {
        By element = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/h3[1]/div[1]/div[2]/button[1]/span[1]/span[1]");
        clickOn(element);
    }

    public void clickCheckboxSelectAll() {
        By element = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/label[1]/span[2]");
        clickOn(element);
    }

    public void inputSearch(String value, String row) {
//        By element = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[\" "+ row +" \"]/div[1]");
        By element = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[1]/div[1]/input[1]");
        typeOn(element, value);
    }
}
