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
    And Click "Populate button"
    And Choose the date want to populate
    Then Click "Populate button" on pop up populate
    Then Refresh the Browser

  @Positive
  Scenario: check select All and Unselect All
    Given User already on Home page
#    And User go to "Personal Loan Page"
#    And User go to "PL Disbursement"
    And Checklist the checkbox for "Select All"
    Then Unchecklist the checkbox for "Select All"

  @Positive
  Scenario: Check search by trx id
    Given User already on Home page
#    And User go to "Personal Loan Page"
#    And User go to "PL Disbursement"
    Then Input the "trx id" that want to search

#  @Positive
#  Scenario: Check search by amount
#    Given User already on Home page
##    And User go to "Personal Loan Page"
##    And User go to "PL Disbursement"
#    Then Input the "amount" that want to search
#
#  @Positive
#  Scenario: Check search by name
#    Given User already on Home page
##    And User go to "Personal Loan Page"
##    And User go to "PL Disbursement"
#    Then Input the "name" that want to search
#
#  @Positive
#  Scenario: Check search by bank
#    Given User already on Home page
##    And User go to "Personal Loan Page"
##    And User go to "PL Disbursement"
#    Then Input the "bank" that want to search
#
#  @Positive
#  Scenario: Check search by transfer status
#    Given User already on Home page
##    And User go to "Personal Loan Page"
##    And User go to "PL Disbursement"
#    Then Input the "transfer status" that want to search
#
#  @Positive
#  Scenario: Check search by vendor
#    Given User already on Home page
##    And User go to "Personal Loan Page"
##    And User go to "PL Disbursement"
#    Then Input the "vendor" that want to search
#
#  @Positive
#  Scenario: Check search with combination key
#    Given User already on Home page
##    And User go to "Personal Loan Page"
##    And User go to "PL Disbursement"
#    Then Input the "more than one key" that want to search








