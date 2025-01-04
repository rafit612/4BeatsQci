package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SignupPage extends Form {

    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ILabel createAccountHeading = elementFactory.getLabel(By.className("ui-heading"), "Create a Shopify Account Heading");

    public SignupPage() {
        super(By.className("ui-heading"), "Create a Shopify Account Heading");
    }

}
