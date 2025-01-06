package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

import static io.qameta.allure.Allure.step;

public class HomePageSteps {

    private final HomePage homePage = new HomePage();
    @Given("I navigate to the Home Page")
    public void mainPageDisplayed() throws InterruptedException {
        homePage.state().waitForDisplayed();
        step("Main Page is displayed");
        Assert.assertTrue(homePage.state().isDisplayed(), "Home page is not open");

    }
    @When("I navigate to the Login Page")
    public void clickLoginButton() {
        step("Click on Login Button");
        homePage.clickLogin();
    }
    @When("I click on free trials")
    public void clickSignUpButton() {
        step("Click on SignUp Button");
        homePage.clcikSignUp();
    }

    @When("I click on solutions")
    public void clickSol() {
        step("Click on Solutions");
        homePage.clickSolutions();
    }

    @When("I click on resources")
    public void clickRes() {
        step("Click on Resources");
        homePage.clickResource();
    }

    @And("I click on start your bussiness")
    public void clickStartYourBuss() {
        step("Click on Start your business");
        homePage.clickStartYourBussiness();
    }

    @Then("I should see start your bussiness page")
    public void displayedStartYourBuss() {
        step("Start your business Page");
        String message = homePage.getStartYourBussiness();
        Assert.assertEquals(message, "Ready to start selling?", "The message is not as expected!");
    }

    @And("I click on sell your product")
    public void clickSellYourProd() {
        step("Click on Sell Your Product");
        homePage.clickSellYourProduct();
    }

    @Then("I should see sell your product page")
    public void displayedSellEverywhere() {
        step("Sell Your Products Page");
        String message = homePage.getSellEveryWhere();
        Assert.assertEquals(message, "Sell everywhere", "The message is not as expected!");
    }

    @And("I click on Market Your Business")
    public void clickMarketYourBuss() {
        step("Click on Market Your Business");
        homePage.clickMarketYourBussiness();
    }

    @Then("I should see market your bussiness page")
    public void displayedMarketYourBussiness() {
        step("Market Your Business Page");
        String message = homePage.getMarketYourBussiness();
        Assert.assertEquals(message, "Unify your marketing", "The message is not as expected!");
    }

    @And("I click on sell manage your bussiness")
    public void clickManageYourBuss() {
        step("Click on Market Your Business");
        homePage.clickManageYourBussiness();
    }

    @Then("I should see manage your bussiness page")
    public void displayedManageYourBus() {
        step("Market Your Business Page");
        String message = homePage.getHeadingManageYourBus();
        Assert.assertEquals(message, "Manage your growing business", "The message is not as expected!");
    }

    @When("I click on pricing")
    public void clickPrice() {
        step("Click on Pricing");
        homePage.clcikPricing();
    }

    @Then("I should see pricing page")
    public void displayedPricing() {
        step("Pricing Page");
        String message = homePage.getheadingPricing().replaceAll("\\s+", " ").trim();;
        System.out.println(message);
        Assert.assertEquals(message, "Start for free, then enjoy your first month for $1", "The message is not as expected!");
    }

    @And("I click on start your help and support")
    public void clickHelp() {
        step("Click on Help and Support Link");
        homePage.clickGet24_7Support();
    }

    @Then("I should see help and support page")
    public void displayedHelp24() {
        step("Help and Support Page");
        String message = homePage.getheadinghelp();
        Assert.assertEquals(message, "Start", "The message is not as expected!");
    }

    @And("I click on start your what is Shopify")
    public void clickShopify() {
        step("Click on What is Shopify Link");
        homePage.clickWhatIsShopify();
    }

    @Then("I should see what is Shopify page")
    public void displayedShopify() {
        step("What is Shopify Page");
        String message = homePage.getheadingShopify();
        Assert.assertEquals(message, "What Is Shopify and How Does It Work? (2025)", "The message is not as expected!");
    }
    @And("I click on marketing")
    public void clickMarketing() {
        step("Click on Marketing Link");
        homePage.clickMarketing();
    }

    @Then("I should see marketing page")
    public void displayedMarketing() {
        step("Marketing Page");
        String message = homePage.getheadingMarketing();
        Assert.assertEquals(message, "What Is a Marketing Plan and How To Write One (+ Template)", "The message is not as expected!");
    }

    @When("I click on enterprise")
    public void clickEnterprise() {
        step("Click on Enterprise");
        homePage.clcikEnterprise();
    }

    @Then("I should see enterprise page")
    public void displayedEnterprise() {
        step("Enterprise Page");
        String message = homePage.getheadingEnterprise();
        Assert.assertEquals(message, "SHOPIFY FOR ENTERPRISE", "The message is not as expected!");
    }

    @When("Scroll down to about")
    public void scrollToAbout() {
        step("Scroll and click the About link");
        homePage.scrollToAboutAndClick();
    }

    @Then("I should see about page")
    public void displayedAbout() {
        step("Verify About page is displayed");
        String heading = homePage.getheadingAbout();
        Assert.assertEquals(heading, "Shopify powers millions of businesses worldwide",
                "Unexpected heading on About page");
    }

    @When("Scroll down to merchant support")
    public void scrollToMerchantSupport() {
        step("Scroll and click the Merchant Support link");
        homePage.scrollToMerchantSupportAndClick();
    }

    @Then("I should see merchant support page")
    public void displayedMerchantSupport() {
        step("Verify Merchant Support page is displayed");
        String heading = homePage.getheadinghAcademy();
        Assert.assertEquals(heading, "Essential education for the world of Shopify",
                "Unexpected heading on Merchant Support page");
    }

    @When("Scroll down to shopify dev")
    public void scrollToShopifyDev() {
        step("Scroll and click the Shopify.dev link");
        homePage.scrollToShopifyDevAndClick();
    }

    @Then("I should see shopify dev page")
    public void displayedShopifyDev() {
        step("Verify Shopify.dev page is displayed");
        String heading = homePage.getheadingShopifyDev();
        Assert.assertEquals(heading, "Build any commerce experience",
                "Unexpected heading on Shopify.dev page");
    }

    @When("Scroll down to sustainability")
    public void scrollToSustainability() {
        step("Scroll and click the Sustainability link");
        homePage.scrollToSustainabilityAndClick();
    }

    @Then("I should see sustainability page")
    public void displayedSustainability() {
        step("Verify Sustainability page is displayed");
        String heading = homePage.getheadingSustainability();
        Assert.assertEquals(heading, "Better commerce for a better planet",
                "Unexpected heading on Sustainability page");
    }

    @When("Scroll down to online store builder")
    public void scrollToOnlineStoreBuilder() {
        step("Scroll and click the Online Store Builder link");
        homePage.scrollToOnlineStoreBuilderAndClick();
    }

    @Then("I should see online store builder page")
    public void displayedOnlineStoreBuilder() {
        step("Verify Online Store Builder page is displayed");
        String heading = homePage.getheadingStoreBuilder();
        Assert.assertEquals(heading, "Built into every store",
                "Unexpected heading on Online Store Builder page");
    }
}
