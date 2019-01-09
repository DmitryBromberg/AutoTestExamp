import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\X3M\\Desktop\\chromedriver.exe");
        Configuration.browser = "chrome";
        open("https://market.leroymerlin.ru/");

    }

    @Test
    public void isPopapD9isplay() {
        MainPage test = new MainPage();
        Assert.assertTrue(test.PopapElementPresent());
    }
}
