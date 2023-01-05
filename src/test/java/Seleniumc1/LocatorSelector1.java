package Seleniumc1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorSelector1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank");
        driver.manage().window().maximize();

        // name locator/Selector
        driver.findElement(By.name("username")).sendKeys("Musrat");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("8058943");
        Thread.sleep(2000);

        // linkText locator/Selector
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(2000);

        // partialLinkText locator/Selector
        driver.findElement(By.partialLinkText("Ad")).click();
        Thread.sleep(2000);

        // tagName locator/Selector
        driver.findElement(By.tagName("div")).click();
        Thread.sleep(2000);

        //absolute xpath
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[1]/a")).click();
        Thread.sleep(2000);

        //relative xpath
        driver.findElement(By.xpath("//a[normalize-space()='about']")).click();
        Thread.sleep(2000);
        //Css selector
        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")).click();
        Thread.sleep(2000);

    }
}