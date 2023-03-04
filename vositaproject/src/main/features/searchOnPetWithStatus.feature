@Runner
Feature: Test search on pet activity
  Scenario: User search on avaliable pets
    Given User search with available value
    When User sends his seach on pet data
    Then display avaliable pets
  Scenario: User search on pending pets
    Given User search with pending value
    When User sends his seach on pending pet data
    Then display pending pets
  Scenario: User search on sold pet
    Given User search with sold value
    When User sends his seach on sold pet data
    Then display sold pet
