import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        var image = driver.findElement(By.id("image"));
        var box = driver.findElement(By.id("box"));

        var actions  = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();

        driver.quit();
    }
}
