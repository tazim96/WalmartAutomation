
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestYoutube extends Base {

    @Test
    public void test1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "YouTube");
    }

    @Test
    public void test2 () {
        driver.findElement(By.id("search")).sendKeys("nba finals", Keys.ENTER);
    }

    @Test
    public void test3 () {
        driver.findElement(By.id("search")).sendKeys("nike sneaker review", Keys.ENTER);
        WebElement linkByText = driver.findElement(By.linkText("UNBOXING: The BEST Selling Nike SNEAKER of the YEAR"));
        linkByText.click();
    }

    @Test
    public void test4 () {
        driver.findElement(By.linkText("Trending")).click();
    }


    @Test
    public void test5 () {
        driver.findElement(By.id("button")).click();
        driver.findElement(By.linkText("Dark theme: Off")).click();
        driver.findElement(By.id("toggleButton")).click();
    }

    @Test
    public void test6 () {
        driver.findElement(By.xpath("//button[@aria-label='Settings']")).click();
        driver.findElement(By.id("label")).click();
        driver.findElement(By.xpath("//caption-container[@aria-pressed='true']")).click();
    }






}