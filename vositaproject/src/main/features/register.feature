@Runner
Feature: Test register activity
  Scenario: User can register with valid data
    Given User has valid register data
    When User sends his register data
    Then user register successfully
