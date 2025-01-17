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
            By.xpath("//*[@id='login_form']/div[2]/div[4]/button"),
            "Log in Button", ElementState.EXISTS_IN_ANY_STATE);
    private final ILink changeEmailLink = elementFactory.getLink(By.linkText("Change email"), "Change Email Link");
    private final IButton continueWithEmailButton = elementFactory.getButton(By.xpath("//button[contains(@class, 'captcha__submit') and .//span[text()='Continue with email']]"), "Continue with Email Button");
    private final ILink forgotPasswordLink = elementFactory.getLink(By.linkText("Forgot password?"), "Forgot Password Link");
    private final ILabel errorMessage = elementFactory.getLabel(By.xpath("//span[text()='Incorrect password']"), "Incorrect Password Error Message", ElementState.EXISTS_IN_ANY_STATE);
    private final ILabel forgetpass = elementFactory.getLabel(By.xpath("//h1[text()='Forgot your password?']"), "Forgot your password", ElementState.EXISTS_IN_ANY_STATE);

    public LoginPage() {
        super(By.id("account_email"), "Login");
    }

    public void enterEmail(String email) {
        emailInputField.state().waitForDisplayed();
        emailInputField.clearAndType(email);
    }

    public void enterPassword(String password) {
        passwordInputField.state().waitForDisplayed();
        passwordInputField.clearAndType(password);
    }

    public void clickContinueWithEmail() throws InterruptedException {
        continueWithEmailButton.state().waitForClickable();
        continueWithEmailButton.click();
        Thread.sleep(5000);
    }
    public void clickLoginButton() throws InterruptedException {
        loginButton.state().waitForClickable();
        loginButton.click();
        Thread.sleep(10000);
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
        errorMessage.state().waitForDisplayed();
        return errorMessage.getText();
    }

    public String getForgetPassword() {
        forgetpass.state().waitForDisplayed();
        return forgetpass.getText();
    }
}
