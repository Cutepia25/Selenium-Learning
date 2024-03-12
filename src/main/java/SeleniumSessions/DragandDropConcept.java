package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {


  public static void main(String[] args) throws InterruptedException {


    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver(); //launch chrome
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("http://jqueryui.com/droppable/");

    driver.switchTo().frame(0);//switch to frame if its present

    Actions action = new Actions(driver);
    action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
      .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))//click,hold,move and release
      .release()
      .build()
      .perform();

  }
}
