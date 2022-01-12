import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DropdownMenus {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/dropdown");

        var dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();

        var autoCompleteItem = driver.findElement(By.id("autocomplete"));
        autoCompleteItem.click();

        driver.quit();
    }
}
