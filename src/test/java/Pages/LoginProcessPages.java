package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginProcessPages {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginProcessPages(WebDriver driver){
        this.driver=driver;
        this.elementHelper=new ElementHelper(driver);
        this.wait=new WebDriverWait(driver,10);
    }

    By loginButton=By.cssSelector("button[type='submit']");
    By errorMessageForUserName=By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth" +
            "-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > " +
            "div:nth-child(1) > span:nth-child(3)");
    By errorMessageForPassword=By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth" +
            "-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(3) " +
            "> div:nth-child(1) > span:nth-child(3)");
    By userNameElement=By.cssSelector("input[placeholder='Username']");
    By passwordElement=By.cssSelector("input[placeholder='Password']");
    By errorMessageForFalseLogin=By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text");
    By checkCorrectLoginElement=By.cssSelector(".oxd-userdropdown-name");


    public void goToLoginPages() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton);
    }
    public void checkErrorMessageForEmptyFields(String error) {
        elementHelper.checkText(error,errorMessageForUserName);
        elementHelper.checkText(error,errorMessageForPassword);
    }
    public void enterPassword(String password) {
        elementHelper.sendKey(passwordElement,password);
    }
    public void checkErrorMessageForEmptyUserName(String error) {
        elementHelper.checkText(error,errorMessageForUserName);
    }
    public void enterUserName(String userName) {
        elementHelper.sendKey(userNameElement,userName);
    }
    public void checkErrorMessageForEmptyPassword(String error) {
        elementHelper.checkText(error,errorMessageForPassword);
    }
    public void checkErrorMessageForFalseLogin(String error) {
        elementHelper.checkText(error,errorMessageForFalseLogin);
    }
    public void checkCorrectLoginProcess() {
        elementHelper.checkVisible(checkCorrectLoginElement);
    }
}
