package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindowPopUp {
  public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver(); //launch chrome
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.get("https://www.salesforce.com/in/");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"1682326631687_yaw\"]/div[1]/article/div[2]/div/pbc-button[1]/a"
      )).click();
    Set<String> windowhandles = driver.getWindowHandles();
    System.out.println(windowhandles);
      Iterator<String> iterator = windowhandles.iterator();// returns iterotor of strings
    String parentwindow= iterator.next();
    System.out.println(parentwindow);
    String childwindow= iterator.next();
    System.out.println(childwindow);
    driver.switchTo().window(childwindow);

    driver.findElement(By.name("UserFirstName")).sendKeys("Priya");
    driver.findElement(By.name("UserLastName")).sendKeys("Bhatnagar");
    driver.switchTo().window(parentwindow);
  }
}
