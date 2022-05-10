package Pages;

public class LoginPage extends Page implements PageInterface{


    private String username;
    private String password;

    public void populateCredentials() {

        System.out.println(String.format("credentials are populated: %s, %s",username, password));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }
    public void getDeveloperName(){
      System.out.println("John Smith");

   }
}

