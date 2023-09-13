package com.aqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HoversTest extends BaseTest{

    @Test
    public void hoversTest(){
        driver.findElement(By.linkText("Hovers")).click();
        List<WebElement> avatars = driver.findElements(By.cssSelector("img[alt=\"User Avatar\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(avatars.get(0)).build().perform();
        String elementH5 = driver.findElement(By.xpath(".//h5")).getText();
        Assert.assertEquals(elementH5, "name: user1", "Assert message");
        driver.findElement(By.linkText("View profile")).click();
        driver.navigate().back();
    }
}
