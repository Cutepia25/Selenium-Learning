package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/priyabhatnagar/Downloads/chromedriver copy");
    WebDriver driver = new ChromeDriver();
    driver.get("https://html.com/input-type-file/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id='fileupload']"))
      .sendKeys("/Users/priyabhatnagar/Downloads/testdata_GCS_CSV_TEST.csv");
  }
}
