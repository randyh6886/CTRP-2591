Feature: Browse to URL
  Scenario: Starting PA
    Given Open Chrome and launch application
    When I enter Username and password
    Then the website opens
    Then I click on Protocol Abstraction