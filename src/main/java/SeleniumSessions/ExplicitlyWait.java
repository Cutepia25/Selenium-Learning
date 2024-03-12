package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitlyWait {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize(); //maximize window
    driver.manage().deleteAllCookies(); //delete all the cookies
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    driver.get("http://www.facebook.com");
    clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_2']")), 20);//login button
    //wait for 20 secs and then click on it
    // for the specific element not for all the elements , one condition is there, element is clickable, visible,
    // once the element is clickable then click on it if it appears within 2 secs , 18 secs will be ignored,
    //workks for button, links,checkbox(only for click)
    // after 20 secs it will give error

    clickOn(driver, driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")), 10); //create a page link

  }
  public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
////    new WebDriverWait(driver,timeout).ignoring(
//      StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
//    locator.click();
  }
}
