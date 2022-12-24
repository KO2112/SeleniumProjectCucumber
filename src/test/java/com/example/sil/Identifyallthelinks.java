package com.example.sil;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Identifyallthelinks {
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
    public void allthelinks(){
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int count = 1;
        for (WebElement element: links) {
            System.out.println(count + " " + element.getText());
            System.out.println(element.getAttribute("HREF"));
            count++;
        }
    }
    @AfterAll
    public static void quitdriver(){
        driver.quit();
    }
}
