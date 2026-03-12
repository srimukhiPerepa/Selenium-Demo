import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Sri Mukhi\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

	  WebDriver driver = new FirefoxDriver();
	  //WebDriver driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	  driver.getTitle();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  WebElement textBox = driver.findElement(By.name("my-text"));
      WebElement submitButton = driver.findElement(By.cssSelector("button"));
      textBox.sendKeys("Selenium");
      submitButton.click();
      WebElement message = driver.findElement(By.id("message"));
      message.getText();
      Assert.assertEquals("Received!", message.getText());
      driver.quit();
  }
}
