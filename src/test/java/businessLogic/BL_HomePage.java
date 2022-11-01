package businessLogic;

import static org.testng.Assert.assertEquals;
import static pageObjects.PO_HomePage.*;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Marcos Alcazar
 *
 * @Description This Class represents the actions that can be performed in
 *              Liverpool Store Home page.
 *
 */

public class BL_HomePage {
    WebDriver driver;
    public BL_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void resultsSearch(String query) {
        driver.findElement(By.xpath(searchBar)).clear();
        driver.findElement(By.xpath(searchBar)).sendKeys(query);
        driver.findElement(By.xpath(searchBar)).sendKeys(Keys.ENTER);
        List articlesFound = driver.findElements(By.xpath(articleFound));
        if(articlesFound.size() > 0){
            assertEquals( true , driver.findElement(By.xpath(articleFound)).isDisplayed());
        }
    }

    public void noResultsSearch(String query) {
        driver.findElement(By.xpath(searchBar)).clear();
        driver.findElement(By.xpath(searchBar)).sendKeys(query);
        driver.findElement(By.xpath(searchBar)).sendKeys(Keys.ENTER);
        List noArticlesFound = driver.findElements(By.xpath(noArticleFound));
        if(noArticlesFound.size() > 0){
            assertEquals( true , driver.findElement(By.xpath(noArticleFound)).isDisplayed());
        }
    }

    public void smartTvResultsSearch(String query,String brand ,String minPrice ,String maxPrice ) {
        try{


        driver.findElement(By.xpath(searchBar)).clear();
        driver.findElement(By.xpath(searchBar)).sendKeys(query);
        driver.findElement(By.xpath(searchBar)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(minPriceFilter)).sendKeys(minPrice);
        driver.findElement(By.xpath(maxPriceFilter)).sendKeys(maxPrice);
        driver.findElement(By.xpath(priceFilterBtn)).click();
        driver.findElement(By.xpath(searchBrandFilter)).sendKeys(brand);
        driver.findElement(By.xpath(selectedBrand)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(searchSizeFilter)).click();
        driver.findElement(By.xpath(buyBtn)).click();
        assertEquals( true , driver.findElement(By.xpath(signInBtn)).isDisplayed());
        }
        catch(Exception e){

        }





    }

}
