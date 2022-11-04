package aut.funcional.testcases.cruceros;

import aut.funcional.pages.RumboHomePageC;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0015CM extends SeleniumTestBase {

    RumboHomePageC rumbo;

    @Test
    public void test0015(){
        rumbo = new RumboHomePageC(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.botonVerMas();
    }
}
