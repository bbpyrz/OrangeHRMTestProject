package StepDefinitions;

import Pages.LoginProcessPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginProcessStepDefinitions {
    WebDriver driver= DriverFactory.getDriver();
    LoginProcessPages loginProcessPages=new LoginProcessPages(driver);

    @Given("User At Login Page")
    public void userAtLoginPage() {loginProcessPages.goToLoginPages();
    }
    @When("Click Login Button")
    public void clickLoginButton() {loginProcessPages.clickLoginButton();
    }
    @Then("Check {string} messages For Empty Fields")
    public void checkMessagesForEmptyFields(String error) {loginProcessPages.checkErrorMessageForEmptyFields(error);
    }
    @When("Enter Password to {string}")
    public void enterPasswordTo(String password) {loginProcessPages.enterPassword(password);
    }
    @Then("Check {string} messages For Empty UserName Field")
    public void checkMessagesForEmptyUserNameField(String error) {loginProcessPages.checkErrorMessageForEmptyUserName(error);
    }
    @When("Enter UserName to {string}")
    public void enterUserNameTo(String userName) {loginProcessPages.enterUserName(userName);
    }
    @Then("Check {string} messages For Empty Password Field")
    public void checkMessagesForEmptyPasswordField(String error) {loginProcessPages.checkErrorMessageForEmptyPassword(error);
    }
    @Then("Check {string} messages")
    public void checkMessages(String error) {loginProcessPages.checkErrorMessageForFalseLogin(error);
    }
    @Then("Check Correct Login Process")
    public void checkCorrectLoginProcess() {loginProcessPages.checkCorrectLoginProcess();
    }
}
