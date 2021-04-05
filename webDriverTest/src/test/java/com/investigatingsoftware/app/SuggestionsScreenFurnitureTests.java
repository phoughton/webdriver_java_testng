package com.investigatingsoftware.app;

import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SuggestionsScreenFurnitureTests extends BaseTest
{
    @Test
    public void checkSearchSuggestionsHeader()
    {
        driver.get(baseUrl);
        WebElement searchBox = driver.findElement(By.id("orb-search-q"));
        searchBox.sendKeys("Tomorrows world");

        WebElement suggestion = driver.findElement(By.cssSelector("div.se-search-suggestions.se-results > h3"));
        Assert.assertEquals(suggestion.getText(), "Suggestions");
    }
}
