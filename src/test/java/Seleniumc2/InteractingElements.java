package Seleniumc2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class InteractingElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.className("Solutions")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.className("Solutions")).getText());

        driver.findElement(By.name("password")).sendKeys("standard_user");
        driver.findElement(By.name("password")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Gurulearningsite");
        driver.findElement(By.className("login")).submit();
        Thread.sleep(2000);


        driver.quit();
    }

}
