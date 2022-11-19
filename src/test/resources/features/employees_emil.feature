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

  @BRT-798
  Scenario: Verify that if Employee's Name field leaves blank,
   an error message "The following fields are invalid:" is appeared.
    When user click create button
    And user does not fill in the blank
    And user click save button
    Then user should see error message on the screen


@BRT-799
  Scenario: Verify that the user should be able
  to see created employee is listed after clicking the Employees module.
  When user click discard button
  And user see employees list on the screen
  And user should write on the search box employee name
  Then user should see new employees data








