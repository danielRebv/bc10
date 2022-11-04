package aut.funcional.testcases.cruceros;
import aut.funcional.pages.RumboHomePageC;
import aut.funcional.pages.RumboHomePageH;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0013CB  extends SeleniumTestBase {

    RumboHomePageC rumbo;

    @Test
    public void test0013() throws IOException {
        rumbo = new RumboHomePageC(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.botonVerMas();
        rumbo.scrollDown();
        rumbo.ofertaRoyal();
        rumbo.itinerarioDes();
        rumbo.screenShotP("puerto_oranjestad");
        Assertions.assertEquals("Miami, Estados Unidos - Kralendijk, Bonaire - Curacao (Antillas) - Oranjestad - Miami, Estados Unidos",rumbo.textoItineario());
    }
}
