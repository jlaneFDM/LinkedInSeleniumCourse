import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ExecutingJavaScriptCommands {

    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/modal");

        /* how to open modal buttons that might otherwise be inaccessible using JS */
        var modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        var closeButton = driver.findElement(By.id("close-button"));

        var js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].click()", closeButton);

        driver.quit();

    }
}
