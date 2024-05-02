package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {
    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-2a0pw7']")
    public WebElement infographics;
    @FindBy(xpath = "//li[text()='Sales']")
    public WebElement sales;
    @FindBy(xpath = "//li[text()='Expenses']")
    public WebElement expenses;
    @FindBy(xpath = "//li[text()='Reports']")
    public WebElement reports;
    @FindBy(xpath = "//p[text()='test test']")
    public WebElement testTest;
    @FindBy(xpath = "//li[text()='Log out']")
    public WebElement logout;
    @FindBy(xpath = "//button[text()='Log out']")
    public WebElement logOutButton;


}
