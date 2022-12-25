package com.example.sil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestCydeo extends TestListenerAdapter {
    static WebDriver driver;

    @BeforeAll
    public static void setDriver(ITestResult testResult){

        System.setProperty("chromedriver.exe", "C:\\Users\\kemal\\IdeaProjects\\sil\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://practice.cydeo.com/forgot_password");
    }
    @Test
    public void locatedelements(ITestResult testResult) throws InterruptedException{
        boolean isokay = false;
        WebElement homelink = driver.findElement(By.className("nav-link"));
        homelink.isDisplayed();
        if (homelink.isDisplayed()) isokay = true;

        String actualheader = "Forgot Password";
        WebElement headertext = driver.findElement(By.tagName("H2"));
        if (headertext.getText().equals(actualheader)) isokay = true;
        else isokay = false;

        String actualemailtext = "E-mail";
        WebElement emailtext = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/label"));
        if (emailtext.getText().equals(actualheader)) isokay = true;
        else isokay = false;

        WebElement emailinput = driver.findElement(By.name("email"));
        if (emailinput.isDisplayed()) isokay = true;
        else isokay = false;

        if (isokay) assert true;
        else assert false;

    }
    @AfterAll
    public static void driverQuit(ITestResult testResult){
        driver.quit();
    }
}
