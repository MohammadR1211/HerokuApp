package steps;

import Utils.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonFunctions {

    @Before
    public void start(){
        openBrowser();
    }

    @After
    public void end(){
        tearDown();
    }

}
