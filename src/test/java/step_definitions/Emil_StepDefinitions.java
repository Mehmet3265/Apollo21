package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EmployeesPage_emil;
import utilities.Driver;

public class Emil_StepDefinitions {

EmployeesPage_emil employeesPage_emil =new EmployeesPage_emil();

    @When("user go to main page")
    public void user_go_to_main_page() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        employeesPage_emil.username.sendKeys(username);


    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        employeesPage_emil.password.sendKeys(password);

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        employeesPage_emil.loginButton.click();

    }
    @When("user confirm it is on the page")
    public void user_confirm_it_is_on_the_page() {
       String actualTitle= Driver.getDriver().getTitle();
       String expectedTitle ="Odoo";
        Assert.assertEquals(expectedTitle,actualTitle);


    }
    @When("user click employees button")
    public void user_click_employees_button() {
    employeesPage_emil.moreButton.click();
    employeesPage_emil.employeesButton.click();

    }
    @When("user click create button")
    public void user_click_create_button() {
        employeesPage_emil.createButton.click();

    }
    @When("user fill in the blank")
    public void user_fill_in_the_blank() {
        employeesPage_emil.employeesName.sendKeys("Emil Aliyev");

    }
    @And("user click save button")
    public void user_click_save_button() {
        employeesPage_emil.saveButton.click();

    }

    @Then("user see employees name on the page")
    public void userSeeEmployeesNameOnThePage() {
        employeesPage_emil.employeesInfo.isDisplayed();
    }
}
