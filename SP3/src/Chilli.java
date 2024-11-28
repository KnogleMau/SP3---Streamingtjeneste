import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Chilli {

    public void setup() {
        StartMenu startMenu = new StartMenu();
        startMenu.load();
        startMenu.run();
        startMenu.close();

    }

    public void end(){
    }


}
