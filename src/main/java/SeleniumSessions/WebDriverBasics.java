package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com");
    System.out.println(driver.getTitle());
  }
}
