Feature: Personal Loan - PL Disbursement History

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
    And User go to "PL Disbursement History"

  @Positive
  Scenario: Check filter by range date
    Given User already on PL disbursement page
    And Choose start date and end date that want to filter
