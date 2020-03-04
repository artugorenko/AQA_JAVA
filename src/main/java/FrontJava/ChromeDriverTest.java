package FrontJava;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChromeDriverTest {

    public static WebDriver driver;
    MainHeaderBBC mainHeaderBBC = new MainHeaderBBC();

    @ParameterizedTest
    @DisplayName("Переход на BBC с вводом в строку поиска и переход на страницу новостей")
    @ValueSource(strings = {"Chrome","Ie","FireFox"})
    void simpleTest(String name) throws InterruptedException, IOException {
        driver = Singletone.getDriver(name);
        mainHeaderBBC.MainBBC(driver);
        mainHeaderBBC.setInputSearch("text");
        assertEquals("text", mainHeaderBBC.getInputSearch(), "Введен текст в строку поиска");
        mainHeaderBBC.menuClick("News");
        assertEquals("https://www.bbc.com/news", mainHeaderBBC.url(), "Переход на страницу новостей");
    }

    @AfterAll
    public static void createAndStopService() {
        Iterator<WebDriver> iter = Singletone.drivers.values().iterator();
        while (iter.hasNext()) {
            iter.next().quit();
        }
        Singletone.drivers.clear();
    }

}
