package testScripts;


import static org.testng.Assert.assertEquals;
import static testScripts.Constants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import java.util.List;
import org.testng.annotations.Test;


public class Main {


    @Test
    public void verifyLoginPageTitle() {
        System.setProperty("webdriver.chrome.driver", chromedriverFilePath);
        WebDriver driver=new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--start-maximized");
        //options.addArguments("--disable-infobars");

        driver.get(url);
        String title = driver.getTitle();
        WebElement queryInput = driver.findElement(By.xpath("//input[@id = 'search-input']"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@id = 'search-button']"));

        //1. Assert if Title, Search Input Text and Search Button exist
        assertEquals("ARR", title);
        assertEquals(true, queryInput.isDisplayed());
        assertEquals(true, searchButton.isDisplayed());
        queryInput.sendKeys("Isla");
        searchButton.click();

        //2. Check if searching with empty query is forbidden
        queryInput.clear();
        searchButton.click();
        List emptyQueryElements= driver.findElements(By.xpath("//div[@id = 'error-empty-query']"));
        if(emptyQueryElements.size()==0){
            WebElement errorEmptyQuery = driver.findElement(By.xpath("//div[@id = 'error-empty-query']"));
            assertEquals(true, errorEmptyQuery.isDisplayed());
        }


        //3. Check if at least one island is returned after the querying for isla
        queryInput.sendKeys("isla");
        searchButton.click();
        List<WebElement> allLiElements = driver.findElements(By.xpath("//li[contains(text(),'Isla')]"));
        for (int i = 1; i < allLiElements.size(); i++){
            assertEquals(true, allLiElements.get(i).isDisplayed());
        }

        //4. Check if user gets feedback if there are no results
        queryInput.clear();
        queryInput.sendKeys("castle");
        searchButton.click();
        List noResultsQueryElements = driver.findElements(By.xpath("//div[@id = 'error-no-results']"));
        if(noResultsQueryElements.size()==0) {
            WebElement errorNoResult = driver.findElement(By.xpath("//div[@id = 'error-no-results']"));
            assertEquals(true, errorNoResult.isDisplayed());
        }

        //5. Check if results match the query
        queryInput.clear();
        queryInput.sendKeys("port");
        searchButton.click();
        List portRoyalQueryElements = driver.findElements(By.xpath("//li[(text()='Port Royal')]"));
        if(portRoyalQueryElements.size()==1) {
            WebElement portRoyalQuery = driver.findElement(By.xpath("//li[(text()='Port Royal')]"));
            assertEquals(true, portRoyalQuery.isDisplayed());
        }
        driver.close();
    }
}
