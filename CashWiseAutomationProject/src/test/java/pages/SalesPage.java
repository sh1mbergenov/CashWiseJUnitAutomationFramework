package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SalesPage {
    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/dashboard/sales/clients/active']")
    public WebElement clients;
    @FindBy(xpath = "//a[@href='/dashboard/sales/products-and-services']")
    public WebElement productsAndServices;
    @FindBy(xpath = "//a[@href='/dashboard/sales/invoice/invoices']")
    public WebElement invoice;
    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-xdzsgw']")
    public WebElement addClient;
    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[2]")
    public WebElement clientTag;
 //   @FindBy(xpath = "//span[@class='MuiTouchRipple-root css-w0pj6f']")
    @FindBy(xpath = "//span[text()='Create new tag']")
    public WebElement createNewTag;
    @FindBy(xpath = "//div[text()='java']")
    public WebElement tag;
    @FindBy(id = "name_tag_input_text")
    public WebElement tagName;
    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement cancelButton;
    @FindBy(xpath = "//button[text()='Save']")
    public WebElement saveButton;
    @FindBy(id = "company_name_input_text")
    public WebElement companyName;
    @FindBy(id = "client_name_input_text")
    public WebElement fullName;
    @FindBy(id = "email_input_text")
    public WebElement email;
    @FindBy(id = "phone_number_input_text")
    public WebElement phoneNumber;
    @FindBy(id = "address_input_text")
    public WebElement address;





}

