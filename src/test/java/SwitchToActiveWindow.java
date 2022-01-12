import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SwitchToActiveWindow {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        var newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        var originalHandle = driver.getWindowHandle();

        for (var handle1:
             driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
        driver.quit();

    }
}
