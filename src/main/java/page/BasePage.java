package page;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

  public static void waitForElement(WebDriver driver, int timeInSeconds, By locator) {
	  
	  WebDriverWait wait = new  WebDriverWait (driver, timeInSeconds);
	  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      wait.until(ExpectedConditions.elementToBeClickable(locator));
  
  }
  public static int randomNumGenerator() {
	  Random rnd = new  Random();
	  int randomNum = rnd.nextInt(999);
	  return randomNum;
	  
  }
  public static void dropDown(WebElement locator, String visibleText) {
	  Select sel = new  Select(locator);
	  sel.selectByVisibleText(visibleText);
  }
  public void screenShot(WebDriver driver, String fileWithPath) throws Exception{
	  TakesScreenshot scrShot = ((TakesScreenshot ) driver);
	  File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
	  File destFile = new File(fileWithPath);
	  FileUtils.copyFile(srcFile, destFile);
  }


}
