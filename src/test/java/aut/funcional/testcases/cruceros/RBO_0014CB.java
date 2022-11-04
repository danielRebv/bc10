package aut.funcional.testcases.cruceros;


import aut.funcional.pages.RumboHomePageC;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0014CB extends SeleniumTestBase {

    RumboHomePageC rumbo;

    @Test
    public void test0014() throws IOException {
        rumbo = new RumboHomePageC(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.botonVerMas();
        rumbo.familiaGrandes();
        rumbo.botonBuscar();
        rumbo.screenShotP("Crucero014_error_italiano");
    }

}
