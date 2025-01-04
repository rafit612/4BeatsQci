package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ProfilePage;

import static io.qameta.allure.Allure.step;

public class ProfilePageSteps {

    private final ProfilePage profilePage = new ProfilePage();

    @Then("I should be logged in successfully")
    public void profilePageDisplayed() {
        step("Profile Page is displayed");
        Assert.assertTrue(profilePage.state().isDisplayed(), "Profile page is not open");
    }
}
