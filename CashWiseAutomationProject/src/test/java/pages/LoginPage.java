package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-1wgjx4y']")
    public WebElement signIn;
    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root css-k6k41x']")
    public WebElement signUp;
    @FindBy(id = "email_input_text")
    public WebElement signInEmail;
    @FindBy(id = "password_input_text")
    public WebElement signInPassword;
    @FindBy(id = "email_input_text")
    public WebElement signUpEmail;
    @FindBy(css = "input[name='password']")
    public WebElement signUpPassword;
    @FindBy(id = "repeat_password_input_text")
    public WebElement confirmPassword;
    @FindBy(css = "button[class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root css-1hz3hle']")
    public WebElement continueButton;
    @FindBy(id = "first_name_input_text")
    public WebElement firstname;
    @FindBy(id = "last_name_input_text")
    public WebElement lastname;
    @FindBy(id = "company_name_input_text")
    public WebElement nameOfYourBusiness;
    @FindBy(xpath = "//label[text()='Area of your business']")
    public WebElement areaOfBusiness;
    @FindBy(id = "address_input_text")
    public WebElement address;
    @FindBy(xpath = "//label[text()='Select currency']")
    public WebElement selectCurrency;
    @FindBy(xpath = "(//button[text()='Sign in'])[2]")
    public WebElement signIn2;

    public void logIn(String email,String password){
       signIn.click();
       signInEmail.sendKeys(email);
       signInPassword.sendKeys(password);
       signIn2.click();
    }




}
