import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TextUI ui = new TextUI();
        Chilli chilli = new Chilli();
        chilli.setup();
        chilli.end();


        /*
        MainMenu mainMenu = new MainMenu();

        ArrayList<String> input = mainMenu.readMovieList("Data/film.txt");
        mainMenu.createMovieList(input);
        Movie m = mainMenu.getMovieByGenre(ui.promptText("Hvilken Genre vil du søge på?"));
        //Movie m = mainMenu.getMovieByTitle(ui.promptText("What movie do you wish to find?"));
        //System.out.println(m); // Skal kun tilføjes hvis vi søger efter getMovieByTitle


        //ArrayList<String>input2 = mainMenu.readSerieList("Data/serier.txt");
        //mainMenu.createSerieList(input2);
        //Serie s = mainMenu.getSerieByTitle(ui.promptText("What series do you wish to watch="));
        //System.out.println(s);

         */





      }
}