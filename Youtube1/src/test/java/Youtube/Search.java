package Youtube;

import Base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;

public class Search extends CommonAPI {

    @Test
    public void Search() throws InterruptedException {
        List<String> SearchList = SearchPage("");
        for (String Search : SearchList) {
         typeOnCss("#container",Search);
            Thread.sleep(2000);
            clearInputField("#container");
        }
    }
}
