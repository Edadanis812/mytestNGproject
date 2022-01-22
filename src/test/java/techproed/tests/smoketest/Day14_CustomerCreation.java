package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.CreateCustomerPage;
import techproed.pages.EmployeeDefaultPage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

//We are putting all of them under the smoke test. We need to run every day.
//Smoke test will decide from senior,team lead.
//It should take less time. (Max 20mins)
//It should cover most main part of test.
public class Day14_CustomerCreation {
    //Login pages den cagirabilmek icin obje olustururuz.
    LoginPage loginPage=new LoginPage();
    @Test
    public void createCustomerAsEmployee(){
        //We can call method from login pages/
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        //"Pages package" dan methodlari cagirmak icin obje olustururuz.
        EmployeeDefaultPage employeeDefaultPage=new EmployeeDefaultPage();
        CreateCustomerPage createCustomerPage=new CreateCustomerPage();
        //Calling the loginApplication method to login
        loginPage.loginApplication("gino.wintheiser","%B6B*q1!TH");
        //Second way:
        //loginPage.loginApplication(ConfigurationReader.getProperty("employee_username"),ConfigurationReader.getProperty("employee_password"));
        employeeDefaultPage.myOperationsDropdown.click();
        employeeDefaultPage.manageCustomers.click();
        createCustomerPage.createANewCustomer.click();
    }
}
