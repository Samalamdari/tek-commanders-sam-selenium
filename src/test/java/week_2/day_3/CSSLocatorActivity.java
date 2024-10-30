package week_2.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorActivity {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a.top-nav__btn")).click();


        driver.findElement(By.cssSelector("input#email")).sendKeys("asdf@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Wrongpassword");
        driver.findElement(By.cssSelector("button.w-full")).click();
        Thread.sleep(1000);
       String errorMessage = driver.findElement(By.cssSelector("div.error")).getText();
        System.out.println(errorMessage);

        driver.quit();









    }
}
