package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeesPage_emil {

    public EmployeesPage_emil() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement username;


    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='#']")
    public WebElement moreButton;

    @FindBy(xpath = "//a[@data-menu='157']")
    public WebElement employeesButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@name='name']")
    public  WebElement employeesName;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement employeesInfo;


    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "//div[@class='o_kanban_view o_hr_employee_kanban o_kanban_ungrouped']")
    public WebElement employeesList;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//img[@src='https://qa.upgenix.net/web/image?model=hr.employee&field=image_medium&id=122&unique=']")
    public WebElement employeeData;

}
