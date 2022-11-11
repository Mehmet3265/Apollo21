
Feature:User can reach New Employee Form by clicking Employees
  @BRT-796
  Scenario: New Employee Form will be created
    When user go to main page
    And user enters username "posmanager15@info.com"
    And user enters password "posmanager"
    And user clicks login button
    And user confirm it is on the page
    And user click employees button
    And user click create button
    And user fill in the blank
    And user click save button
    Then user see employees name on the page







