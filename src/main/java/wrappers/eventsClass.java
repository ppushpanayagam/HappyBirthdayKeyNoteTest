package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class eventsClass {
    public static WebDriver driver;
    public static Properties prop;

    public static void invokeApp() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/lib/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://noobnotes.net/happy-birthday-traditional/");
            Thread.sleep(5000);
    }

    public void clickByXpath(String xpathValue) throws InterruptedException {
        driver.findElement(By.xpath(xpathValue)).click();
        Thread.sleep(500);
    }

    public static void loadObjects() throws IOException {
        FileInputStream fis = new FileInputStream(new File("./src/main/resources/object.properties"));
        prop = new Properties();
        prop.load(fis);
    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
