package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EmployeesPage_emil;
import utilities.BrowserUtils;
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


    @And("user does not fill in the blank")
    public void userDoesNotFillInTheBlank() {
        employeesPage_emil.createButton.click();
        employeesPage_emil.saveButton.click();


    }

    @Then("user should see error message on the screen")
    public void userShouldSeeErrorMessageOnTheScreen() {
        BrowserUtils.sleep(1);
        employeesPage_emil.errorMessage.isDisplayed();
    }

    @When("user click discard button")
    public void userClickDiscardButton() {
    employeesPage_emil.discardButton.click();
    }

    @And("user see employees list on the screen")
    public void userSeeEmployeesListOnTheScreen() {
        employeesPage_emil.employeesList.isDisplayed();
    }

    @And("user should write on the search box employee name")
    public void userShouldWriteOnTheSearchBoxEmployeeName() {
        employeesPage_emil.searchBox.sendKeys("emil"+ Keys.ENTER);
    }

    @Then("user should see new employees data")
    public void userShouldSeeNewEmployeesData() {
        employeesPage_emil.employeeData.isDisplayed();

    }
}
