Feature: Search Case By name

  Background: 
    Given User enters valid credentials
    And User clicks on Search case

@inProgress
  Scenario: Searching Case by name
    Then User enters decedents name "Test" and checkRadio "Cases owned by Ashbrook Nursing Home-LTC only."
    And User clicks on search
    Then User validates data results

@inProgress
  Scenario: Searching Case by ID
    Then User enters decedents caseID 2150466 and checkRadio "Cases owned by Ashbrook Nursing Home-LTC only."
    And User clicks on search
    Then User validates data results
