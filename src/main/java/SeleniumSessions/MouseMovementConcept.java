package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseMovementConcept {
  public static void main(String[] args) throws InterruptedException {


    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver(); //launch chrome
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();

    driver.get("http://spicejet.com/");
    Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.linkText("Add-ons"))).build().perform();//whenever using action classes
    // use build and perform method to perform the action.
    Thread.sleep(3000);// it will wait for entire 3 sec , and then search the element, if the element is found
    // within 2 secs it will still wait for entire 3 secs .

    driver.findElement(By.linkText("SpiceMax")).click();

  }
}
