Feature: Personal Loan - PL Disbursement

  @Positive
  Scenario: User Login using valid email and password
    Given User already on Login page
    And User input "muhammad.ibnu@finaccel.co" on field "email"
    And User input "@Ibnu1590" on field "password"
    Then User click "submit" button

  @Positive
  Scenario: Check to Populate button
    Given User already on Home page
    And User go to "Personal Loan Page"
    And User go to "PL Disbursement"
#    And Click "Populate button"
#    And Choose the date want to populate
#    Then Click "Populate button" on pop up populate
#    Then Refresh the Browser

#  @Positive
#  Scenario: check select All and Unselect All
#    Given User already on Home page
#    And User go to "Personal Loan Page"
#    And User go to "PL Disbursement"
#    And Checklist the checkbox for "Select All"
#    Then Unchecklist the checkbox for "Select All"

# Search Fitur

#  @Positive
#  Scenario: Check search by trx id
#    Given User already on Home page
#    Then Input the "trx id" that want to search
#
#  @Positive
#  Scenario: Check search by amount
#    Given User already on Home page
#    Then Input the "amount" that want to search
#
#  @Positive
#  Scenario: Check search by name
#    Given User already on Home page
#    Then Input the "name" that want to search
#
#  @Positive
#  Scenario: Check search by bank
#    Given User already on Home page
#    Then Input the "bank" that want to search
#
#  @Positive
#  Scenario: Check search by transfer status
#    Given User already on Home page
#    Then Input the "transfer status" that want to search
#
#  @Positive
#  Scenario: Check search by vendor
#    Given User already on Home page
#    Then Input the "vendor" that want to search
#
#  @Positive
#  Scenario: Check search with combination key
#    Given User already on Home page
#    Then Input the "more than one key" that want to search


# Asc & Desc Fitur

#  @Positive
#  Scenario: Check filter asc desc by trx id Check filter asc desc by trx id
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "trx id"
#
#  @Positive
#  Scenario: Check filter asc desc by trx created at
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "created at"
#
#  @Positive
#  Scenario: Check filter asc desc by amount
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "amount"
#
#  @Positive
#  Scenario: Check filter asc desc by name
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "name"
#
#  @Positive
#  Scenario: Check filter asc desc by acc name
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "acc name"
#
#  @Positive
#  Scenario: Check filter asc desc by acc number
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "acc number"
#
#  @Positive
#  Scenario: Check filter asc desc by bank
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "bank"
#
#  @Positive
#  Scenario: Check filter asc desc by transfer status
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "trf status"
#
#  @Positive
#  Scenario: Check filter asc desc by vendor
#    Given User already on PL disbursement page
#    Then Click "the up & down arrows" on "vendor"
#
#  @Positive
#  Scenario: Check filter display per rows
#    Given User already on PL disbursement page
#    And Click "select display per rows"
#    Then Choose how much rows want to displayed
#
#  @Positive
#  Scenario: Check validation for the data of personal loan not added user bank account
#    Given User already on PL disbursement page
#    Then see the data of personal loan not added user bank account

#  @Positive
#  Scenario: Check Specific Date button
#    Given User already on PL disbursement page
#    And Click "button Check Spesific Date"
#    And Choose date that want to check
#    Then Click "mark"
#    And Click "button Check Spesific Date"
#    And Choose date that want to check
#    Then Click "check"
#
#  @Positive
#  Scenario: Check Specific Date button (there is no data in date selected)
#    Given User already on PL disbursement page
#    And Click "button Check Spesific Date"
#    And Choose date that want to check
#    Then Click "check"

#  @Positive
#  Scenario: Check For Reprocess button
#    Given User already on PL disbursement page
#    And Choose "the data personal loan that want to reprocess"
#    Then Click "For Reprocess button"
#
#  @Positive
#  Scenario: Check For Reprocess button (not select the transaction of personal loan)
#    Given User already on PL disbursement page
#    Then Click "For Reprocess button"

#  @Positive
#  Scenario: Check to Cancel Payment
#    Given User already on PL disbursement page
#    And Choose "the transaction that want to cancel"
#    And Click "more action"
#    And Choose "cancel payment"
#
#  @Positive
#  Scenario: Check to Cancel Payment (No Data Selected)
#    Given User already on PL disbursement page
#    And Click "more action"
#    And Choose "cancel payment"

#  @Positive
#  Scenario: Check All Transfer Status button
#    Given User already on PL disbursement page
#    And Click "more action"
#    And Choose "check all transfer status"
#
#  @Positive
#  Scenario: Check to Export to XLSX
#    Given User already on PL disbursement page
#    And Click "more action"
#    And Choose "check to export to xlsx"
#
#  @Positive
#  Scenario: Check to Unlock & Lock Checklist
#    Given User already on PL disbursement page
#    And Click "more action"
#    And Choose "lock checklist"
#    And Click "more action"
#    And Choose "unlock checklist"

#Feature For Action - Setting Button

  @Positive
  Scenario: Check to Cancel
    Given User already on PL disbursement page
    And Click "setting on the transaction that want to cancel"
    And Click "cancel"
    And User input cancellation reason "test cancel" on field "cancellation"
    Then Click "submit"

  @Positive
  Scenario: Check Transfer Status
    Given User already on PL disbursement page
    And Click "setting on the transaction that want to check the transfer status"
    Then Click "check transfer status"
















