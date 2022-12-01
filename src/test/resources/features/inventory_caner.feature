Feature: User enters inventory and can create new products

  Background: Inventory --> Products --> Create

  @wip
  Scenario: Verify that User can reach New Products Form by clicking

    When user go the web site
    And user enter valid username "salesmanager15@info.com"
    And user enter valid password "salesmanager"
    Then user click login button
    And user get the main page
    And user click on Inventory title
    And user click Products which is under the Master Data title
    Then user click create option.
    And user add product name
    Then user click the save button
    And user verify product name in the header.
  @wip1
  Scenario: Verify that if Product name field leaves blank,
  an error message "The following fields are invalid:
  is appeared and Product Name input box is bordered in red color.
    When user click again create button
    And user does not fill in the blank.
    Then user again click the save button
    And user see error message on the screen

  @wip2
  Scenario: Verify that the user should be able to
  see created Product is listed after clicking the Products module.
    When user click products button
    And user should fill the product name in the search box
    Then user see product name on the screen