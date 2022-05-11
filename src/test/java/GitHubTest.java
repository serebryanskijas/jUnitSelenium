import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GitHubTest {
    private static WebDriver driver;

    @BeforeAll
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Work PC\\IdeaProjects\\jUnitSelenium\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.github.com");
        driver.manage().window().maximize();
        Assertions.assertTrue(driver.getTitle().contains("GitHub"));
    }

    @Test
    @Order(1)
    public void test1(){
        driver.get("https://www.github.com/login");
        Assertions.assertTrue(driver.getTitle().contains("Sign in"));
    }

    @Test
    @Order(2)
    public void test2(){
        WebElement input = driver.findElement(By.id("login_field"));
        input.sendKeys("serebryanskijas@gmail.com");
        input = driver.findElement(By.id("password"));
        input.sendKeys("IrBjHqJ5");
        input = driver.findElement(By.xpath("//input[@name='commit']"));
        input.click();
    }

    @Test
    @Order(3)
    public void test3() {
        driver.get("https://www.github.com/logout");
        Assertions.assertTrue(driver.getTitle().contains("Sign out"));
        WebElement input = driver.findElement(By.xpath("//input[@value='Sign out']"));
        input.click();
        Assertions.assertTrue(driver.getTitle().contains("GitHub"));
    }
}
