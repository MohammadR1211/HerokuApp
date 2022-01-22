package steps;

import pages.LoginPage;
import pages.ResultPageAfterLogin;

public class PageInitializers {

    public static LoginPage login;
    public static ResultPageAfterLogin result;

    public static  void initializeObjects(){
        login = new LoginPage();
        result = new ResultPageAfterLogin();
    }

}
