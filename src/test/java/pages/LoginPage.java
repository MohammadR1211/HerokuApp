package pages;

import Utils.CommonFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonFunctions {

    @FindBy(xpath="//*[@id='username']")
    public WebElement usernameField;

    @FindBy(xpath="//*[@id='password']")
    public WebElement passwordField;

    @FindBy(xpath="//button[@type='submit']/i")
    public WebElement submitButton;

    @FindBy(xpath="//div[contains(text(),'Your')]")
    public WebElement errorMessage;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
