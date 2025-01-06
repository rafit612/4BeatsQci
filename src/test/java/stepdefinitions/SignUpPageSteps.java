package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SignupPage;

import static io.qameta.allure.Allure.step;

public class SignUpPageSteps {
    private final SignupPage signupPage = new SignupPage();

    @Then("I Should see a SignUp Page")
    public void isSignUpPageShown() throws InterruptedException {
        Thread.sleep(10000);
        step("SignUp Page is Opened ");
        Assert.assertTrue(signupPage.state().isDisplayed(), "SignUp Page is not open");
    }

    @Then("I should see free trials page")
    public void isTrialPageShown() throws InterruptedException {
        Thread.sleep(10000);
        step("SignUp Page is Opened ");
        Assert.assertTrue(signupPage.state().isDisplayed(), "SignUp Page is not open");
    }
}
