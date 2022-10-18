package bc10.drebolledo.webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElements {

    WebDriver driver;
    //localizadores


    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @Test
    void busquedaGoogle(){
        By barraBusquedaLocalizador = By.name("q");
        By botonBuscarGoogleLoc = By.name("btnK");
        //capturamos el elemento con WebElements
        driver.get("https://www.google.com");
        WebElement barraBusqueda = driver.findElement(barraBusquedaLocalizador);
        barraBusqueda.sendKeys("Tsoft");
        WebElement botonGoogle = driver.findElement(botonBuscarGoogleLoc);
        botonGoogle.click();
        Assertions.assertEquals("Tsoft - Buscar con Google", driver.getTitle());



    }

    @Test
    void busquedaSpDigital(){
        driver.get("https://www.spdigital.cl");
        By searchboxLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/span[1]/form/div/input");
        By lupaLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/span[1]/form/div/button");
        By homeLocalizador = By.xpath("/html/body/div[1]/div[1]/div[4]/section[1]/div/section/div/span[1]/a");
        By HomeLocalizador2 = By.xpath("/html/body/div[1]/div[1]/div[4]/section[1]/div/div[1]/span[1]/a");
        By HomeLocalizador3 = By.xpath("/html/body/div[1]/div[1]/div[4]/section[1]/div/div[1]/div/span[1]/a");
        By quienesSomosLocalizador = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[4]/section[16]/div/div[1]/span/span[2]/ul/li[1]/a/span");
        By imagenLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[4]/section[15]/div/div/span[3]/span[1]/a/img");
        By Gaming_y_StreamingLocalizador = By.xpath("/html/body/div[1]/div[1]/div/div[3]/div/a[1]/div/span");
        By ArmnadosLocalizador = By.xpath("//span[normalize-space()='Armados SP Labs']");

        WebElement lupa = driver.findElement(lupaLocalizador);
        WebElement searchbox = driver.findElement(searchboxLocalizador);
        searchbox.sendKeys("Teclados");
        lupa.click();

        WebElement home = driver.findElement(homeLocalizador);

        home.click();

        WebElement quienesSomos = driver.findElement(quienesSomosLocalizador);

        quienesSomos.click();
        WebElement home2 = driver.findElement(HomeLocalizador2);
        home2.click();

        WebElement imagenPagos = driver.findElement(imagenLocalizador);

        imagenPagos.click();

        WebElement home3 = driver.findElement(HomeLocalizador3);

        home3.click();

        WebElement gaming = driver.findElement(Gaming_y_StreamingLocalizador);

        Actions act = new Actions(driver);

        act.moveToElement(gaming).perform();

        WebElement armados = driver.findElement(ArmnadosLocalizador);

        armados.click();




       // action.moveToElement(categoria).perform();
       // action.moveToElement(labs).click().perform();
        //labs.click();
        //action.click().build().perform();


        //action.moveToElement(labs).click().perform();




        /*WebElement armado = driver.findElement(sPlabs);
        armado.click();
        driver.navigate().back();
*/


    }

    @Test
    void busquedaMercadoLibre(){
        By enviarAr = By.xpath("/html/body/header/div/div[2]/ul/li[1]/a");
        By imputPostal = By.xpath("/html/body/main/div/div[2]/form/div/div/div/div[1]/label/div/input");

        driver.get("https://www.mercadolibre.com.ar/");
        WebElement envio = driver.findElement(enviarAr);
        envio.click();


    }




}