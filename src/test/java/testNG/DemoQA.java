package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoQA {

    @Test
    public void basariliMailTesti(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/");

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)","");

        WebElement elementButton = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
        elementButton.click();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement webTables = driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-3'] span[class='text']"));
        webTables.click();

        WebElement addButton = driver.findElement(By.cssSelector("#addNewRecordButton"));
        addButton.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys("OMER");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.click();
        lastName.sendKeys("OZ");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        eMail.click();
        eMail.sendKeys("omer@gmail.com");

        WebElement ageBottom = driver.findElement(By.cssSelector("#age"));
        ageBottom.click();
        ageBottom.sendKeys("29");

        WebElement salaryBottom = driver.findElement(By.cssSelector("#salary"));
        salaryBottom.click();
        salaryBottom.sendKeys("45000");

        WebElement departmentBottom = driver.findElement(By.xpath("//input[@id='department']"));
        departmentBottom.click();
        departmentBottom.sendKeys("QA AUTOMATION TESTER");

        WebElement sendBottom = driver.findElement(By.xpath("//button[@id='submit']"));
        sendBottom.click();

        driver.close();
        System.out.println("test başarılı olmuştur.");

    }
}
