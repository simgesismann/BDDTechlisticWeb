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

    Scenario Outline: tests fill form outline
      Given navigate to website
      And fill name "<firstname>"
      And fill lastname "<lastname>"
      And choose gender
      And choose years of experience
      And send date "<date>"
      And choose profession
      And choose automation tool
      And select continents
      And select selenium commands
      And upload sample file
      Examples:
        | firstname | lastname | date |
        | simge | sisman | 13.10.2022 |
        | dilek | şişman | 15.10.2022 |
        | yagmur | ömür | 20.10.2022 |

