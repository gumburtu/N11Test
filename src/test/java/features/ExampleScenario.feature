Feature: Example Scenario

  Background:
    Given setting driver

  Scenario Outline: go to web site and login test
    Given go to login page
    And user types username as "<username>"
    And user types password as "<password>"
    When click button
    Then assert to success message
    Examples:
      | username | password    |
      | student  | Password123 |

  Scenario: homepage loading test
    Given go to homepage
    When wait two seconds
    Then see "Hello" text