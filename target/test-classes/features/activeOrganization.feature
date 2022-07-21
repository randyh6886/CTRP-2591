Feature:  Search for Active Organizations in PA
  Scenario: Searching for Active Organizations in PA
    Given I click on Organizations Menu Option
    When I select Active from Status
    Then I click on Search
    Then I Assert Organizations(s) matches Organizations(s)
    Then I click on Logout
