@Runner
Feature: Test edit user data activity
  Scenario: User can update his data
    Given User add new data
    When User sends his new data
    Then user data updated  successfully
