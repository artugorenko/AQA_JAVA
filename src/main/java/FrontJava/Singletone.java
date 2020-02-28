package FrontJava;


import io.qameta.allure.*;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;

import java.io.*;
import java.util.*;


public class Singletone {


    private static ChromeDriver instance;

    private Singletone() {
    }
    static Map<String, WebDriver> drivers = new HashMap<>();


    @Step("Переход на BBC с вводом в строку поиска и переход на страницу новостей")
    static WebDriver getDriver(String name){
        if (drivers.containsKey(name)) {
            return drivers.get(name);
        }
        else {
            if (name.equals("Chrome")){
                ChromeDriverService service = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File("C:/chromedriver_win32/chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();
                try {
                    service.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                ChromeDriver driver = new ChromeDriver(service);

                driver.manage().window().maximize();
                drivers.put(name,driver);
                return driver;
            }else {
                if (name.equals("Ie")){
                    InternetExplorerDriverService service = new InternetExplorerDriverService.Builder()
                            .usingDriverExecutable(new File("C:/chromedriver_win32/IEDriverServer.exe"))
                            .usingAnyFreePort()
                            .build();
                    try {

                        service.start();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    InternetExplorerDriver driver = new InternetExplorerDriver(service);
                    driver.manage().window().maximize();
                    drivers.put(name,driver);
                    return driver;
                } else {
                    if (name.equals("FireFox")){
                        GeckoDriverService service = new GeckoDriverService.Builder()
                                .usingDriverExecutable(new File("C:/chromedriver_win32/geckodriver.exe"))
                                .usingAnyFreePort()
                                .build();
                        try {
                            service.start();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        FirefoxDriver driver = new FirefoxDriver(service);
                        driver.manage().window().maximize();
                        drivers.put(name,driver);
                        return driver;
                }
            }

        }
        return null;
    }}


}