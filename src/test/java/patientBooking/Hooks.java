package patientBooking;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverfactory = new DriverFactory();

    @Before
    public void setup() {
        driverfactory.openBrowser();
        driverfactory.maxiBrowser();
        driverfactory.url("https://demo.patientbooking.co.uk/lgpdev/#/login");
        driverfactory.implicitlyWait();
        driverfactory.deleteCookies();
    }

    @After
    public void teardown() {
        driverfactory.closeBrowser();
    }
}
