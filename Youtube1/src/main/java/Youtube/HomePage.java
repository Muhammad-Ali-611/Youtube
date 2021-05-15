package Youtube;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    @Test
    public void Page(){
      WebDriver driver = new ChromeDriver();
       System.setProperty("WebDriver.ChromeDriver","C:\\Users\\chma6\\Links\\Youtube\\Driver\\chromedriver.exe");
       driver.get("https://www.youtube.com/");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.close();
    }
}
