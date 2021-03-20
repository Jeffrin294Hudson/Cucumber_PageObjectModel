@tag
Feature: Checking Link in Website

  @demo
  Scenario: Validating Demo link in website
    Given I am on the home page "https://phptravels.com"
    When I move to menu
      | Menu    |
      | Demo    |
      | Pricing |
    And I click on "Demo"
    Then a new page should open
    And the page title should be "Demo Script Test drive - PHPTRAVELS"
