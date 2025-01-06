package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

import static io.qameta.allure.Allure.step;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage();
    @And("the Login Page is displayed")
    public void loginPagedisplayed() throws InterruptedException {
        step("Login Page is displayed");
        Assert.assertTrue(loginPage.state().isDisplayed(), "Login page is not open");
        Thread.sleep(2000);
    }
    @And("I login with email {string} and password {string}")
    public void loginByEmailAndPass(String email, String pass) throws InterruptedException {
        enterEmailAndContinue(email);
        enterPasswordAndSubmit(pass);
    }

    @Then("I login with email {string} and change email to {string} and password {string}")
    public void changeEmailAndLogin(String oldEmail, String newEmail, String pass) throws InterruptedException {
        step("Entering Old Email " + oldEmail);
        loginPage.enterEmail(oldEmail);
        step("Click on continue with email");
        loginPage.clickContinueWithEmail();
        step("Click on change email");
        loginPage.changeEmail();
        step("Changing email to " + newEmail);
        loginPage.enterEmail(newEmail);
        step("Click on continue with new email");
        loginPage.clickContinueWithEmail();
        step("Entering Password " + pass);
        loginPage.enterPassword(pass);
        step("Clicking on Submit Button");
        loginPage.clickLoginButton();
    }

    @And("I login with email {string}")
    public void loginByInvalidEmail(String email) throws InterruptedException {
        enterEmailAndContinue(email);

    }
    @Then("I login with email {string} and incorrect password {string}")
    public void loginByEmailAndInvalidPass(String email, String pass) throws InterruptedException {
        step("Entering Email "+email);
        loginPage.enterEmail(email);
        step("Click on continue with email");
        loginPage.clickContinueWithEmail();
        step("Entering Wrong Password "+pass);
        loginPage.enterPassword(pass);
        step("Clicking on Submit Button ");
        loginPage.clickLoginButton();
        step("Checking Incorrect Password ");
        String errorMessage = loginPage.getErrorMessageText();
        Assert.assertEquals(errorMessage, "Incorrect password", "The error message is not as expected!");
    }
    @And("I forget my password for email {string}")
    public void forgetPassword(String email) throws InterruptedException {
        step("Entering Email "+email);
        loginPage.enterEmail(email);
        step("Click on continue with email");
        loginPage.clickContinueWithEmail();
        step("Clicking Forget Password");
        loginPage.forgetPassword();
    }

    @Then("I should be redirected to the Password Reset page")
    public void forgetPassDisplayed() throws InterruptedException {
        String errorMessage = loginPage.getForgetPassword();
        Assert.assertEquals(errorMessage, "Forgot your password?", "The error message is not as expected!");
    }
    private void enterEmailAndContinue(String email) throws InterruptedException {
        step("Entering Email " + email);
        loginPage.enterEmail(email);
        step("Click on continue with email");

        loginPage.clickContinueWithEmail();
        Thread.sleep(2000);
    }

    private void enterPasswordAndSubmit(String pass) throws InterruptedException {
        step("Entering Password " + pass);
        loginPage.enterPassword(pass);
        step("Clicking on Submit Button");
        loginPage.clickLoginButton();
        Thread.sleep(2000);
    }


}
