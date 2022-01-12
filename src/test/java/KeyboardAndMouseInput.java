import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class KeyboardAndMouseInput {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("William Smith");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();

    }
}
