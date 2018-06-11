import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
    public static void main(String[] args){
        //Download geckodriver.exe and allocate it to the right path so this method could call it
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\fogarl1\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");


        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("ffflll@gmail.com");

        WebElement button = driver.findElement(By.xpath("input[@name='btnLogin']"));

        button.click();
    }
}
