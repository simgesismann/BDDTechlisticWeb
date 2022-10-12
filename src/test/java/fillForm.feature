Feature: feature to test fill form
  Scenario: tests fill form
    Given user is on formPage
    And fill name
    And fill surname
    And choose gender
    And choose years of experience
    And type date
    And choose profession
    And choose automation tool
    And select continents
    And select selenium commands
    And upload sample file
    Then press button
