package WeekOneLabDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3WrongPassword {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By signinBoutton = By.xpath("/html/body/div/div/div/a");
        WebElement signinLocator = driver.findElement(signinBoutton);
        signinLocator.click();
        Thread.sleep(1000);

        By emailButton = By.id("email");
        WebElement emailLoator = driver.findElement(emailButton);
        emailLoator.sendKeys("wrong@gmail.com");

        Thread.sleep(1000);

        By passwordButton = By.id("password");
        WebElement passwordLocator = driver.findElement(passwordButton);
        passwordLocator.sendKeys("passwordWrong");

        Thread.sleep(1000);

        By login = By.xpath("/html/body/main/div/div/div[2]/div/div[2]/form/div[3]/div/div/div/div/div/button[1]");
        WebElement loginLocator = driver.findElement(login);
        loginLocator.click();

        Thread.sleep(1000);


        By errorMessage = By.className("ant-alert-message");
        WebElement errorLocator = driver.findElement(errorMessage);
        String messageText = errorLocator.getText();

        System.out.println(messageText);

        driver.quit();

    }
}
