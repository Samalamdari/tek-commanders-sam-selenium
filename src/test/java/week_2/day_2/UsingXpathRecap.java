package week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathRecap {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        By signinLocator = By.xpath("//a[@id = 'signinLink']");
        WebElement signinElement = driver.findElement(signinLocator);
        signinElement.click();
        Thread.sleep(1000);

        By emailLocator = By.xpath("//input[@name = 'email']");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("mohammad2536@gmail.com");
        Thread.sleep(1000);


        By passwordLocator = By.xpath("//input[@name = 'password']");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password@123");
        Thread.sleep(1000);

        By loginLocator = By.xpath("//button[@type = 'submit']");
        WebElement loginElement = driver.findElement(loginLocator);
        loginElement.click();
        Thread.sleep(1000);

        boolean isLogoutDisplayed = driver.findElement(By.xpath("//button[@class = 'top-nav__btn']")).isDisplayed();

        if (isLogoutDisplayed){
            System.out.println("Successfully Logged in");
        } else System.out.println("Not Logged in");


        driver.quit();










    }
}
