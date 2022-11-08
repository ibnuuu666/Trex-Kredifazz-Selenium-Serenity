package starter.pages.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import starter.pages.BasePageObject;

public class PersonalLoanPage extends BasePageObject {

    //get cookies login
    public void getCookiesLogin() {
        getDriver().navigate().to("https://auth-staging.kredifazz.id/oauth2/authorize?client_id=54b33e1f-e139-4536-9aa5-c243eae94084&redirect_uri=https://trex-staging.kredifazz.id/auth/oauth2callback&response_type=code&scope=offline_access");
        getDriver().manage().getCookies();
    }

    //refresh page
    public void refreshPage() {
//        Actions actions = new Actions(getDriver());
//        actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
        getDriver().navigate().refresh();
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
        switch (row) {
            case "trx id":
                By trx = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[1]/div[1]/input[1]");
                typeOn(trx, value);
                break;
            case "amount":
                By amt = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[3]/div[1]/input[1]");
                typeOn(amt, value);
                break;
            case "name":
                By nm = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[4]/div[1]/input[1]");
                typeOn(nm, value);
                break;
            case "bank":
                By bnk = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[7]/div[1]/input[1]");
                typeOn(bnk, value);
                break;
            case "transfer status":
                By tf = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[8]/div[1]/input[1]");
                typeOn(tf, value);
                break;
            case "vendor":
                By ve = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[9]/div[1]/input[1]");
                typeOn(ve, value);
                break;
//            case "more than one key":
//                By mk = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[3]/div[1]/input[1]");
//                typeOn(mk, value);
//                break;
        }

    }

    public void deleteSearch(String row) {
        switch (row) {
            case "trx id":
                By trx = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[1]/div[1]/input[1]");
                typeClear(trx, "");
                refreshPage();
                break;
            case "amount":
                By amt = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[3]/div[1]/input[1]");
                typeClear(amt, "");
                refreshPage();
                break;
            case "name":
                By nm = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[4]/div[1]/input[1]");
                typeClear(nm, "");
                refreshPage();
                break;
            case "bank":
                By bnk = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[7]/div[1]/input[1]");
                typeClear(bnk, "");
                refreshPage();
                break;
            case "transfer status":
                By tf = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[8]/div[1]/input[1]");
                typeClear(tf, "");
                refreshPage();
                break;
            case "vendor":
                By ve = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tr[1]/th[9]/div[1]/input[1]");
                typeClear(ve, "");
                refreshPage();
                break;
        }
    }

    public void clickSorting(String row) {
        switch (row) {
            case "trx id":
                By element = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
                clickOn(element);
                break;
            case "created at":
                By el2 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
                clickOn(el2);
                break;
            case "amount":
                By el3 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]");
                clickOn(el3);
                break;
            case "name":
                By el4 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[4]");
                clickOn(el4);
                break;
            case "acc name":
                By el5 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[5]");
                clickOn(el5);
                break;
            case "acc number":
                By el6 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[6]");
                clickOn(el6);
                break;
            case "bank":
                By el7 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[7]");
                clickOn(el7);
                break;
            case "trf status":
                By el8 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[8]");
                clickOn(el8);
                break;
            case "vendor":
                By el9 = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[9]");
                clickOn(el9);
                break;
        }

    }

    public void clickDisplayRows() {
        By el = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]");
        clickOn(el);
    }

    public void selectRows() {
        By el = By.xpath("//div[contains(text(),\"25 Rows\")]");
        clickOn(el);
    }

    public void validationPersonalLoanData() {
        WebElement el = getDriver().findElement(By.xpath("//tbody/tr[16]"));
        String getColor = el.getCssValue("background-color");
        System.out.println(getColor);
        String hexBackColor = Color.fromString(getColor).asHex();
        if (hexBackColor.equals("red")){
            System.out.println("the data of personal loan not added user bank account");
        } else {
            System.out.println("the data of personal loan added user bank account");
        }
    }

    public void buttonCheckSpesificDate(){
        By el = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]");
        clickOn(el);
    }

    public void changeMonthOnSpesificDate(){
        By el = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/span[1]/span[1]");
        clickOn(el);
    }

    public void selectDateOnSpesificDate(){
        By el = By.xpath("//tbody/tr[4]/td[4]/div[1]");
        clickOn(el);
    }

    public void buttonMarkOnSpesificDate(){
        By el = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]");
        clickOn(el);
    }

    public void buttonCheckOnSpesificDate(){
        By el = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]/span[1]");
        clickOn(el);
    }

    public void selectPersonalLoan(){
        WebElement wb = getDriver().switchTo().activeElement().findElement(By.xpath("(//tr//child::input[@type='checkbox'])[1]"));
        wb.click();
    }

    public void buttonForReprocess(){
        By el = By.xpath("//span[contains(text(),'For Reprocess')]");
        clickOn(el);
    }

    public void buttonMoreAction(String type){
        if (type.contains("cancel")){
            By el1 = By.xpath("//span[@id='cancel-payment']");
            clickOn(el1);
        } else if (type.contains("check-all-status")) {
            By el2 = By.xpath("//span[@id='check-transfer']");
            clickOn(el2);
        } else if (type.contains("export-to-xlsx")) {
            By el3 = By.xpath("//span[@id='download-xlsx']");
            clickOn(el3);
        } else if (type.contains("unlock")) {
            By el4 = By.xpath("//span[@id='unlock-checklist']");
            clickOn(el4);
        } else if (type.contains("lock")) {
            By el5 = By.xpath("//span[@id='unlock-checklist']");
            clickOn(el5);
        } else {
            By el = By.xpath("(//span[contains(text(),'More Actions')])[1]");
            clickOn(el);
        }
        
    }

    public void buttonSetting(String type){
        if (type.contains("cancel")){
            WebElement wb = getDriver().switchTo().activeElement().findElement(By.xpath("//*[@role='menu']//child::span[contains(text(),'Cancel')]"));
            wb.click();
        } else if (type.contains("check-transfer-status")) {
            WebElement wb = getDriver().switchTo().activeElement().findElement(By.xpath("//*[@role='menu']//child::span[contains(text(),'Check Transfer Status')]"));
            wb.click();
        } else if (type.contains("submit-reason")) {
            By el = By.xpath("//body/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/form[1]/footer[1]/div[1]/div[1]/button[1]/span[1]");
            clickOn(el);
        } else {
            WebElement wb = getDriver().switchTo().activeElement().findElement(By.xpath("(//tr//child::span[text()='Setting'])[1]"));
            wb.click();
        }
    }

    public void inputReason(String value){
        By el = By.xpath("//input[@id='cancellationReason-uid19']");
        typeOn(el, "Test Cancel");
    }

    public void chooseStartDate(){
        By el = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
        clickOn(el);
    }

    public void chooseEndDate(){
        By el = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
        clickOn(el);
    }
}
