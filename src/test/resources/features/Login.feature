Feature: Regression scenarios for login

  @regression
 Scenario Outline: Positive Login scenario for herokuApp
   Given user is navigated to herokuApp
   When user enters valid "<username>" and "<password>"
   And user clicks on submit button
   Then user is navigated to results page and verify successful "<message>"
   Examples:
   |username|password|message|
   |tomsmith|SuperSecretPassword!|You logged into a secure area!|

  @regression
  Scenario Outline: Negative Login scenario for herokuApp
    Given user is navigated to herokuApp
    When user enters invalid "<username>" and "<password>"
    And user clicks on submit button
    Then user is navigated to error message and verify "<errorMessage>"
    Examples:
      |username|password|errorMessage|
      |tomsmith|SuperSecretPassword|Your password is invalid!|
      |tomsmi|SuperSecretPassword!|Your username is invalid!|
      |tomsmith| |Your password is invalid!|
      | |SuperSecretPassword!|Your username is invalid!|


