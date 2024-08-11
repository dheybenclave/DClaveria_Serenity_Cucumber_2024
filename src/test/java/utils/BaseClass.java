package utils;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stepdefinitions.ParameterDefinitions;

public class BaseClass extends PageObject {
    public static Logger logger = LoggerFactory.getLogger(ParameterDefinitions.class);
    WebDriver driver;

    //
    @Before
    void setup() {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        System.setProperty("webdriver.chrome.driver", "./src/test/resources/windows/chromedriver.exe");
//        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
//        options.addArguments(
//                "--start-maximized", "--remote-allow-origins=*", "--test-type", "--no-sandbox", "--ignore-certificate-errors",
//                "--incognito", "--disable-infobars", "--disable-gpu", "--disable-default-apps", "--disable-popup-blocking",
//                "--disable-dev-shm-usage", "--disable-extensions", "--disable-web-security", "--disable-translate", "--disable-logging");
//
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(capabilities);
//        driver.manage().window().maximize();
//        driver = new ChromeDriver(options);
//        System.out.println("manage().window().maximize();");
//        this.getDriver().manage().window().maximize();
    }


    @AfterEach
    public void tearDown() throws Exception {

        this.getDriver().close();
        driver.close();
        System.out.println("Teardown Close Done");
        this.getDriver().quit();
        driver.quit();
        System.out.println("Teardown Quit Done");

    }

    @AfterAll
    public static void tearDownKiller() throws Exception {
        // Kill the ChromeDriverService process
//        Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
//        System.out.println("Teardown Kill Process Done");
    }
}
