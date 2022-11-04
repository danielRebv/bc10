package aut.funcional.testcases.cruceros;


import aut.funcional.pages.RumboHomePageC;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;


public class RBO_0018TB extends SeleniumTestBase {

    RumboHomePageC rumbo;

    @Test
    public void test0018() throws IOException {
        rumbo = new RumboHomePageC(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.trenesBtn();
        rumbo.busquedaTrenes();
        rumbo.screenShotP("018_Trenes_ordenados_masrapido");
        Assertions.assertEquals("No hemos encontrado ningún resultado con tus criterios de búsqueda.", rumbo.noEncontradoTrenes());

    }
}

