import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RadioButtonsAndCheckBoxes {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        var driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        var radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        var radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        var radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.quit();
    }
}
