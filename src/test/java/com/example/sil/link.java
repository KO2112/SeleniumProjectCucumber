package com.example.sil;

import gherkin.lexer.Th;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
    static WebDriver driver;

    @BeforeAll
    public static void setDriver(){
        System.setProperty("chromedriver.exe","C:\\Users\\kemal\\IdeaProjects\\sil\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://practice.cydeo.com/abtest");
    }
    @Test
    public void test1() throws InterruptedException {
        WebElement cydeolink = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/a"));
        System.out.println(cydeolink.getText());

        cydeolink.isDisplayed();
        driver.navigate().refresh();
        Thread.sleep(3000);
        WebElement cydeolink2 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/a"));
        cydeolink2.isDisplayed();
    }
    @AfterAll
    public static void quitdriver(){
        driver.quit();
    }
}
