package testCases;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver;

    @Test
    public void FazerLogin(){
        driver.get("http://www.google.com");
        WebElement e = driver.findElement(By.xpath("//input[@name='q']"));
        e.sendKeys("Teste");
    }
}
