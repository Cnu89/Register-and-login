import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaunchMethods {
    WebDriver driver;
    public void Browsermethods(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public void Openurl(String url){
        driver.get(url);
    }
    public void Clickelement(By locator){
        driver.findElement(locator).click();
    }
    public void Clickenterelements(By locator,String value){
        Waituntillclickable(locator);
        driver.findElement(locator).sendKeys(value);
    }
    public void Javascriptexecutorclickable(By locator){
        WebElement ele=driver.findElement(locator);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",locator);
    }
    public void Waituntillclickable(By locator){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
