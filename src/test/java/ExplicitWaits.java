import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {
    public static void main(String[] args){

        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        var autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("155 Park Blvd, Palo Alto, CA");

        var wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        var autocompleteResult = wait
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();

        driver.quit();
    }
}
