package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

import static io.qameta.allure.Allure.step;

public class HomePageSteps {

    private final HomePage homePage = new HomePage();
    @Given("I navigate to the Home Page")
    public void mainPageDisplayed() {
        step("Main Page is displayed");
        Assert.assertTrue(homePage.state().isDisplayed(), "Home page is not open");
    }
    @When("I navigate to the Login Page")
    public void clickLoginButton() {
        step("Click on Login Button");
        homePage.clickLogin();
    }

    public void clickSignUpButton() {
        step("Click on SignUp Button");
        homePage.clcikSignUp();
    }

}
