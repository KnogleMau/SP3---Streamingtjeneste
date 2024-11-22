import java.util.ArrayList;
import java.util.List;

public class StartMenu {
    private String username;
    private String password;
    TextUI ui = new TextUI();
    FileIO fileIO = new FileIO();



    public  void load(){
        boolean input = ui.promptBinary(" welcome to chill if you have an account type Y or else type N to create an account");
        if(input == true){
            login();

        } else {

            createUser();
        }


    }

    public void login(){


    }

    public  void createUser() {
   List<String> users = new ArrayList<>();
 String brugernavn = ui.promptText("indtast brugernavn");
     users.add("brugernavn: " + brugernavn);


 String password = ui.promptText("indtast password");
     users.add("password: " + password);


fileIO.saveData(users,"SP3/Data/Users.csv");

    }


}
