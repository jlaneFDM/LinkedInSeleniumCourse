import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        var formPage = new FormPage();
        formPage.submitForm(driver);

        var confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));
    }


}
