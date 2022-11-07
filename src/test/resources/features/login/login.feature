Feature: Login

  @Positive
  Scenario: User Login using valid email and password
    Given User already on Login page
    And User input "muhammad.ibnu@finaccel.co" on field "email"
    And User input "@Ibnu1590" on field "password"
    Then User click "submit" button
