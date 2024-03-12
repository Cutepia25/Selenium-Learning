package SeleniumSessions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
  public static void main(String[] args) throws InterruptedException {


    //get() vs navigate().to()// Both are used to launch the url, but navigate used to launch the external url

    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver(); //launch chrome
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    driver.get("http://www.google.com");

    driver.navigate().to("http://www.amazon.com");

    //back and forward buttons simulation:
    driver.navigate().back();

    Thread.sleep(2000);

    driver.navigate().forward();

    Thread.sleep(2000);

    driver.navigate().back();

    driver.navigate().refresh();// refresh the page

  }
}
