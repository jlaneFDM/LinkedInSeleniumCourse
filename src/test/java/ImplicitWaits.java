import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ImplicitWaits {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        var autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("155 Park Blvd, Palo Alto, CA");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        var autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
