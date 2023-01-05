package Seleniumc1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsSelectors {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //name selector/locator
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        //id locator/selector
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(2000);
        //classname locator/selector
        driver.findElement(By.className("inventory_item_name")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}