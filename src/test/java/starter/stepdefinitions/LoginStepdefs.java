package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import starter.pages.page_object.LoginPage;

public class LoginStepdefs {

    LoginPage loginPage = new LoginPage();

    @Given("User already on Login page")
    public void userAlreadyOnLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.open();
    }

    @And("User input {string} on field {string}")
    public void userInputOnField(String value, String field) throws InterruptedException {
        switch (field.toLowerCase()) {
            case "email":
                Thread.sleep(1000);
                loginPage.inputFieldEmail("muhammad.ibnu@finaccel.co");
                break;
            case "password":
                Thread.sleep(1000);
                loginPage.inputFieldPassword("@Ibnu1590");
                break;
            default:
        }
    }

    @Then("User click {string} button")
    public void userClickButton(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        loginPage.clickSubmit();
        Thread.sleep(1000);
        loginPage.saveLoginToCookies();

    }


}
