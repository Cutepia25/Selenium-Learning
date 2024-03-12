package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConcept {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.half.ebay.com"); //enter URL

    driver.manage().window().maximize(); //maximize window
    driver.manage().deleteAllCookies(); //delete all the cookies

    //dynamic wait
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);// for page load timeout,wait the page to load
    // for 40 secs max limit and then perform some action, if within 40 sec its not loaded then give error

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// for all the web elements available on page,
    // global wait, page is loaded properly some elements are not available, images are broken, selenium will
    // give exception . Once the page is fully loaded atleast with for 30 secs for the web elements to perform action
    // if the element is visible within 5 sec, it will further not wait for 25 sec and will perform the action further.


  }
}
