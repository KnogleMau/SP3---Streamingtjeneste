import java.util.List;

public abstract class Media {

    protected String title;
    protected List<String> genre; //ArrayList
    protected float imdbRating;

    public Media(String title, List<String> genre,float imdbRating){
        this.title = title;
        this.genre = genre;
        this.imdbRating = imdbRating;

    }

    public abstract String getTitle();

    public abstract List<String> getGenre();

    public String toString () {
        return "Title: " + title +  ", Genres: " + genre + ", imdbRating: " + imdbRating + "\n";
    }

}