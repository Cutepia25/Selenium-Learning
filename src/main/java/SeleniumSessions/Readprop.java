package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readprop {
  public static WebDriver driver;

  public static void main(String[] args) throws IOException {

    Properties prop = new Properties();

    FileInputStream ip = new FileInputStream("/Users/priyabhatnagar/Desktop/database-plugins/SeleniumTest" +
                                               "/src/main/resources/config.properties");
    prop.load(ip);

    System.out.println(prop.getProperty("name"));

    System.out.println(prop.getProperty("age"));

    String url = prop.getProperty("URL");

    System.out.println(url);

    String browserName = prop.getProperty("browser");

    System.out.println(browserName);

    if (browserName.equals("chrome")) {
      System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
      driver = new ChromeDriver(); // launch chrome

      driver.get(url);

      driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));

      driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));

      driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));
    }

  }
}
