package com.investigatingsoftware.app;

import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SectionHeaderTests extends BaseTest
{

    @Test
    public void checkTechLink()
    {
        driver.get(baseUrl);

        WebElement techlink = driver.findElement(By.linkText("Tech"));
        techlink.click();

        WebElement header = driver.findElement(By.cssSelector("#nw-c-nav__wide-section__heading > div"));
        Assert.assertEquals(header.getText(), "Technology");
    }

    @Test
    public void checkScienceLink()
    {
        driver.get(baseUrl);

        WebElement techlink = driver.findElement(By.linkText("Science"));
        techlink.click();

        WebElement header = driver.findElement(By.cssSelector("#nw-c-nav__wide-section__heading > div"));
        Assert.assertEquals(header.getText(), "Science & Environment");
    }

}
