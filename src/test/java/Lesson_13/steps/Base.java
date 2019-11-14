package Lesson_13.steps;

import Lesson_13.utils.Config;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.asserts.SoftAssert;
//import org.testng.asserts.SoftAssert;
import pages.Login_Page;
import pages.Meeting_Creation_Select_Record_Type_Modal;
import pages.Meetings_Page;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;

public class Base {

    private WebDriver driver;

    protected Login_Page login_page;
    protected pages.Home_Page home_page;
    protected Meetings_Page meetings_page;
    protected Meeting_Creation_Select_Record_Type_Modal meeting_creation_select_record_type_modal;
//    protected SoftAssert asserts = new SoftAssert();
    public static final Properties config = Config.loadProperties("src/test/resources/test.properties");

    protected Base() {
    }

//    @Before
    public void setUp() throws Exception {

//        ChromeDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.operadriver().setup();
//        WebDriverManager.edgedriver().setup();
//        WebDriverManager.iedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);
        WebDriverRunner.supportsJavascript();
        WebDriverRunner.supportsModalDialogs();

        login_page = new Login_Page(driver);
        home_page = new pages.Home_Page(driver);
        meetings_page = new Meetings_Page(driver);
        meeting_creation_select_record_type_modal = new Meeting_Creation_Select_Record_Type_Modal(driver);
    }

//    @After
    public void tearDown() throws Exception {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        driver.quit();
    }
}
