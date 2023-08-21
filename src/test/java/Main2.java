import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {
     /* WebElement element2 = driver.findElement(By.cssSelector(" "));
        WebElement element3 = driver.findElement(By.xpath(" "));
        WebElement element4 = driver.findElement(By.name(" "));
        WebElement element5 = driver.findElement(By.linkText(" "));
        WebElement element6 = driver.findElement(By.className(" "));*/

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();                                       // tıklama işlemi
        fullName.sendKeys("Ömer ÖZ");                // elemana text gönderme

        WebElement eMail = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\"]"));
        eMail.click();
        eMail.sendKeys("omer@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAddress.click();
        currentAddress.sendKeys("Turkiye");

        // sayfayı aşağıya doğru indirmek
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,400","");

    }
}
