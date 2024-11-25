import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Movies {


        private String title;
        private int year;
        private List<String> genre; //ArrayList
        private float imdbRating;
        private ArrayList<Movies> movies;



    public Movies(String title, int year, List<String> genre,float imdbRating){
            this.title = title;
            this.year = year;
            this.genre = genre;
            this.imdbRating = imdbRating;

        }

    public Movies(){
    }

    public String toString(){
          return "Title: " + title + ", Year: " + year + ", Genres: " + genre + ", imdbRating: " + imdbRating;
    }

        public List<String> readMovieList (String path){
            File file = new File(path); // path = \Data\film.txt
            ArrayList<String> movieList = new ArrayList();

            try {
                Scanner readMovies = new Scanner(file);
                readMovies.nextLine();

                while (readMovies.hasNextLine()) {
                    String line = readMovies.nextLine();
                    movieList.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File was not found");
            }
            return movieList;
        }


        void createMovieList (String[] movieList){

            for (int i = 0; i < movieList.length; i++) {
                String[] parameters = movieList[i].split(";");
                String title = parameters[0];
                int year = Integer.parseInt(parameters[1].trim());
                List<String> genre = List.of(parameters[2].trim().split(","));
                float imdbRating = Float.parseFloat(parameters[3].trim());

                Movies m = new Movies(title, year, genre, imdbRating);

                this.movies.add(m);

                System.out.println(movies);
            }
        }//ends createMovieList
}//ends class Movies
