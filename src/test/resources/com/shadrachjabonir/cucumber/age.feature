Feature: Get Person's Age

  Scenario Outline: A person wants to know his/her age by his/her DOB
    Given DOB "<dob>"
    When I ask for my age
    Then I should see "<result>"

  Examples:
    | dob        | result |
    | 22/01/1989 | 29     |
    | 31/07/1992 | 26     |