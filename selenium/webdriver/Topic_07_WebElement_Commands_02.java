package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Topic_07_WebElement_Commands_02 {
    WebDriver driver;
    WebElement element;
    @BeforeClass
    public void beforeClass() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void TC_01_Displayed()
    {
        driver.get("https://automationfc.github.io/basic-form/index.html");
        Assert.assertTrue(driver.findElement(By.cssSelector("#mail")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#under_18")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#edu")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//h5[text()='Name: User5']")).isDisplayed());

        if (driver.findElement(By.cssSelector("#mail")).isDisplayed())
        {
            driver.findElement(By.cssSelector("#mail")).sendKeys("Automation FC");
            System.out.println("Mail is displayed");

        }else
        {
            System.out.println("Mail is not displayed");
        }

        if (driver.findElement(By.cssSelector("#under_18")).isDisplayed())
        {
            driver.findElement(By.cssSelector("#under_18")).click();
            System.out.println("Radio Under_18 is displayed");

        }else
        {
            System.out.println("Radio Under_18 is not displayed");
        }
        if (driver.findElement(By.cssSelector("#edu")).isDisplayed())
        {
            driver.findElement(By.cssSelector("#edu")).click();
            System.out.println("Education is displayed");

        }else
        {
            System.out.println("Education is not displayed");
        }
        if (driver.findElement(By.xpath("//h5[text()='Name: User5']")).isDisplayed())
        {
            driver.findElement(By.xpath("//h5[text()='Name: User5']")).click();
            System.out.println("Text is displayed");

        }else
        {
            System.out.println("Text is not displayed");
        }
    }

    @Test
    public void TC_02_Enabled()
    {
        driver.get("https://automationfc.github.io/basic-form/index.html");
        Assert.assertTrue(driver.findElement(By.cssSelector("#mail")).isEnabled());
        if(driver.findElement(By.cssSelector("#mail")).isEnabled())
        {
            System.out.println("Email is enable");

        }else {
            System.out.println("Email is not enable");
        }




        Assert.assertTrue(driver.findElement(By.cssSelector("#under_18")).isEnabled());
        if(driver.findElement(By.cssSelector("#under_18")).isEnabled())
        {
            System.out.println("Checkbox is enable");

        }else {
            System.out.println("Checkbox is not enable");
        }

        Assert.assertTrue(driver.findElement(By.cssSelector("#edu")).isEnabled());
        if(driver.findElement(By.cssSelector("#edu")).isEnabled())
        {
            System.out.println("Edu text is enable");

        }else {
            System.out.println("Edu text is not enable");
        }

        Assert.assertTrue(driver.findElement(By.cssSelector("select#job1")).isEnabled());
        if(driver.findElement(By.cssSelector("select#job1")).isEnabled())
        {
            System.out.println("slide  is enable");

        }else {
            System.out.println("slide is not enable");
        }

        Assert.assertTrue(driver.findElement(By.cssSelector("input#development")).isEnabled());
        if(driver.findElement(By.cssSelector("input#development")).isEnabled())
        {
            System.out.println("Input field  is enable");

        }else {
            System.out.println("Input field is not enable");
        }

        Assert.assertTrue(driver.findElement(By.cssSelector("input#slider-1")).isEnabled());

        if(driver.findElement(By.cssSelector("input#slider-1")).isEnabled())
        {
            System.out.println("slide field  is enable");

        }else {
            System.out.println("slide field is not enable");
        }

        //



    }
    @Test
    public void TC_02_Disable_02()
    {
        driver.get("https://automationfc.github.io/basic-form/index.html");
        Assert.assertFalse(driver.findElement(By.cssSelector("input#disable_password")).isEnabled());

        if(driver.findElement(By.cssSelector("input#disable_password")).isEnabled())
        {
            System.out.println("Password field  is disable");

        }else {
            System.out.println("Password field is not disable");
        }

        Assert.assertFalse(driver.findElement(By.cssSelector("input#radio-disabled")).isEnabled());

        if(driver.findElement(By.cssSelector("input#radio-disabled")).isEnabled())
        {
            System.out.println("Radio field  is disable");

        }else {
            System.out.println("Radio field is not disable");
        }

        Assert.assertFalse(driver.findElement(By.cssSelector("textarea#bio")).isEnabled());

        if(driver.findElement(By.cssSelector("textarea#bio")).isEnabled())
        {
            System.out.println("textarea biography field  is disable");

        }else {
            System.out.println("textarea biography field is not disable");
        }
//
        Assert.assertFalse(driver.findElement(By.cssSelector("select#job3")).isEnabled());

        if(driver.findElement(By.cssSelector("select#job3")).isEnabled())
        {
            System.out.println("select#job3 field  is disable");

        }else {
            System.out.println("select#job3 field is not disable");
        }

        //
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='check-disbaled']")).isEnabled());

        if(driver.findElement(By.xpath("//label[@for='check-disbaled']")).isEnabled())
        {
            System.out.println("Check box field  is disable");

        }else {
            System.out.println("Checkbox field is not disable");
        }
//
        //
        Assert.assertFalse(driver.findElement(By.cssSelector(" input#slider-2")).isEnabled());

        if(driver.findElement(By.cssSelector(" input#slider-2")).isEnabled())
        {
            System.out.println("Slide  field  is disable");

        }else {
            System.out.println("Slide field is not disable");
        }



    }
    @Test
    public void TC_03_Selected()
    {
        driver.get("https://automationfc.github.io/basic-form/index.html");
       driver.findElement(By.cssSelector("#under_18")).click();
        sleepInSecond(2);
       driver.findElement(By.cssSelector("input#java")).click();
        sleepInSecond(2);
       Assert.assertTrue(driver.findElement(By.cssSelector("#under_18")).isSelected());
        Assert.assertTrue( driver.findElement(By.cssSelector("input#java")).isSelected());

        sleepInSecond(2);
        driver.findElement(By.cssSelector("input#java")).click();
        Assert.assertFalse( driver.findElement(By.cssSelector("input#java")).isSelected());

    } @Test
    public void TC_04_mailChimp()
    {
        driver.get("https://login.mailchimp.com/signup/");
        // Khai bao element
        WebElement txtEmail = driver.findElement(By.cssSelector("input#email"));
        WebElement txtUserName = driver.findElement(By.cssSelector("input#new_username"));
        WebElement txtNewPassword = driver.findElement(By.cssSelector("input#new_password"));
        WebElement chkboxMarketing = driver.findElement(By.cssSelector("input#marketing_newsletter"));

        WebElement incomple_lowercase = driver.findElement(By.xpath("//li[@class='lowercase-char not-completed']"));
        WebElement incomple_uppercase = driver.findElement(By.xpath("//li[@class='uppercase-char not-completed']"));
        WebElement incomple_oneNumber = driver.findElement(By.xpath("//li[@class='number-char not-completed']"));
        WebElement incomple_specialchar = driver.findElement(By.xpath("//li[@class='special-char not-completed']"));
        WebElement incomple_8chars = driver.findElement(By.xpath("//li[@class='8-char not-completed']"));

        // number
        txtEmail.sendKeys("phuongtnguyen@gmail.com");
        txtNewPassword.sendKeys("123");
        Assert.assertTrue(incomple_lowercase.isDisplayed());
        Assert.assertTrue(incomple_uppercase.isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='number-char completed']")).isDisplayed());
        Assert.assertTrue(incomple_specialchar.isDisplayed());
        Assert.assertTrue(incomple_8chars.isDisplayed());


      //   WebElement comple_lowercase = driver.findElement(By.xpath("//li[@class='lowercase-char completed']"));
        // WebElement comple_uppercase = driver.findElement(By.xpath("//li[@class='uppercase-char completed']"));
        // WebElement comple_oneNumber = driver.findElement(By.xpath("//li[@class='number-char completed']"));
       // WebElement comple_specialchar = driver.findElement(By.xpath("//li[@class='special-char completed']"));
        //WebElement comple_8chars = driver.findElement(By.xpath("//li[@class='8-char completed']"));

        // lowercase
        txtEmail.clear();
        txtNewPassword.clear();
        txtEmail.sendKeys("phuongtnguyen@gmail.com");
        txtNewPassword.sendKeys("abc");
        WebElement comple_lowercase = driver.findElement(By.xpath("//li[@class='lowercase-char completed']"));
        Assert.assertTrue(comple_lowercase.isDisplayed());
        Assert.assertTrue(incomple_uppercase.isDisplayed());
        Assert.assertTrue(incomple_oneNumber.isDisplayed());
        Assert.assertTrue(incomple_specialchar.isDisplayed());
        Assert.assertTrue(incomple_8chars.isDisplayed());

        // uppercase
        txtEmail.clear();
        txtNewPassword.clear();
        txtEmail.sendKeys("phuongtnguyen@gmail.com");
        txtNewPassword.sendKeys("ABC");
        WebElement comple_uppercase = driver.findElement(By.xpath("//li[@class='uppercase-char completed']"));
        Assert.assertTrue(incomple_lowercase.isDisplayed());
        Assert.assertTrue(comple_uppercase.isDisplayed());
        Assert.assertTrue(incomple_oneNumber.isDisplayed());
        Assert.assertTrue(incomple_specialchar.isDisplayed());
        Assert.assertTrue(incomple_8chars.isDisplayed());

        //Special characters
        txtEmail.clear();
        txtNewPassword.clear();
        txtEmail.sendKeys("phuongtnguyen@gmail.com");
        txtNewPassword.sendKeys("*!@");
        Assert.assertTrue(incomple_lowercase.isDisplayed());
        Assert.assertTrue(incomple_uppercase.isDisplayed());
        Assert.assertTrue(incomple_oneNumber.isDisplayed());
        WebElement comple_specialchar = driver.findElement(By.xpath("//li[@class='special-char completed']"));
        Assert.assertTrue(comple_specialchar.isDisplayed());
        Assert.assertTrue(incomple_8chars.isDisplayed());

        // 8 Characters minium
        txtEmail.clear();
        txtNewPassword.clear();
        txtEmail.sendKeys("phuongtnguyen@gmail.com");
        txtNewPassword.sendKeys("12345678");
        Assert.assertTrue(incomple_lowercase.isDisplayed());
        Assert.assertTrue(incomple_uppercase.isDisplayed());
        Assert.assertTrue(incomple_oneNumber.isDisplayed());
        Assert.assertTrue(incomple_specialchar.isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li[class='8-char completed']")).isDisplayed());

        // Valid
        txtEmail.clear();
        txtNewPassword.clear();
        txtEmail.sendKeys("phuongtnguyen@gmail.com");
        txtNewPassword.sendKeys("Auto@1234");
        Assert.assertFalse(comple_lowercase.isDisplayed());
        Assert.assertFalse(comple_uppercase.isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//li[@class='number-char completed']")).isDisplayed());
        Assert.assertFalse(comple_specialchar.isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li[class='8-char completed']")).isDisplayed());

    }
    @AfterTest
    public void afterClass() {
        driver.quit();
    }
    public void sleepInSecond(long timeInSecond)
    {
        try {
            Thread.sleep(timeInSecond*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
