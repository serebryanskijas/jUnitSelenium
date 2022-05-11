import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GoogleTest {
    private static WebDriver driver;

    @BeforeAll
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Work PC\\IdeaProjects\\jUnitSelenium\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Assertions.assertEquals("Google",driver.getTitle());
    }

    @Test
    @Order(1)
    public void test1(){
        WebElement input = driver.findElement(By.xpath("//input[@title = 'Поиск']"));
        String s = "Text";
        input.sendKeys(s);
    }

    @Test
    @Order(2)
    public void test2(){
        System.out.println("2222");
    }
}
