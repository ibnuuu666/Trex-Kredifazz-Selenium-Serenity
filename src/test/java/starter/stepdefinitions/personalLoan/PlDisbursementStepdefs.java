package starter.stepdefinitions.personalLoan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import starter.pages.page_object.LoginPage;
import starter.pages.page_object.PersonalLoanPage;

import java.awt.*;

public class PlDisbursementStepdefs {
    LoginPage loginPage = new LoginPage();
    PersonalLoanPage plPage = new PersonalLoanPage();

    @Given("User already on Home page")
    public void userAlreadyOnHomePage() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("On Home");
//        plPage.getCookiesLogin();
    }

    @And("User go to {string}")
    public void userGoTo(String menus) throws InterruptedException {
        switch (menus.toLowerCase()) {
            case "personal loan page":
                Thread.sleep(2000);
                plPage.clickButton("Personal Loan");
                break;
            case "pl disbursement":
                Thread.sleep(2000);
                plPage.clickButton("PL Disbursement");
                break;
            case "pl disbursement history":
                Thread.sleep(2000);
                plPage.clickButton("PL Disbursement History");
                break;
        }
    }

    @And("Click {string}")
    public void click(String value) throws InterruptedException {
        switch (value.toLowerCase()) {
            case "populate button":
                plPage.clickButtonPopulate();
                break;
            case "select display per rows":
                plPage.clickDisplayRows();
                Thread.sleep(2000);
                break;
            case "button check spesific date":
                plPage.buttonCheckSpesificDate();
                break;
            case "mark":
                Thread.sleep(1000);
                plPage.buttonMarkOnSpesificDate();
                break;
            case "check":
                Thread.sleep(1000);
                plPage.buttonCheckOnSpesificDate();
                Thread.sleep(1000);
                plPage.refreshPage();
                break;
            case "for reprocess button":
                plPage.buttonForReprocess();
                Thread.sleep(2000);
                plPage.refreshPage();
                break;
            case "more action":
                Thread.sleep(1000);
                plPage.buttonMoreAction("");
                Thread.sleep(1000);
                break;
            case "setting on the transaction that want to cancel":
                Thread.sleep(1000);
                plPage.buttonSetting("setting");
                break;
            case "cancel":
                Thread.sleep(1000);
                plPage.buttonSetting("cancel");
                break;
            case "submit":
                Thread.sleep(1000);
                plPage.buttonSetting("submit-reason");
                break;
            case "setting on the transaction that want to check the transfer status" :
                Thread.sleep(1000);
                plPage.buttonSetting("setting");
                break;
            case "check transfer status" :
                Thread.sleep(1000);
                plPage.buttonSetting("check-transfer-status");
                break;
        }

    }

    @And("Choose the date want to populate")
    public void chooseTheDateWantToPopulate() {
        plPage.changeMonth();
        plPage.selectDate();
    }

    @Then("Click {string} on pop up populate")
    public void clickOnPopUpPopulate(String arg0) throws InterruptedException {
        plPage.clickButtonPopulateOnPopup();
        Thread.sleep(2000);
    }

    @Then("Refresh the Browser")
    public void refreshTheBrowser() throws InterruptedException {
        plPage.refreshPage();
        Thread.sleep(2000);
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
//        Thread.sleep(1000);
//        plPage.inputSearch("30", "0");
//        Thread.sleep(10000);
        switch (field) {
            case "trx id":
                Thread.sleep(1000);
                plPage.inputSearch("30", "trx id");
                Thread.sleep(2000);
                plPage.deleteSearch("trx id");
                break;
            case "amount":
                Thread.sleep(1000);
                plPage.inputSearch("500000", "amount");
                Thread.sleep(2000);
                plPage.deleteSearch("amount");
                break;
            case "name":
                Thread.sleep(1000);
                plPage.inputSearch("test mita", "name");
                Thread.sleep(2000);
                plPage.deleteSearch("name");
                break;
            case "bank":
                Thread.sleep(1000);
                plPage.inputSearch("bca", "bank");
                Thread.sleep(2000);
                plPage.deleteSearch("bank");
                break;
            case "transfer status":
                Thread.sleep(1000);
                plPage.inputSearch("ask product team", "transfer status");
                Thread.sleep(2000);
                plPage.deleteSearch("transfer status");
                break;
            case "vendor":
                Thread.sleep(1000);
                plPage.inputSearch("permata", "vendor");
                Thread.sleep(2000);
                plPage.deleteSearch("vendor");
                break;
            case "more than one key":
                Thread.sleep(1000);
                plPage.inputSearch("bca", "bank");
                plPage.inputSearch("ask product team", "transfer status");
                plPage.inputSearch("permata", "vendor");
                Thread.sleep(2000);
                plPage.deleteSearch("bank");
                plPage.deleteSearch("transfer status");
                plPage.deleteSearch("vendor");
                Thread.sleep(2000);
                break;
        }
    }

    @Given("User already on PL disbursement page")
    public void userAlreadyOnPLDisbursementPage() {
    }

    @Then("Click {string} on {string}")
    public void clickOn(String arg0, String row) throws InterruptedException {
        switch (row) {
            case "trx id":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "created at":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "amount":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "name":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "acc name":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "acc number":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "bank":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "trf status":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
            case "vendor":
                Thread.sleep(1000);
                plPage.clickSorting(row);
                Thread.sleep(1000);
                plPage.clickSorting(row);
                break;
        }
    }

    @Then("Choose how much rows want to displayed")
    public void chooseHowMuchRowsWantToDisplayed() {
        plPage.selectRows();
    }

    @Then("see the data of personal loan not added user bank account")
    public void seeTheDataOfPersonalLoanNotAddedUserBankAccount() throws InterruptedException {
        Thread.sleep(1000);
        plPage.validationPersonalLoanData();
        Thread.sleep(2000);
    }

    @And("Choose date that want to check")
    public void chooseDateThatWantToCheck() throws InterruptedException {
        plPage.changeMonthOnSpesificDate();
        Thread.sleep(1000);
        plPage.changeMonthOnSpesificDate();
        Thread.sleep(1000);
        plPage.selectDateOnSpesificDate();
    }

//    @And("Choose the data personal loan that want to reprocess")
//    public void chooseTheDataPersonalLoanThatWantToReprocess() throws InterruptedException {
//        Thread.sleep(2000);
//        plPage.selectPersonalLoan();
//        Thread.sleep(3000);
//    }

    @And("Choose {string}")
    public void choose(String row) throws InterruptedException {
        switch (row) {
            case "the data personal loan that want to reprocess":
                Thread.sleep(2000);
                plPage.selectPersonalLoan();
                Thread.sleep(3000);
                break;
            case "the transaction that want to cancel":
                Thread.sleep(2000);
                plPage.selectPersonalLoan();
                Thread.sleep(3000);
                break;
            case "cancel payment":
                Thread.sleep(1000);
                plPage.buttonMoreAction("cancel");
                break;
            case "check all transfer status":
                Thread.sleep(1000);
                plPage.buttonMoreAction("check-all-status");
                break;
            case "check to export to xlsx":
                Thread.sleep(1000);
                plPage.buttonMoreAction("export-to-xlsx");
                break;
            case "lock checklist":
                Thread.sleep(1000);
                plPage.buttonMoreAction("unlock");
                break;
            case "unlock checklist":
                Thread.sleep(1000);
                plPage.buttonMoreAction("lock");
                break;
        }
    }

    @And("User input cancellation reason {string} on field {string}")
    public void userInputCancellationReasonOnField(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(1000);
        plPage.inputReason("");
    }

    @And("Choose start date and end date that want to filter")
    public void chooseStartDateAndEndDateThatWantToFilter() throws InterruptedException {
        Thread.sleep(1000);
        plPage.chooseStartDate();
        Thread.sleep(1000);
        plPage.chooseEndDate();
    }
}
