package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ForgetPassPage extends Form {

    public ForgetPassPage() {
        super(By.xpath("//button[span[contains(text(),'Email password reset')]]"), "Email Password Reset Button");
    }
}
