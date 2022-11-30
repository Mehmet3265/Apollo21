@BRT-815 @smoke
Feature:Inventory Functionality
  #@BRT-765
  Background:User is expected to be on the login page.
    Given user is on the login page
    When user enters username as "salesmanager15@info.com"
    And user enters password as "salesmanager"
    Then user clicks to login button

  @BRT-811
  Scenario:User can reach New Products Form by clicking Inventory
    When user on the main page
    And user go to Inventory
    And user click Products
    And user click Create Button
    Then user can reach New Products Form

  @BRT-812
  Scenario:Product name field leaves blank, an error message is appeared.
    When user go to Inventory
    And user click Products
    And user click Create Button
    And user leaves blank to Product Name Bar and click Save Button
    Then error message "The following fields are invalid:" is appeared

  @BRT-813
  Scenario:After creating a Product, the page title includes the Product name.
    When user go to Inventory
    And user click Products
    And user click Create Button
    And user can reach New Products Form
    And user enter "Dummy Product" in to Product Name Field
    And user click to save button
    Then verify that "Dummy Product" name is include on the page title

  @BRT-814
  Scenario:User should be able to see created Product is listed on Products Module
    When user go to Inventory
    And user click Products
    And user enters "Dummy Product" on searchbar
    Then user should see the "Dummy Product" is listed