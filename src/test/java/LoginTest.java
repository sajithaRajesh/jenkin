import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Sajitha on 1/14/2017.
 */
public class LoginTest {
public static WebDriver driver;
    public static String url="https://www.google.com/";

    @Test
    public static void open(){
        driver=new FirefoxDriver();
        driver.get(url);
        System.out.print(driver.getTitle());
        /*added added*/
    }

}
