package week_2.lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1_LabDay {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

//        driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Sign in']"))).click();
//        driver.findElement(By.id("email")).sendKeys("quinn.turner@example.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("quinn.turner@example.com");
//        driver.findElement(By.id("password")).sendKeys("password123");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("password123");
//        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']"))).click();
//        driver.findElement(By.xpath("//div[@class = 'ant-space-item']/button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'ant-space-item']/button"))).click();


       String text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul//div[@class = 'ant-space-item']"))).getText();
        System.out.println(text);
        driver.quit();











    }
}
