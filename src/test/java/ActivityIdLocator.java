import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityIdLocator {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/auth/login");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        By signIn = By.id("signinLink");
        WebElement sign = driver.findElement(signIn);
        sign.click();

        By createAccount = By.id("newAccountBtn");
        WebElement createNewAccount = driver.findElement(createAccount);
        createNewAccount.click();

        driver.quit();



    }
}
