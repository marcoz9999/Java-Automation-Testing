package testScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import businessLogic.BL_HomePage;
import businessLogic.BL_SignInPage;

import java.time.Duration;

import static testScripts.Constants.*;


public class TestInterview {
    WebDriver driver;
    BL_HomePage ObjHomePage;
    BL_SignInPage ObjSignInPage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", chromedriverFilePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get(testUrl);
        ObjHomePage = new BL_HomePage (driver);
        ObjSignInPage = new BL_SignInPage (driver);

    }

    @Test(priority = 1)
    public void searchAnItem() {

        ObjHomePage.resultsSearch("TV 43");

   }
    @Test(priority = 2)
    public void itemNotFoundAlert() {

        ObjHomePage.noResultsSearch("Puppeteer");
    }
    @Test(priority = 3)
    public void smartTvResults() {

        ObjHomePage.smartTvResultsSearch("Smart Tv" , "Samsung", "10000" , "12000");

    }
    @Test(priority = 4)
    public void createAccount(){
        int random = (int)(Math.random() * 100 + 1);
        ObjSignInPage.createAccount("jivatma9999+"+random+"@gmail.com" , "1Jivatma" ,"Juan Marcos" ,"Alcazar" ,"Paredes" , "55555555" );
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
