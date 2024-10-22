import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.bbc.com/news");

        chromeDriver.manage().window().maximize();
        String pageTitle = chromeDriver.getTitle();

        System.out.println(pageTitle);
        chromeDriver.quit();


    }

}
