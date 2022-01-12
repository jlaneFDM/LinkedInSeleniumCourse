import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DatePickers {

    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/datepicker");

        var dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2022");
        dateField.sendKeys(Keys.RETURN);
        driver.quit();
    }
}
