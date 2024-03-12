package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class JavaScripExecutorConcept {
  public static void main(String[] args) throws IOException, InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver(); //launch chrome
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
    JavascriptExecutor js = (JavascriptExecutor)driver;// cast driver to java script executor

    // print the title of the page
    String script = "return document.title;";
    String title = (String) js.executeScript(script);
    System.out.println(title);

    // click the button without finding xpath
    driver.switchTo().frame("iframeResult");
    js.executeScript("myFunction()");// button onclick value is myFunction in inspect
    Thread.sleep(2000);
    driver.switchTo().alert().accept();

    // Highlight the button with some border
    WebElement button = driver.findElement(By.xpath("/html/body/button"));
    js.executeScript(("arguments[0].style.border='3px solid red'"), button);

    // Scroll the page
    driver.navigate().to("https://www.w3schools.com/");
    WebElement certifiedbutton = driver.findElement(By.xpath("//*[@id=\"getdiploma\"]/div/a"));
    js.executeScript("arguments[0].scrolIntoView(true);",certifiedbutton);
  }
}
