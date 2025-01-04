package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ITextBox emailInputField = elementFactory.getTextBox(By.id("account_email"), "Email Input Field");
    private final ITextBox passwordInputField = elementFactory.getTextBox(By.id("account_password"), "Password Input Field");
    private final IButton loginButton = elementFactory.getButton(
            By.xpath("//div[@class='footer-form-submit']//button[contains(@class, 'captcha__submit') and .//span[@class='ui-button__text' and text()='Log in']]"),
            "Log in Button",
            ElementState.EXISTS_IN_ANY_STATE
    );

    private final ILink changeEmailLink = elementFactory.getLink(By.linkText("Change email"), "Change Email Link");
    private final IButton continueWithEmailButton = elementFactory.getButton(By.xpath("//button[contains(@class, 'captcha__submit') and .//span[text()='Continue with email']]"), "Continue with Email Button");
    private final ILink forgotPasswordLink = elementFactory.getLink(By.linkText("Forgot password?"), "Forgot Password Link");
    private final ILabel errorMessage = elementFactory.getLabel(By.xpath("//p[@class='validation-error' and contains(text(), 'Incorrect password')]"), "Incorrect Password Error Message");

    public LoginPage() {
        super(By.id("account_email"), "Login");
    }

    public void enterEmail(String email) {
        emailInputField.clearAndType(email);
    }

    public void enterPassword(String password) {
        passwordInputField.clearAndType(password);
    }

    public void clickContinueWithEmail() {
        continueWithEmailButton.state().waitForClickable();
        continueWithEmailButton.click();
    }
    public void clickLoginButton() {
        loginButton.state().waitForClickable(Duration.ofSeconds(10));
        loginButton.click();
    }
    public void changeEmail(){
        changeEmailLink.state().waitForClickable();
        changeEmailLink.click();
    }

    public void forgetPassword(){
        forgotPasswordLink.state().waitForClickable();
        forgotPasswordLink.click();
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }
}
