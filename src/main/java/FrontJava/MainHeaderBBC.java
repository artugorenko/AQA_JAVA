package FrontJava;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import java.util.logging.*;


public class MainHeaderBBC {
    public WebDriver driver;
    private By news = By.linkText("News");
    private By search = By.id("orb-search-q");
    private Logger logger = Logger.getLogger("FrontJava.nose");

    public String url() {
        return driver.getCurrentUrl();
    }

    public WebDriver MainBBC(WebDriver driver1) {
        driver1.get("https://www.bbc.com/");
        driver = driver1;
        return driver;
    }

    public void setInputSearch(String text) {
        logger.log(Level.INFO, "Вводим в поиск слово текст");
        WebElement input = driver.findElement(search);
        if (input.isDisplayed() && input.isEnabled())
            input.sendKeys(text);
    }

    @Step("ads")
    public String getInputSearch() {
        WebElement input = driver.findElement(search);
        return input.getAttribute("value");
    }

    public void menuClick(String itemMenu) {
        logger.log(Level.INFO, "Нажимаем на пункт меню - новости");
        switch (itemMenu) {
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
