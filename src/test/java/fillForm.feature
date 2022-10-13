Feature: feature to test fill form
  Background: navigate to form page
    Given navigate to website
  Scenario: tests fill form basic
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

    Scenario: test fill form with variables from here
      And fill name "sevgi"
      And fill lastname "yaşar"
      And choose gender
      And choose years of experience
      And send date "21.11.2022"

    Scenario Outline: tests fill form with outline

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

