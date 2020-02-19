package porscheProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.Driver;

public class TestBase {

    static WebDriver driver;

    @Parameters("DriverName")
    @BeforeTest(alwaysRun = true)
    public void setUpDriver(String DriverName){
        driver= Driver.getDriver(DriverName);
        driver.manage().window().maximize();
    }
}
