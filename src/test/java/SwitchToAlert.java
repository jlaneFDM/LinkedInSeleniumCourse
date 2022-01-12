import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToAlert {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/");

        var alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        var alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();


    }
}
