package FrontJava;

import org.openqa.selenium.*;

public class MainHeaderBBC {
    public static WebDriver driver;
    private static By news = By.linkText("News");
    private static By search = By.id("orb-search-q");


public static String url(){
    return driver.getCurrentUrl();
}
    public static WebDriver MainBBC(WebDriver driver1) {

         driver1.get("https://www.bbc.com/");
        driver=driver1;
        return driver;


    }

public static void setInputSearch(String text){
WebElement input = driver.findElement(search);
    if(input.isDisplayed() && input.isEnabled())
        input.sendKeys(text);
}
    public static String getInputSearch(){
        WebElement input = driver.findElement(search);
     return input.getAttribute("value");
    }
public static void menuClick(String itemMenu){
        switch(itemMenu){
            case ("News"):
                WebElement menuNews = driver.findElement(news);
                menuNews.click();
                break;

            default:
                System.out.println("Not item menu!!");
                break;
        }

}
}
