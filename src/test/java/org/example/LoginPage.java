package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void mainTest(){
        //Locate Login
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        driver.findElement(By.tagName("button")).click();

        WebElement successmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));

        System.out.println("Success MSG: " + successmsg.getText());

        Assert.assertTrue(successmsg.getText().contains("You logged into a secure area!"));

        driver.findElement(By.cssSelector("a[href*='logout']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        System.out.println("Logout Successful :)");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
