package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Topic_06_WebBrower_Commands_01 {
    // Cac cau lệnh thao tac với trình duyệt thì đứng sau biến driver
    //driver.
    WebDriver driver;
    // Cac câu lệnh thao tác với element
    // element.
    WebElement element;



    @BeforeClass
    public void beforeClass() {

        driver = new FirefoxDriver();
        driver = new EdgeDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void TC_01()
    {
        // Ham mo ra url bất kì

        driver.get("https://www.facebook.com");

        //Neu nhu co 1 tab/window thi tinh nang tuong tu nhu quit
        // Nhieu hon 1 thi no se dong cai no dang active/open
        driver.close();

        // dong browser ko care bao nhieu tab/windows
        driver.quit();

        // 2 ham elements bi anh huong voi implicitytime out

        // tra ve 1 element neu nhieu hon cung lay 1 nhugn lay cai dau tien
       WebElement email =  driver.findElement(By.id(""));

       List<WebElement> checkboxes = driver.findElements(By.xpath(""));


    }

    @Test
    public void TC_02()
    {
        // swith/ handle fram (iframe)
        // Index/ ID (name)/ Element
        driver.switchTo().frame(0);
        driver.switchTo().frame("123333");
        driver.switchTo().frame(driver.findElement((By.id(""))));

        // swith ve HTML chua frame trc do
        driver.switchTo().defaultContent();

        // Tu frame trog di ra fram ngoai chua no
        driver.switchTo().parentFrame();



        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        driver.findElement(By.id("email"));
        driver.findElements(By.xpath("//input[@type='checkbox']"));

        driver.quit();

    }
    @AfterClass
    public void afterClass()
    {
        driver.quit();
    }
}
