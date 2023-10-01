package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Topic_07_WebElement_Commands {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");
    @BeforeClass
    public void beforeClass() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void TC_01_Elements()
    {
       /* // HTML Element: Textbox/TextArea...
        // TIm chua tuong tac len
        driver.findElement(By.id(""));

        // Tim va tuong tac len
        driver.findElement(By.id("")).click();

        driver.findElement(By.id("")).sendKeys("");

        // Tim va luu vao bien WebElement nhung chua tuong tac
        // Khi dung bien it nhat tu 2 lan tro len
         WebElement fullNameTextbox = driver.findElement(By.id(""));
         fullNameTextbox.click();
         fullNameTextbox.sendKeys("phuong");
         fullNameTextbox.getAttribute("value");
         getText

getCssValue

getAttribute

isDisplayed

isSelected

isEnabled

click

sendKeys

clear
         */

        // Dung de xoa du lieu trong 1 field cho phep nhap (editallb)
        //Txtbox/ textarea/drodpw (editabl
        // thuong su dung truoc hanm sendkeys

        driver.findElement(By.id("")).click();

        // Dung de nhap lieu vao cac field ben tren

        driver.findElement(By.id("")).sendKeys("");


        // dung de click len element

        driver.findElement(By.id("")).click();

        // Tim tu node cha vao node con
        driver.findElement(By.id("")).findElement(By.id(""));

       List<WebElement> textboxes = driver.findElements(By.id(""));

       //Dropdown (defualt/custom)
        Select select = new Select(driver.findElement(By.id("")));

        // Dung de verify 1 checkbox/ default da dc chon hay chua
        Assert.assertTrue((driver.findElement(By.id(""))).isSelected());


        // dung de verfy 1 element bat ki co hien thi hay ko
        Assert.assertTrue((driver.findElement(By.id(""))).isDisplayed());


// Vi tri cua 1 element so vs do phan giai man hinh
        Point nameTextboxLocation = driver.findElement(By.id("")).getLocation();
        nameTextboxLocation.getX();
        nameTextboxLocation.getY();

        //Location + size
        Rectangle nameTextboxRec = driver.findElement(By.id("")).getRect();


        //Location + Size
        Point namePoint = nameTextboxRec.getPoint();

        // Size
        Dimension nameSize = nameTextboxRec.getDimension();
        nameSize.getHeight();
        nameSize.getWidth();


        //Shadow Element - JavaScriptExecutor
        driver.findElement(By.id("")).getShadowRoot();


        //Tu id/class/name/css/xpath co the truy ra nguoc lai tagname HTML
        driver.findElement(By.id("")).getTagName();
// Elment A --> dau ra cua no la tagname cua element A


        // Dau vao cau Element B se nhan tagname cua element A la tham so


        driver.findElement(By.cssSelector("address.copyright")).getText();

        // chup hinh bi fail va luu duoi dang nal
        // Byte,
        // file ( hinh co kich thuoc o trong o cung, .png, .jpg),
        // base64 ( hinh dang text )
        driver.findElement(By.cssSelector("address.copyright")).getScreenshotAs(OutputType.BASE64);
        driver.findElement(By.cssSelector("address.copyright")).getScreenshotAs(OutputType.FILE);
        driver.findElement(By.cssSelector("address.copyright")).getScreenshotAs(OutputType.BYTES);

        // Form ( element nao la the form hoac nam trong the form
        // Hanh vi giong phim Enter tren ban phim
        // Login/ Register/ Search...
        driver.findElement(By.id("")).submit();


    }

    @Test
    public void TC_02()
    {

    }
    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}
