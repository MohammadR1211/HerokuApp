package steps;

import Utils.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends CommonFunctions {

    @Given("user is navigated to herokuApp")
    public void user_is_navigated_to_heroku_app() {
        System.out.println("Already passing this from hooks");
    }


    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) {
        login.usernameField.sendKeys(username);
        login.passwordField.sendKeys(password);
    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        login.submitButton.click();
    }
    @Then("user is navigated to results page and verify successful {string}")
    public void user_is_navigated_to_results_page_and_verify_successful(String string) {
        String message = result.flashMessage.getText();
       System.out.println(message);


        Assert.assertTrue(result.flashMessage.isDisplayed());

    }

    @When("user enters invalid {string} and {string}")
    public void user_enters_invalid_and(String username, String password) {
       login.usernameField.sendKeys(username);
       login.passwordField.sendKeys(password);
    }


    @Then("user is navigated to error message and verify {string}")
    public void user_is_navigated_to_error_message_and_verify(String error) {
    String  errorExpected = login.errorMessage.getText();

    System.out.println(errorExpected);
        String[] separated = errorExpected.split("!");
        System.out.println(separated);
        Assert.assertTrue(login.errorMessage.isDisplayed());
    }

}
