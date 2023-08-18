package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_02_Selenium_Locator {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");
    @BeforeClass
    public void beforeClass() {
        if (osName.contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
        } else {
            System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
        }

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
    }

    @Test
    public void TC_01_ID()
    {
        // 8 locators:
        // Selenium locators =  attribute of HTML
        //1. Id/ class/ name = 3 attribute of HTML
        //2. Linktext/ partial link: HTML link (tag a)
        //3. Tagname: HTML tagname
        //4. CSS/Xpath
        // Selenium 4.x
        // Class - Relative locator
        // above/ below/ near/ leftof/ rightof

        // UI testing
        // FUI: functional UI

        // GUI: Graphic UI - Visualize Testing
        // Front
/*
<HTML Element> = <tagname attribute_name_1='attribute_value 1, attribute_name-2=attribute_value_2, attribute_name_3=attribute_value-3>
 */
    driver.findElement(By.id("customerCurrency")).isSelected();

    }
// TestNG: order testcase follow Alphabet (0-9 A-Z)
    @Test
    public void TC_02_Class()
    {

        WebElement cls= driver.findElement(By.className("ico-register"));
        System.out.println(cls);

    }
    @Test
    public void TC_03_Name()
    {
        driver.findElement(By.name("Gender"));
    }
    @Test
    public void TC_04_TagName()
    {
       String a= driver.findElement(By.tagName("input")).getTagName();
      System.out.println(a);

    }
    @Test
    public void TC_05_LinkText()
    {
        driver.findElement(By.linkText("Sitemap"));

    }
    @Test
    public void TC_06_Partial_LinkText()
    {
        driver.findElement(By.partialLinkText("Recently"));

    }
    @Test
    public void TC_07_CSS()
    {
        driver.findElement(By.cssSelector("input[id='Password']"));

    }
    @Test
    public void TC_08_Xpath()
    {
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Phuong");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Nguyen");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("phuongnguyen@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test1234");
       driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Test1234");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
    }

    @AfterTest
    public void afterClass() {
       driver.quit();
    }
}
