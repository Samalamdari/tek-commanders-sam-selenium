import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/auth/login");
        driver.manage().window().maximize();

        By newAccountOne = By.id("newCompanyAccount");
        WebElement signAccount = driver.findElement(newAccountOne);
        signAccount.click();

        driver.quit();`


    }
}
