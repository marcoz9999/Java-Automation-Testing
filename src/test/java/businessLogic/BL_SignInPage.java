package businessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static pageObjects.PO_SignInPage.*;


/**
 * @author Marcos Alcazar
 *
 * @Description This Class represents the actions that can be performed in
 *              Liverpool Store Home page.
 *
 */

public class BL_SignInPage {
    WebDriver driver;
    public BL_SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createAccount(String email, String password ,String firstName, String middleName, String lastName, String phoneNumber) {
        //driver.findElement(By.xpath(signInLink)).click();
        driver.findElement(By.xpath(createAccountLink)).click();
        driver.findElement(By.xpath(emailTextField)).sendKeys(email);
        driver.findElement(By.xpath(passwordTextField)).sendKeys(password);
        driver.findElement(By.xpath(createAccountBtn)).click();
        driver.findElement(By.xpath(firstNameTextField)).sendKeys(firstName);
        driver.findElement(By.xpath(middleNameTextField)).sendKeys(middleName);
        driver.findElement(By.xpath(lastNameTextField)).sendKeys(lastName);
        driver.findElement(By.xpath(daySelected)).click();
        driver.findElement(By.xpath(monthSelected)).click();
        driver.findElement(By.xpath(yearSelected)).click();
        driver.findElement(By.xpath(genderOption)).click();
        driver.findElement(By.xpath(createAccountBtn)).click();
        driver.findElement(By.xpath(phoneTextField)).sendKeys(phoneNumber);
        driver.findElement(By.xpath(continueBtn)).click();
    }

}
