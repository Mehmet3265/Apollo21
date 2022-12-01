package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class InventoryPage_caner {
    public InventoryPage_caner(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement inventory;

    @FindBy(xpath = "//a[@data-menu='378']")
    public WebElement products;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement productName;


    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;



    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;



    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    //input[@class='o_searchview_input']

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_ungrouped']")
    public WebElement productPage;
}
