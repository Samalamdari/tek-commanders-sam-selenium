import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityWithWrongPassword {


    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        By signinBoutton = By.id("signinLink");
        WebElement signinLocator = driver.findElement(signinBoutton);
        signinLocator.click();

        By emailButton = By.name("email");
        WebElement emailLoator = driver.findElement(emailButton);
        emailLoator.sendKeys("aaaa@gmail.com");
        Thread.sleep(1000);

        By passwordButton = By.name("password");
        WebElement passwordLocator = driver.findElement(passwordButton);
        passwordLocator.sendKeys("qaz123");
        Thread.sleep(1000);

        By login = By.id("loginBtn");
        WebElement loginLocator = driver.findElement(login);
        loginLocator.click();
        Thread.sleep(1000);


        By errorMessage = By.className("error");
        WebElement errorLocator = driver.findElement(errorMessage);
        String messageText = errorLocator.getText();

        System.out.println(messageText);









    }
}
