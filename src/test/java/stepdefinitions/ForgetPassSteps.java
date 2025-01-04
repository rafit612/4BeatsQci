package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ForgetPassPage;

import static io.qameta.allure.Allure.step;

public class ForgetPassSteps {

    private final ForgetPassPage forgetPassPage = new ForgetPassPage();

    @Then("I should be redirected to the Password Reset page")
    public void forgetPassDisplayed() {
        step("Forget Password is displayed");
        Assert.assertTrue(forgetPassPage.state().isDisplayed(), "Forget Password is not displayed");
    }
}
