package starter.pages.page_object;


import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import starter.pages.BasePageObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

@DefaultUrl("https://auth-staging.kredifazz.id/oauth2/authorize?client_id=54b33e1f-e139-4536-9aa5-c243eae94084&redirect_uri=https://trex-staging.kredifazz.id/auth/oauth2callback&response_type=code&scope=offline_access")

public class LoginPage extends BasePageObject {

    public void saveLoginToCookies () {
        File file = new File ("browser.data");
        try {
            file.delete();
            file.createNewFile();
            FileWriter fos = new FileWriter(file);
            BufferedWriter bos = new BufferedWriter(fos);

            for (Cookie ck : getDriver().manage().getCookies()){
                bos.write((ck.getName()+";"
                +ck.getValue()+";"
                +ck.getDomain()+";"
                +ck.getPath()+";"
                +ck.getExpiry()+";"
                +ck.isSecure()));
                System.out.println(ck);
                bos.newLine();
            }
            bos.flush();
            bos.close();
            fos.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void inputFieldEmail(String value) {
        By element = By.xpath("//input[@id='loginId']");
        typeOn(element, value);
    }

    public void inputFieldPassword(String value) {
        By element = By.xpath("//input[@id='password']");
        typeOn(element, value);
    }

    public void clickSubmit() {
//        By element = By.xpath("//body/main[1]/main[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/button[1]");
//        clickOn(element);
        WebElement elementToClick = getDriver().findElement(By.xpath("//body/main[1]/main[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/button[1]"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", elementToClick);

    }
}
