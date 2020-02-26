package patientBooking.pageObjects;

import patientBooking.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class ResultsPage extends DriverFactory {
    /* create a method with action class to click on the products
 which are available at the end of page after scrolling a page */
    public WebElement clickOnHiddenProduct(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        return element;
    }

    // Random number generator method to select any WebElement or item
    public int randomNumberGenerator(int size) {
        Random random = new Random();
        return random.nextInt(size - 1);
    }
}