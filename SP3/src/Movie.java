import java.util.List;

public class Movie extends Media {

    private int year;    // Warning may be final

    public Movie(String title, int year, List<String> genre,float imdbRating)
    {

        super(title, genre, imdbRating);
        this.year = year;
    }
    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public List<String> getGenre(){
        return genre;
    }

    @Override
    public String toString () {
        return "Title: " + title + ", Year: " + year + ", Genres: " + genre + ", imdbRating: " + imdbRating + "\n";
    }


}// ends class