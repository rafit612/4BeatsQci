package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ProfilePage extends Form {


    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ILabel myStore = elementFactory.getLabel(By.xpath("//p[contains(@class, 'Polaris-Text--truncate') and text()='My Store']"), "My Store Label");

    public ProfilePage() {
        super(By.xpath("//p[contains(@class, 'Polaris-Text--truncate') and text()='My Store']"), "My Store Label");
    }
}
