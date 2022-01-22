package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LoginPage {
    //With this way, we can use it again and again.
    //Find the page object in this class
    //At first, we need to create constructor to initialize the page elements.
    //PageFactory.initElements is used to initialize this page objects.
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //gino.wintheiser
    //%B6B*q1!TH
    //We are using find by annotation/
    @FindBy(id="account-menu")
    public WebElement loginDropdown;

    @FindBy(xpath = "(//*[text()='Sign in'])[1]")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void loginApplication(String userName,String pass){
        //Creating a reusable login method
        //I will call this to login in the test classes
        //When we need it, we can call method very quick
        loginDropdown.click();
        signInButton.click();
        username.sendKeys(userName);
        password.sendKeys(pass);
        loginButton.click();
    }


}
