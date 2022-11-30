package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryPage_nihat {

    public InventoryPage_nihat() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(css = "#wrapwrap > main > div > form > div.clearfix.oe_login_buttons > button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class=\"o_user_menu\"]//span")
    public WebElement usernameOnHomePage;

    @FindBy(xpath = "//a[@data-menu=\"347\"]")
    public WebElement inventory;

    @FindBy(xpath = "//a[@data-menu=\"378\"]")
    public WebElement products;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement newProductName;

    @FindBy(xpath = "//*[@accesskey='s']")
    public WebElement saveProductButton;

    @FindBy(css = "body > div.o_notification_manager > div > div.o_notification_title")
    public WebElement errorMessage;

    @FindBy(css = "body > div.o_main > div.o_main_content > div.o_control_panel > div.o_cp_searchview > div > input")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='oe_kanban_global_click o_kanban_record'][1]/div[2]/strong/span")
    public WebElement searchedNewProduct;




}
