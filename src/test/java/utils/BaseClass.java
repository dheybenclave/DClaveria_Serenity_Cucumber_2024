package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stepdefinitions.ParameterDefinitions;

public class BaseClass {
    public static Logger logger = LoggerFactory.getLogger(ParameterDefinitions.class);

    public WebDriver driver;

    @Before
    public void setUp() throws Exception {
//        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "src/test/resources/webdriver/windows/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdriver/windows/chromedriver.exe");
//        options.addArguments("--start-maximized");
//        options.addArguments("start-maximized");
//        options.addArguments("--incognito");
//        options.addArguments("--start-maximized", "--remote-allow-origins=*", "--test-type", "--no-sandbox", "--ignore-certificate-errors", "--incognito", "--disable-infobars", "--disable-gpu", "--disable-default-apps", "--disable-popup-blocking", "--disable-dev-shm-usage", "--disable-extensions", "--disable-web-security", "--disable-translate", "--disable-logging");
//
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(capabilities);
//        driver = new ChromeDriver(options);
//        System.out.println("manage().window().maximize();");

    }


    @After
    public void tearDown() throws Exception {
//
//        driver.close();
//        System.out.println("Teardown Close Done");
//        driver.quit();
//        System.out.println("Teardown Quit Done");

    }

    @After
    public static void tearDownKiller() throws Exception {
//         Kill the ChromeDriverService process
//        Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
//        System.out.println("Teardown Kill Process Done");
    }
}
