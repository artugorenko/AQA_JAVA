package FrontJava;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Iterator;

import static FrontJava.MainHeaderBBC.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChromeDriverTest {


    public static WebDriver driver;

    //   @BeforeAll
    //   public static void createAndStartService() throws IOException {
    //   service = new ChromeDriverService.Builder()
    //        .usingDriverExecutable(new File("C:/chromedriver_win32/chromedriver.exe"))
    //        .usingAnyFreePort()
    //          .build();
    //service.start();
    //  }

    //@BeforeEach
    // public void setUp() {
    // driver = new ChromeDriver(service);
    // }

    @ParameterizedTest
    @DisplayName("Переход на BBC с вводом в строку поиска и переход на страницу новостей")
    @ValueSource(strings = {"Chrome", "Ie", "FireFox"})
    void simpleTest(String name) throws InterruptedException, IOException {
        driver = Singletone.getDriver(name);
        MainBBC(driver);
        setInputSearch("text");
        assertEquals("text", getInputSearch(), "Введен текст в строку поиска");
        menuClick("News");
        assertEquals("https://www.bbc.com/news", url(), "Переход на страницу новостей");
    }

    @AfterEach
    public void tearDown() {
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
