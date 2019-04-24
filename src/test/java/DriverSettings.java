import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverSettings {
    public FirefoxDriver driver;
    @Before
    public void setAp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\hl\\Desktop\\dr\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    @After
    public void aft () {
        driver.quit();
    }
}

