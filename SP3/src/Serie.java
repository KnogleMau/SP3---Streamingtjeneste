import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Serie {
    String title;
    int year;
    List<String> genre;
    float imdbRating;
    ArrayList<ArrayList<Integer>> SeasonsPlusEpisodes;
  //  HashMap<Integer,Integer> seasonsEpisodes;

    public Serie(String title, int year, List<String> genre, float imdbRating,
                 ArrayList<ArrayList<Integer>> SeasonsPlusEpisodes
            /* HashMap<Integer, Integer> seasonsEpisodes*/ )
    {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.imdbRating = imdbRating;
        this.SeasonsPlusEpisodes = new ArrayList<ArrayList<Integer>>();
       // this.seasonsEpisodes = seasonsEpisodes;
    }


}
