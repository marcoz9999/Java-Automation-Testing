package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static testScripts.Constants.chromedriverFilePath;
import static testScripts.Constants.url;


public class TestInterview {


    @Test
    public void testInterview() {
        System.setProperty("webdriver.chrome.driver", chromedriverFilePath);
        WebDriver driver=new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--start-maximized");
        //options.addArguments("--disable-infobars");

        driver.get(url);

        driver.close();
    }
}
