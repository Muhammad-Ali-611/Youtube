package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters ({"url"})
    @BeforeMethod

    public void SetUp(String url){
        System.setProperty("WebDriver.ChromeDriver","C:\\Users\\chma6\\Links\\Youtube\\Driver\\chromedriver.exe");
        driver.get("https://www.youtube.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterMethod
            public void CleanUp(){
        driver.close();

    }
    //common api
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void clearInputField(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public List<String>SearchPage(String locator ){
        List <WebElement> webElements = driver.findElements(By.cssSelector(locator));
        List<String> listOfText = new ArrayList<>();
        for (WebElement element: webElements){
            listOfText.add(element.getText());

        }
        return listOfText;
    }
}
