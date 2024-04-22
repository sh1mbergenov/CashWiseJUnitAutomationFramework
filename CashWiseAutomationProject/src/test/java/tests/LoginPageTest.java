package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.LoginPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();
    @BeforeEach
    public void navigate(){
        driver = Driver.getDriver();
        driver.get("https://www.cashwise.us/main");
    }
    @Test
    public void logIn(){
        loginPage.logIn("admin@codewise.com","codewise123");
        loginPage.signIn2.click();
    }
}
