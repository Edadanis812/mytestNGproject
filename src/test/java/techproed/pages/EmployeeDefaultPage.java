package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
//Task:
//Name: US10000Create a new Customer with Employee profile
//Description : As an employee, I should be able to create a new customer
//Acceptance Criteria:
//Given user is on the Default Page
//And user clicks on My Operations
//And select Mange Customers
//And user clicks on Create a new Customer
//And enters all requires fields
//And click Save
//Then verify customer is created
public class EmployeeDefaultPage {
    public EmployeeDefaultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //    Find the object of Employee Default Pag
    @FindBy(id = "entity-menu")
    public WebElement myOperationsDropdown;
    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomers;


}
