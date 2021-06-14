import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {


    WebDriver driver;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
    }

    @Test
    void googleTest(){
        driver.get("http://google.com");
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
