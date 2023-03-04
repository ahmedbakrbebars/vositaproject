@Runner
Feature: Test login activity
  Scenario: User can login with valid data
    Given User has valid login data
    When User sends his login data
    Then login successfully
