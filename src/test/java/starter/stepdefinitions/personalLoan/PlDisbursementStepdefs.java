package starter.stepdefinitions.personalLoan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import starter.pages.page_object.LoginPage;
import starter.pages.page_object.PersonalLoanPage;

public class PlDisbursementStepdefs {
    LoginPage loginPage = new LoginPage();
    PersonalLoanPage plPage = new PersonalLoanPage();

    @Given("User already on Home page")
    public void userAlreadyOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("On Home");
//        plPage.getCookiesLogin();
    }

    @And("User go to {string}")
    public void userGoTo(String menus) throws InterruptedException {
        switch (menus.toLowerCase()) {
            case "personal loan page":
                Thread.sleep(3000);
                plPage.clickButton("Personal Loan");
                break;
            case "pl disbursement":
                Thread.sleep(3000);
                plPage.clickButton("PL Disbursement");
                break;
        }
    }

    @And("Click {string}")
    public void click(String arg0) {
//        plPage.clickButton("Populate");
        plPage.clickButtonPopulate();
    }

    @And("Choose the date want to populate")
    public void chooseTheDateWantToPopulate() {
        plPage.changeMonth();
        plPage.selectDate();
    }

    @Then("Click {string} on pop up populate")
    public void clickOnPopUpPopulate(String arg0) throws InterruptedException {
        plPage.clickButtonPopulateOnPopup();
        Thread.sleep(5000);
    }

    @Then("Refresh the Browser")
    public void refreshTheBrowser() throws InterruptedException {
        plPage.refreshPage();
        Thread.sleep(5000);
    }

    @Given("User already on {string}")
    public void userAlreadyOn(String arg0) {

    }

    @And("Checklist the checkbox for {string}")
    public void checklistTheCheckboxFor(String arg0) throws InterruptedException {
        plPage.clickCheckboxSelectAll();
        Thread.sleep(3000);
    }

    @Then("Unchecklist the checkbox for {string}")
    public void unchecklistTheCheckboxFor(String arg0) throws InterruptedException {
        plPage.clickCheckboxSelectAll();
        Thread.sleep(3000);
    }

    @Then("Input the {string} that want to search")
    public void inputTheThatWantToSearch(String field) throws InterruptedException {
        Thread.sleep(1000);
        plPage.inputSearch("30", "0");
        Thread.sleep(2000);
//        switch (field) {
//            case "trx id":
//                Thread.sleep(1000);
//                plPage.inputSearch("30","1");
//                Thread.sleep(2000);
//                break;
//            case "amount":
//                Thread.sleep(1000);
//                plPage.inputSearch("500000","3");
//                break;
//            case "name":
//                Thread.sleep(1000);
//                plPage.inputSearch("test mita","4");
//                break;
//            case "bank":
//                Thread.sleep(1000);
//                plPage.inputSearch("bca","7");
//                break;
//            case "transfer status":
//                Thread.sleep(1000);
//                plPage.inputSearch("ask product team","8");
//                break;
//            case "vendor":
//                Thread.sleep(1000);
//                plPage.inputSearch("permata","9");
//                break;
//            case "more than one key":
//                Thread.sleep(1000);
//                plPage.inputSearch("bca","7");
//                plPage.inputSearch("ask product team","8");
//                plPage.inputSearch("permata","9");
//                break;
//        }
    }

}
