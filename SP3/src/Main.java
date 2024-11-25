import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TextUI ui = new TextUI();
       /* Chilli chilli = new Chilli();
        chilli.setup();
        chilli.end();*/

        ArrayList<String> any = new ArrayList<>();
        MainMenu mainMenu = new MainMenu();
       ArrayList<String> input = mainMenu.readMovieList("SP3/Data/film.txt");
        mainMenu.createMovieList(input);

        Movie m = mainMenu.getMovieByTitle(ui.promptText("What movie do you wish to find?"));
        //Movie n = mainMenu.getMovieByGenre(ui.promptText("Which genre are you looking to find?"));

        System.out.println(m);
    ArrayList<String> input1 = mainMenu.readSerieList("SP3/Data/film.txt");

    }
}