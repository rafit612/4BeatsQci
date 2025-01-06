package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends Form {


    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ILink startFreeTrialLink = elementFactory.getLink(By.xpath("//a[contains(@href, 'store-create')]"), "Start Free Trial Link");
    private final ILink loginLink  = elementFactory.getLink(By.linkText("Log in"), "Log in");
    private final ILink pricing  = elementFactory.getLink(By.linkText("Pricing"), "Pricing");
    private final ILink enterprise  = elementFactory.getLink(By.linkText("Enterprise"), "Enterprise");
    private final IButton solutions  = elementFactory.getButton(By.xpath("//span[text()='Solutions']"), "Solutions");
    private final IButton resources  = elementFactory.getButton(By.xpath("//span[text()='Resources']"), "Resources");

    private final ILink startYourBussiness  = elementFactory.getLink(By.xpath("//span[text()='Start your business']"), "Start your business");
    private final ILink get24_7Support  = elementFactory.getLink(By.xpath("//a[.//span[contains(text(), 'Help and support')]]"), "Help and support");
    private final ILink sellYourProduct  = elementFactory.getLink(By.xpath("//span[text()='Sell your products']"), "Sell your products");
    private final ILink marketYourBussiness  = elementFactory.getLink(By.xpath("//span[text()='Market your business']"), "Market your business");
    private final ILink manageYourBussiness  = elementFactory.getLink(By.xpath("//span[text()='Manage your business']"), "Manage your business");
    private final ILink whatIsSHopify  = elementFactory.getLink(By.xpath("//span[text()='What is Shopify?']"), "What is Shopify?");
    private final ILink marketing  = elementFactory.getLink(By.xpath("//span[text()='Marketing']"), "Marketing");

    private final ILabel headingStart247Help = elementFactory.getLabel(By.xpath("//h2[text()='Start']"), "Start");
    private final ILabel headingStart = elementFactory.getLabel(By.xpath("//h1[text()='Ready to start selling?']"), "Ready to start selling?");
    private final ILabel headingSellEveryWhere = elementFactory.getLabel(By.xpath("//h1[text()='Sell everywhere']"), "Sell everywhere");
    private final ILabel headingUnifyYourMark = elementFactory.getLabel(By.xpath("//h1[text()='Unify your marketing']"), "Unify your marketing");
    private final ILabel headingManageYourBus= elementFactory.getLabel(By.xpath("//h1[text()='Manage your growing business']"), "Manage your growing business");
    private final ILabel headingPricing= elementFactory.getLabel(By.xpath("//h1[text()='Start for free, then enjoy']"), "Start for free, then enjoy");
    private final ILabel headingShopify= elementFactory.getLabel(By.xpath("//h1[text()='What Is Shopify and How Does It Work? (2025)']"), "What Is Shopify and How Does It Work? (2025)");
    private final ILabel headingMarketing= elementFactory.getLabel(By.xpath("//h1[text()='What Is a Marketing Plan and How To Write One (+ Template)']"), "Marketing");
    private final ILabel headingEnterprise= elementFactory.getLabel(By.xpath("//h1[text()='Shopify for enterprise']"), "Enterprise");

    private final ILink aboutLink = AqualityServices.getElementFactory().getLink(By.xpath("//a[@aria-label='About']"), "About Link");
    private final ILink shopifyAcademy = AqualityServices.getElementFactory().getLink(By.xpath("//a[contains(text(),'Academy')]"), "Shopify Academy");
    private final ILink shopifyDev = AqualityServices.getElementFactory().getLink(By.xpath("//a[contains(text(),'Shopify.dev')]"), "Shopify.dev");
    private final ILink sustainbilityLink = AqualityServices.getElementFactory().getLink(By.xpath("//a[@aria-label='Sustainability']"), "Sustainability");
    private final ILink onlineStoreLink = AqualityServices.getElementFactory().getLink(By.xpath("//a[@aria-label='Online Store Builder']"), "Online Store Builder");

    private final ILabel headingAbout= elementFactory.getLabel(By.xpath("//h1[text()='Shopify powers millions of businesses worldwide']"), "Shopify powers millions of businesses worldwide");
    private final ILabel headingMerchant= elementFactory.getLabel(By.xpath("//h1[text()='Essential education for the world of Shopify']"), "Essential education for the world of Shopify");
    private final ILabel headingShopifyDev= elementFactory.getLabel(By.xpath("//h1[text()='Build any commerce experience']"), "Build any commerce experience");
    private final ILabel headingSustainability= elementFactory.getLabel(By.xpath("//h1[text()='Better commerce for a better planet']"), "Better commerce for a better planet");
    private final ILabel headingStoreBuilder= elementFactory.getLabel(By.xpath("//h2[text()='Built into every store']"), "Online Store Builder");

    public HomePage() {
        super(By.linkText("Log in"), "Log in");
    }

    public void clickLogin() {
        loginLink.state().waitForDisplayed();
        loginLink.click();
    }

    public void clcikSignUp() {
        startFreeTrialLink.state().waitForDisplayed();
        startFreeTrialLink.click();
    }

    public void clcikPricing() {
        pricing.state().waitForDisplayed();
        pricing.click();
    }

    public void clcikEnterprise() {
        enterprise.state().waitForDisplayed();
        enterprise.click();
    }

    public void clickSolutions() {
        solutions.click();
    }

    public void clickResource() {
        resources.state().waitForDisplayed();
        resources.click();
    }
    public void clickStartYourBussiness() {
        startYourBussiness.state().waitForDisplayed();
        startYourBussiness.click();
    }
    public void clickGet24_7Support() {
        get24_7Support.state().waitForDisplayed();
        get24_7Support.click();
    }
    public void clickSellYourProduct() {
        sellYourProduct.state().waitForDisplayed();
        sellYourProduct.click();
    }
    public void clickMarketYourBussiness() {
        marketYourBussiness.state().waitForDisplayed();
        marketYourBussiness.click();
    }
    public void clickManageYourBussiness() {
        manageYourBussiness.state().waitForDisplayed();
        manageYourBussiness.click();
    }
    public void clickWhatIsShopify() {
        whatIsSHopify.state().waitForDisplayed();
        whatIsSHopify.click();
    }
    public void clickMarketing() {
        marketing.state().waitForDisplayed();
        marketing.click();
    }
    public String getStartYourBussiness() {
        headingStart.state().waitForDisplayed();
        return headingStart.getText();
    }
    public String getSellEveryWhere() {
        headingSellEveryWhere.state().waitForDisplayed();
        return headingSellEveryWhere.getText();
    }
    public String getMarketYourBussiness() {
        headingUnifyYourMark.state().waitForDisplayed();
        return headingUnifyYourMark.getText();
    }

    public String getHeadingManageYourBus() {
        headingManageYourBus.state().waitForDisplayed();
        return headingManageYourBus.getText();
    }
    public String getheadingPricing() {
        headingPricing.state().waitForDisplayed();
        return headingPricing.getText();
    }

    public String getheadinghelp() {
        headingStart247Help.state().waitForDisplayed();
        return headingStart247Help.getText();
    }
    public String getheadingShopify() {
        headingShopify.state().waitForDisplayed();
        return headingShopify.getText();
    }
    public String getheadingMarketing() {
        headingMarketing.state().waitForDisplayed();
        return headingMarketing.getText();
    }
    public String getheadingEnterprise() {
        headingEnterprise.state().waitForDisplayed();
        return headingEnterprise.getText();
    }

    public void scrollToAboutAndClick() {
        scrollToAndClick(aboutLink);
    }

    public void scrollToMerchantSupportAndClick() {
        scrollToAndClick(shopifyAcademy);
    }

    public void scrollToShopifyDevAndClick() {
        scrollToAndClick(shopifyDev);
    }

    public void scrollToSustainabilityAndClick() {
        scrollToAndClick(sustainbilityLink);
    }

    public void scrollToOnlineStoreBuilderAndClick() {
        scrollToAndClick(onlineStoreLink);
    }

    public void scrollToAndClick(ILink link) {
        AqualityServices.getBrowser().executeScript("arguments[0].scrollIntoView(true);", link.getElement());
        link.state().waitForDisplayed();
        link.click();
    }

    public String getheadingAbout() {
        headingAbout.state().waitForDisplayed();
        return headingAbout.getText();
    }

    public String getheadinghAcademy() {
        headingMerchant.state().waitForDisplayed();
        return headingMerchant.getText();
    }
    public String getheadingShopifyDev() {
        headingShopifyDev.state().waitForDisplayed();
        return headingShopifyDev.getText();
    }
    public String getheadingSustainability() {
        headingSustainability.state().waitForDisplayed();
        return headingSustainability.getText();
    }
    public String getheadingStoreBuilder() {
        headingStoreBuilder.state().waitForDisplayed();
        return headingStoreBuilder.getText();
    }
}
