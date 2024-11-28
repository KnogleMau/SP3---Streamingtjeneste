import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartMenu {
    private String username;
    private String password;
    FileIO fileIO = new FileIO();
    TextUI ui = new TextUI();
    LogIn l = new LogIn();

    public void load() {
        boolean input9 =  ui.promptBinary("Vil du gerne oprette en bruger? Y/N ", "Y", "N");
        if(input9 == true){
            l.createUser();
            if(input9==true){
               l. loginOption();
            }
        } else{
            boolean input1 = ui.promptBinary("Vil du istedet Log in? Y/N ", "Y", "N");
            if(input1 == true){
                l.loginOption();
            } else {
                close();
            }
        }
    }



    public void close(){
        ui.displayMsg("Tak for du valgte og komme forbi Chilli, Ses en anden gang! :D");
    }


    public void run() {
        MainMenu mainMenu = new MainMenu();
        ArrayList<String> input = mainMenu.readMovieList();
        mainMenu.createMovieList(input);

        ArrayList<String>input2 = mainMenu.readSerieList();
        mainMenu.createSerieList(input2);

        boolean text1 = ui.promptBinary("Hvad vil du se? Movies/Series", "Movies", "Series");
        if(text1 == true){
            boolean text2 = ui.promptBinary("Vil du søge efter genre? Genre/Title","Genre", "Title");
            if(text1 == true && text2 == true){
                Movie m = mainMenu.getMovieByGenre(ui.promptText("Hvilken Genre vil du søge på?"));
            } else {
                Movie m = mainMenu.getMovieByTitle(ui.promptText("What movie do you wish to find?"));
                System.out.println(m); // Skal kun tilføjes hvis vi søger efter getMovieByTitle
            }
        } else{
            boolean text3 = ui.promptBinary("Hvad vil du søge efter? Genre/Title", "Genre", "Title");
            if(text3 == true){
                Serie s = mainMenu.getSerieByGenre(ui.promptText("Hvilken Genre vil du søge på?"));
            } else {
                Serie s = mainMenu.getSerieByTitle(ui.promptText("What series do you wish to watch="));
                System.out.println(s);
            }
        }

    }

}