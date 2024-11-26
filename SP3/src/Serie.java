import java.util.List;

public class Serie {
    String title;
    String year;
    List<String> genre;
    float imdbRating;
    String seasonsEpisodes;

    public Serie(String title, String year, List<String> genre, float imdbRating, String seasonsEpisodes ){
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.imdbRating = imdbRating;
        this.seasonsEpisodes = seasonsEpisodes;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public List<String> getGenre() {
        return genre;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public String getSeasonsEpisodes() {
        return seasonsEpisodes;
    }
    public String toString () {
        return "Title: " + title + ", Year: " + year + ", Genres: " + genre + ", imdbRating: " + imdbRating + " Episoder: " + seasonsEpisodes + "\n";
    }
}
