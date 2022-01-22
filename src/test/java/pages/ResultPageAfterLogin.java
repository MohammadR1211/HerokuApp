package pages;

import Utils.CommonFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPageAfterLogin extends CommonFunctions {

    @FindBy(xpath="//*[@id='flash']")
    public WebElement flashMessage;

    public ResultPageAfterLogin(){
        PageFactory.initElements(driver, this);
    }
}
