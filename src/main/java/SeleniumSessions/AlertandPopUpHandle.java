package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandPopUpHandle {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/priyabhatnagar/Downloads/chromedriver new");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    Thread.sleep(5000);// waiting for 5 seconds
    driver.findElement(By.className("signinbtn")).click();//clicking the button
    Alert alert = driver.switchTo().alert();// switching to the alert window from the main window

    String text =alert.getText();

    if(text.equals("Please enter a valid user name")){
      System.out.println("correct alert messg");
    }
    else{
      System.out.println("in-correct alert messg");
    }
    alert.accept();// click on ok button as for alerts we dont have any xpath to loacte them
//    alert.dismiss();// clicking on the cancel button if cancel button is there.
  }

}

