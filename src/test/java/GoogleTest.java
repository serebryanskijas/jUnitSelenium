import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GoogleTest {
    private static WebDriver driver;

    @BeforeAll
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\гк\\IdeaProjects\\jUnitSelenium\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("0");
    }

    @Test
    @Order(1)
    public void test2(){
        System.out.println("1111");
    }

    @Test
    @Order(2)
    public void test1(){
        System.out.println("2222");
    }
}
