import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Serie {
    String title;
   // int year;
    String seasonYearInterval;
    List<String> genre;
    float imdbRating;
    ArrayList<ArrayList<Integer>> SeasonsPlusEpisodes;
  //  HashMap<Integer,Integer> seasonsEpisodes;

    public Serie(String title, /*int year*/ String seasonYearInterval, List<String> genre, float imdbRating,
                 ArrayList<ArrayList<Integer>> SeasonsPlusEpisodes
            /* HashMap<Integer, Integer> seasonsEpisodes*/ )
    {
        this.title = title;
     //   this.year = year;
        this.seasonYearInterval = seasonYearInterval;
        this.genre = genre;
        this.imdbRating = imdbRating;
        this.SeasonsPlusEpisodes = new ArrayList<ArrayList<Integer>>();
       // this.seasonsEpisodes = seasonsEpisodes;
    }
    public String getTitle(){
        return title;
    }

    public List<String> getGenre(){
        return genre;
    }


    public String toString () {
        return "Title: " + title + ", Years: " + seasonYearInterval + ", Genres: " + genre + ", imdbRating: " +
                imdbRating + ", Seasons and episodes: " + SeasonsPlusEpisodes + "\n";
    }



}
