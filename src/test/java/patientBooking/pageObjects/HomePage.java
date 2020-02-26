package patientBooking.pageObjects;

import patientBooking.DriverFactory;

public class HomePage extends DriverFactory {
    // HomePage URL
    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }
}
