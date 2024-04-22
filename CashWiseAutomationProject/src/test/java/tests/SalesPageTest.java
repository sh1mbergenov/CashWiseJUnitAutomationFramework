package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.LoginPage;
import pages.SalesPage;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.time.Duration;

public class SalesPageTest {
    SalesPage salesPage = new SalesPage();
    LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();
    WebDriver driver;
    @Test
    public void addClient(){
        driver = Driver.getDriver();
        driver.get("https://www.cashwise.us/main");
        loginPage.logIn("admin@codewise.com","codewise123");
        SeleniumUtils.waitForSeconds(5);
        Assertions.assertEquals(driver.getCurrentUrl(),"https://www.cashwise.us/dashboard/infographics");
        commonPage.sales.click();
        salesPage.clients.click();
        salesPage.addClient.click();
        salesPage.clientTag.click();
        salesPage.tag.click();
        salesPage.companyName.sendKeys("codewise");
        salesPage.fullName.sendKeys("codewise");
        salesPage.email.sendKeys("codewiser12345@gmail.com");
        salesPage.phoneNumber.sendKeys("14851342001");
        salesPage.address.sendKeys("2250 E Devon street");
        salesPage.saveButton.click();
    }
}
