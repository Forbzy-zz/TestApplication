package com.example.james.testapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class WaitTests {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/build/outputs/apk/release/");
        File app = new File(appDir, "app-release-unsigned.apk");

        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "Nexus 5x API 21");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability(CapabilityType.VERSION, "5.0");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("app", app.getAbsolutePath());

        // Set android appPackage desired capability. It is
        // com.android.calculator2 for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appPackage", "com.example.james.testapplication");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appActivity", "com.example.james.testapplication.MainActivity");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void testFirstCalculator() {

        //Log.i("TAG", "" + driver.findElements(By.xpath("//android.widget.Button")).get(1));

        // Click on DELETE/CLR button to clear result text box before running test.
        driver.findElements(By.xpath("//android.widget.Button")).get(0).click();


        // Click on Shop by Deparment link
        driver.findElement(By.id("com.example.james.testapplication:id/checkBox")).click();
        // Click on Main menu
        driver.findElement(By.className("android.widget.ImageView")).click();
        // Click on Home link under Main menu
        driver.findElement(By.id("com.example.james.testapplication:id/toggleButton")).click();
        // Click on Sign In link on the Home Screen
        driver.findElement(By.id("com.example.james.testapplication:id/radioButton")).click();

        // Entering UserName using Parent node strategy
        WebElement parentElement = driver.findElement(By.name("appParentElement"));
        List<WebElement> childElements = parentElement.findElements(By.className("android.view.TextView"));
        WebElement mainElement = childElements.get(4);
        mainElement.findElement(By.className("android.widget.EditText")).sendKeys("Your_UserName");
        // Entering Password using Xpath & Sibling strategy
        driver.findElement(By.xpath("//android.view.View[@content-desc='Password']/following-sibling::android.view.TextView/android.widget.EditText")).sendKeys("Your_Password");
        // Click on Sign In button
        driver.findElement(By.name("SWITCH")).click();

       /* TouchAction Action = new TouchAction((MobileDriver) driver);
        Action.tap(addbtn).perform();

        TouchAction action0 = new TouchAction((MobileDriver) driver);
        TouchAction action1 = new TouchAction((MobileDriver) driver);
        action0.tap(el);
        action1 = TouchAction().tap(el);
        MultiAction().add(action0).add(action1).perform();
*/
        // Click on number 2 button.
        //driver.findElements(By.xpath("//android.widget.Button")).get(0).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void End() {
        driver.quit();
    }


 /*   @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "exe/chromedriver.exe");
        driver = new ChromeDriver();
        // URL for ASK
        String baseUrl = "https://youtube.com/ ";
        driver.get(baseUrl);
    }


    @Test
    public void validuserpass() {
        // ------------------------------------------------
        // Able to login with valid username and password
        // --------------------------------------------
        // launch browser and direct it to the Base URL
        //  Enter a valid name for username
        // Enter Text on Register Screen
        WebElement UName;
        // User and passwords
        String goodUser = "wayne";
        String goodPassword = "askTest17";
        String badUser = "foo";
        String badPassword = "badpass";
        UName = driver.findElement(By.name("login_user"));
        UName.sendKeys(goodUser);
    }
    */
}
