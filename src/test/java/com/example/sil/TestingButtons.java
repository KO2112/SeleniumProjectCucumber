package com.example.sil;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingButtons {
     static WebDriver driver;

    @BeforeAll
    public static void setDriver(){
        System.setProperty("chromedriver.exe","C:\\Users\\kemal\\IdeaProjects\\sil\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://practice.cydeo.com/multiple_buttons");
    }
    @Test
    public void testingbuttons(){
        WebElement result = driver.findElement(By.id("result"));
        WebElement button1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/button[1]"));
        button1.click();
        if (result.getText().equals("Clicked on button one!")){
            System.out.println("true");
        }
    }
    @AfterAll
    public static void quitdriver(){
        driver.quit();
    }
}
