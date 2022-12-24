package com.example.sil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import java.util.List;


public class Java {
    static WebDriver driver;
    @BeforeAll
    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kemal\\IdeaProjects\\sil\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://login1.nextbasecrm.com/");
    }
    @Test
    public void test1() throws InterruptedException {
        WebElement username = driver.findElement(By.className("login-inp"));
        username.sendKeys("xd");
        WebElement PASSWORD = driver.findElement(By.name("USER_PASSWORD"));
        PASSWORD.sendKeys("xd");
        WebElement loginbutton = driver.findElement(By.className("login-btn"));
        loginbutton.click();
        Thread.sleep(1000);
        String errormessage = "Incorrect login or password";
        WebElement gettingerrormessage=  driver.findElement(By.className("errortext"));

        if (gettingerrormessage.getText().equals(errormessage)){
            assert true;
        }
        else {
            assert false;
        }
    }
    @Test
    public void test2(){
        WebElement label =  driver.findElement(By.className("login-item-checkbox-label"));
        String text = "Remember me on this computer";
        if (text.equals(label.getText()))assert true;
        else assert false;
        WebElement forgotyourpassword = driver.findElement(By.className("login-link-forgot-pass"));
        String forgotyourpasswordtext = "Forgot your password?";
        System.out.println(forgotyourpassword.getText());
        if (forgotyourpasswordtext.equals(forgotyourpassword.getText())){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        String link = forgotyourpassword.getAttribute("href");
        String actualink = "forgot_password=yes";
        System.out.println(link);
        if (!link.equals(actualink)) {
            assert true;
        }
        else assert false;

        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count = 1;
        for (WebElement element: links) {
            System.out.println(count++ + " " + element.getAttribute("href"));
            System.out.print("  " + element.getText());

        }
    }
    @AfterAll
    public static void quit(){
        driver.quit();
    }
}
