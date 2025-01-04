package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HomePage extends Form {

    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ILink startFreeTrialLink = elementFactory.getLink(By.xpath("//a[contains(@href, 'store-create')]"), "Start Free Trial Link");
    private final ILink loginLink  = elementFactory.getLink(By.linkText("Log in"), "Log in");

    public HomePage() {
        super(By.linkText("Log in"), "Log in");
    }

    public void clickLogin() {
        loginLink.click();
    }

    public void clcikSignUp() {
        startFreeTrialLink.click();
    }
}
