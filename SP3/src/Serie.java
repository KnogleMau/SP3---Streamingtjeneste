import java.util.List;

public class Serie extends Media{

    private String year;
    String seasonsEpisodes;

    public Serie(String title, String year, List<String> genre, float imdbRating, String seasonsEpisodes ){
        super(title, genre, imdbRating);
        this.year = year;
        this.seasonsEpisodes = seasonsEpisodes;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    @Override
    public List<String> getGenre() {
        return genre;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public String getSeasonsEpisodes() {
        return seasonsEpisodes;
    }

    @Override
    public String toString () {
        return "Title: " + title + ", Year: " + year + ", Genres: " + genre + ", imdbRating: " + imdbRating + " Episoder: " + seasonsEpisodes + "\n";
    }
}
