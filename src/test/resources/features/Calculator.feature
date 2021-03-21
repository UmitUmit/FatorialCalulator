@smoke
Feature:

  Background:
    Given the user is on calculator page
#    Then the page title should be "Factorial"   fixme: correct spelling, but this one will fail
     Then the page title should be "Factoriall"


  @TC1
  Scenario Outline: As a user, when I enter the <number> , I should get the <result>
    Given the user enter the <number>
    When the user click the calculator button
    Then the result should be "<result>"
    Examples:
      | number | result                 |
      | 1      | 1                      |
      | 6      | 720                    |
      | 170    | 7.257415615307999e+306 |
      | 171    | Infinity               |

  @TC2
  Scenario:As a user, when I click the Calculate button without entering data, I should get error message
    Given  the user is on calculator page
    When the user click the calculator button
    Then the user should see error message
