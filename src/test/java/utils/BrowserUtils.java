package utils;

import aquality.selenium.browser.AqualityServices;

public class BrowserUtils {
    private BrowserUtils() {
    }

    public static void navigateToPreviousPage() {
        AqualityServices.getBrowser().goBack();
    }
}
