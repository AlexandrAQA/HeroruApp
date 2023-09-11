package com.aqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class HoversTest extends BaseTest{

    @Test
    public void hoversTest(){
        driver.findElement(By.linkText("Hovers")).click();
        List<WebElement> avatars = driver.findElements(By.cssSelector(""));
        Actions actions = new Actions(driver);
        actions.moveToElement(avatars.get(0)).build().perform();
        driver.findElement(By.linkText("view profile")).click();

    }
}
