package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stepdefinitions.ParameterDefinitions;

public class BaseClass extends PageObject {
    public static Logger logger = LoggerFactory.getLogger(ParameterDefinitions.class);
    public WebDriver driver1;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {

//        WebDriverManager webDriverManager;
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
//        options.addArguments(
//                "--start-maximized", "--remote-allow-origins=*","--test-type", "--no-sandbox", "--ignore-certificate-errors",
//                "--incognito", "--disable-infobars", "--disable-gpu", "--disable-default-apps", "--disable-popup-blocking",
//                "--disable-dev-shm-usage", "--disable-extensions", "--disable-web-security", "--disable-translate", "--disable-logging");
//        driver1 = new ChromeDriver(options);
////      driver1 = WebDriverManager.chromedriver().create();
//        logger.info(String.format("Set Up Driver : %s", driver1));
//        System.out.println(String.format("Set Up Driver : %s", driver1));
//        this.setDriver(driver1);
    }

    @After
    public void tearDown() throws Exception {
        this.getDriver().close();
        this.getDriver().quit();
    }
}
