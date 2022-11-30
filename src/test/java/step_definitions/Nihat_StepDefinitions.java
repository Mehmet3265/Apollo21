package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InventoryPage_nihat;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Nihat_StepDefinitions {

    InventoryPage_nihat inventoryPageNihat = new InventoryPage_nihat();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String expectedLoginTitle = "Login | Best solution for startups";
        String actualLoginTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedLoginTitle,actualLoginTitle);
    }

    @When("user enters username as {string}")
    public void user_enters_username_as(String username) {
        inventoryPageNihat.usernameBox.sendKeys(username);
    }

    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        inventoryPageNihat.passwordBox.sendKeys(password);
    }

    @Then("user clicks to login button")
    public void user_clicks_to_login_button() {
        inventoryPageNihat.loginButton.click();
    }

    @When("user on the main page")
    public void user_on_the_main_page() {
        String expectedMainTitle = "Odoo";
        String actualMainTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedMainTitle,actualMainTitle);
    }

    @When("user go to Inventory")
    public void user_go_to_inventory() throws InterruptedException {

        inventoryPageNihat.inventory.click();
        Thread.sleep(1000);
        inventoryPageNihat.inventory.click();
    }

    @When("user click Products")
    public void user_click_products(){

        inventoryPageNihat.products.click();
    }

    @When("user click Create Button")
    public void user_click_create_button() {
        inventoryPageNihat.createButton.click();
    }

    @Then("user can reach New Products Form")
    public void user_can_reach_new_products_form() {
        Assert.assertTrue(inventoryPageNihat.newProductName.isDisplayed());
    }

    @When("user leaves blank to Product Name Bar and click Save Button")
    public void user_leaves_blank_to_product_name_bar_and_click_save_button() {
       inventoryPageNihat.saveProductButton.click();
    }

    @Then("error message {string} is appeared")
    public void error_message_is_appeared(String expectedErrorMessage) {
        String actualErrorMessage = inventoryPageNihat.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @When("user enter {string} in to Product Name Field")
    public void user_enter_in_to_product_name_field(String newProductName) {
        inventoryPageNihat.newProductName.sendKeys(newProductName);
    }

    @Then("verify that {string} name is include on the page title")
    public void verify_that_name_is_include_on_the_page_title(String expectedTitle) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


    @When("user enters {string} on searchbar")
    public void user_enters_on_searchbar(String productName) throws InterruptedException {
        Thread.sleep(3000);
        inventoryPageNihat.searchBox.sendKeys(productName+Keys.ENTER);
    }

    @Then("user should see the {string} is listed")
    public void user_should_see_the_product_is_listed(String expectedProductName) throws InterruptedException {
        Thread.sleep(2000);
        String actualProductName = inventoryPageNihat.searchedNewProduct.getText();
//        System.out.println("actualProductName = " + actualProductName);
        Assert.assertTrue(actualProductName.contains(expectedProductName));
    }


    @And("user click to save button")
    public void userClickToSaveButton() {
        inventoryPageNihat.saveProductButton.click();
    }
}
