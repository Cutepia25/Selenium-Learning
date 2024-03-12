package SeleniumSessions;

import com.sun.deploy.cache.Cache;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.io.IO;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenshotConcept {
  public static void main(String[] args) throws IOException {
    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver(); //launch chrome
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    driver.get("http://www.google.com");
    // Take screenshot and store as a file format
    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    // now copy the screenshot to desired location using copyFile //method
//    String FileUtils=;
//    FileUtils.copyFile(src, new File("/Users/priyabhatnagar/Documents/SeleniumSessions/google.png"));
  }
}
