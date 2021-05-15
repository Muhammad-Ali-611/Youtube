package Youtube;

import Base.CommonAPI;
import org.junit.Assert;
import org.junit.Test;

public class PageTitle extends CommonAPI {

    @Test
    public void CheckTitle(){
        String expectedTitle = "Youtube";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle ,actualTitle);
    }
}
