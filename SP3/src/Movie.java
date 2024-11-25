import java.util.List;

public class Movie {

    private String title;
    private int year;
    private List<String> genre; //ArrayList
    private float imdbRating;




    public Movie(String title, int year, List<String> genre,float imdbRating){
            this.title = title;
            this.year = year;
            this.genre = genre;
            this.imdbRating = imdbRating;

        }
        public String getTitle(){
        return title;
        }

        public List<String> getGenre(){
        return genre;
        }



        public String toString () {
           return "Title: " + title + ", Year: " + year + ", Genres: " + genre + ", imdbRating: " + imdbRating + "\n";
    }


    }// ends class
