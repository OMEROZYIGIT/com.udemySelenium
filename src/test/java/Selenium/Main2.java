package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // istediğimiz siteye gider.
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();            // açılan sayfayı tam ekran yapar

        // fullName adında bir const. kurularak inceleden açtığımız box ı atama yapılır.
        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.click();                                       // tıklama işlemi
        fullName.sendKeys("Ömer ÖZ");                // elemana text gönderme

        // cssSelector ile alınan veride . ile başlar
        WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        eMail.click();
        eMail.sendKeys("omer@gmail.com");


        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        currentAddress.click();
        currentAddress.sendKeys("Turkiye");

        // sayfayı aşağıya doğru indirmek
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)","");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.click();
        permanentAddress.sendKeys("Istanbul/Turkey");

        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        submitButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
        /*
        WebElement element2 = driver.findElement(By.cssSelector(" "));
        WebElement element3 = driver.findElement(By.xpath(" "));
        WebElement element4 = driver.findElement(By.name(" "));
        WebElement element5 = driver.findElement(By.linkText(" "));
        WebElement element6 = driver.findElement(By.className(" "));
        */
