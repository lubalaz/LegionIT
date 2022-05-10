package Pages;

import java.net.URL;
import java.sql.SQLOutput;

public class PagesMain {
    public static void main(String[] args) {

   //     Page loginScreen = new Page("Login", 1, "www.legionIT.com/login");
  //     loginScreen.pageId = 1;
  //     loginScreen.pageName = "login";
  //      loginScreen.URL = "www.legionIT.com/login";


     //   loginScreen.openPage();
    //   loginScreen.closePage();
    //    loginScreen.clickButton("Login");

     //  Page aboutScreen = new Page();
   //     aboutScreen.setPageId(2);
     //   System.out.println(aboutScreen.getPageId());
      //  aboutScreen.setPageName("About");
     //   aboutScreen.setURL("www.legionIT.com/login");

     //  aboutScreen.openPage();
    //  aboutScreen.clickButton("exit");
    //  aboutScreen.closePage();

    //    LoginPage loginPage = new LoginPage();
      //  loginPage.setPageName("LoginPage");
     //   loginPage.setURL("http//...");
     //   loginPage.openPage();

     //   loginPage.setUsername("name");
    //    loginPage.setPassword("12345");
    //    loginPage.populateCredentials();

     //   Page page = new Page();
      //  page.getDeveloperName();
        LoginPage loginPage = new LoginPage();
        loginPage.setPageId(1);
        loginPage.setPageName("login");
        loginPage.getDeveloperName();


        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();

    }
}
