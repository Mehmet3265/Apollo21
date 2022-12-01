package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.PageInventory_Emil;
import runners.CukesRunner;
import utilities.BrowserUtils;
import utilities.Driver;

import java.security.Key;

public class PI_StepDefinitions_Emil {

PageInventory_Emil pageInventory_emil = new PageInventory_Emil();


    @When("user go the web site")
    public void user_go_the_web_site() {
        Driver.getDriver().get("https://qa.fidexio.com/web/login");

    }
    @When("user enter valid username {string}")
    public void user_enter_valid_username(String username) {
        pageInventory_emil.username.sendKeys(username);

    }
    @When("user enter valid password {string}")
    public void user_enter_valid_password(String password) {
    pageInventory_emil.password.sendKeys(password);
    }
    @Then("user click login button")
    public void user_click_login_button() {
        pageInventory_emil.loginButton.click();

    }
    @Then("user get the main page")
    public void user_get_the_main_page() {
        Driver.getDriver().getTitle();

    }
    @Then("user click on Inventory title")
    public void user_click_on_inventory_title() {
        pageInventory_emil.inventory.click();

    }
    @Then("user click Products which is under the Master Data title")
    public void user_click_products_which_is_under_the_master_data_title() {
        pageInventory_emil.products.click();

    }
    @Then("user click create option.")
    public void user_click_create_option() {
        pageInventory_emil.createButton.click();

    }
    @Then("user add product name")
    public void user_add_product_name() {
        pageInventory_emil.productName.sendKeys("smartphone");

    }

    @Then("user click the save button")
    public void user_click_the_save_button() {
        pageInventory_emil.saveButton.click();

    }
    @Then("user verify product name in the header.")
    public void user_verify_product_name_in_the_header() {
        BrowserUtils.sleep(1);
        Assert.assertEquals("smartphone - Odoo",Driver.getDriver().getTitle());
        BrowserUtils.sleep(1);
    }


    @When("user click again create button")
    public void user_click_again_create_button() {
        pageInventory_emil.createButton.click();



    }
    @When("user does not fill in the blank.")
    public void user_does_not_fill_in_the_blank() {
        pageInventory_emil.productName.sendKeys("");

    }
    @Then("user again click the save button")
    public void user_again_click_the_save_button() {
        pageInventory_emil.saveButton.click();

    }
    @Then("user see error message on the screen")
    public void user_see_error_message_on_the_screen() {
        pageInventory_emil.errorMessage.isDisplayed();

    }


    @When("user click products button")
    public void userClickProductsButton() {
        pageInventory_emil.products.click();

    }

    @And("user should fill the product name in the search box")
    public void userShouldFillTheProductNameInTheSearchBox(String smartphone) {
        pageInventory_emil.searchBox.sendKeys(smartphone);
        pageInventory_emil.searchBox.click();

    }

    @Then("user see product name on the screen")
    public void userSeeProductNameOnTheScreen() {
pageInventory_emil.productPage.isDisplayed();

    }
}
