package techproed.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
public class Driver {
    /*
    What is Driver ? = Create and initialize the driver instance
    Why ? => Reusability. Avoid duplication
    Faster development
     */
    //Instance is private.
    private static WebDriver driver;
    private Driver(){
    }
    //Create getDriver method to Create and initialize the driver instance
    public static WebDriver getDriver(){
        if (driver==null){
            //Check the browser type
            String browser= ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome": //If my case is "chrome", create chrome
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver= new SafariDriver();
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
    //    closeDriver is used for closing the driver
    public static void closeDriver(){
        if (driver!=null){ // If driver is POINTING SOMEWHERE such as chromedriver.It means "driver is active."
            driver.quit();
            driver=null;
        }
    }
}