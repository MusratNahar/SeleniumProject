package Seleniumc2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InformationWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println("Display : " + driver.findElement(By.id("userEmail")).isDisplayed());
        System.out.println("isEnabled : " + driver.findElement(By.id("userEmail")).isEnabled());
        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/checkbox");
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.className("rct-icon-uncheck")).isSelected());
        System.out.println(driver.findElement(By.className("rct-icon-uncheck")).getTagName());
        System.out.println(driver.findElement(By.className("rct-icon-uncheck")).getCssValue("font-family"));
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();

    }
}
