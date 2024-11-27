import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    TextUI ui = new TextUI();
    FileIO io = new FileIO();
    public ArrayList<Movie> movies;
    public ArrayList<Serie> series;


    public ArrayList<String> readMovieList(){
        io.readData("Data/film.txt");
        return null;
    }
    public ArrayList<String> readSerieList(){
        io.readData("Data/serier.txt");
        return null;
    }
   /* public ArrayList<String> readMovieList(String path) {
        File file = new File(path); //

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
*/

    public ArrayList<Movie> createMovieList(ArrayList<String> movieList) {

        movies = new ArrayList<>();
        for (int i = 0; i < movieList.size(); i++) {
            String[] parameters = movieList.get(i).split(";");
            String title = parameters[0];
            int year = Integer.parseInt(parameters[1].trim());
            List<String> genre = List.of(parameters[2].trim().split(","));
            String decimalRating = parameters[3];
            String changeToDot = decimalRating.replace(',', '.');
            float imdbRating = Float.parseFloat(changeToDot);

            Movie m = new Movie(title, year, genre, imdbRating);

            this.movies.add(m);

        }

        return movies;
    }

    public Movie getMovieByTitle(String s) {
        for(Movie m : movies) {
        if(m.getTitle().equalsIgnoreCase(s)){
            return m;
        }
        } return null;

    }
   public Movie getMovieByGenre(String s){
       String soeg = s;
       for(int i = 0; i < movies.size(); i++)
       {
           if(((Movie) movies.get(i)).getGenre().contains(soeg))
           {
               System.out.println(movies.get(i));

           }
       }
       return null;
   }

    public Serie getSerieByGenre(String s){
        String soeg = s;
        for(int i = 0; i < series.size(); i++)
        {
            if(((Serie)series.get(i)).getGenre().contains(soeg))
            {
                System.out.println(series.get(i));

            }
        }
        return null;
    }

/*
public ArrayList<String> readSerieList(String path){
    File file = new File(path); //

    ArrayList<String> serieList = new ArrayList();

    try {
        Scanner readSeries = new Scanner(file);
        readSeries.nextLine();

        while (readSeries.hasNextLine()) {
            String line = readSeries.nextLine();
            serieList.add(line);
        }
    } catch (FileNotFoundException e) {
        System.out.println("File was not found");
    }

    return serieList;
}

 */
    public ArrayList<Serie> createSerieList(ArrayList<String> serieList) {

        series = new ArrayList<>();
        for (int i = 0; i < serieList.size(); i++) {
            String[] parameters = serieList.get(i).split(";");
            String title = parameters[0];
            String year = parameters[1].trim();
            List<String> genre = List.of(parameters[2].trim().split(","));
            String decimalRating = parameters[3];
            String changeToDot = decimalRating.replace(',', '.');
            float imdbRating = Float.parseFloat(changeToDot);

            /*
            float imdbRating = 2.2f; //Float.parseFloat(parameters[3].trim());

             */
            String seasonsEpisodes = parameters[4].trim();
            Serie s = new Serie(title, year, genre, imdbRating, seasonsEpisodes);

            this.series.add(s);

        }

        return series;
    }

    public Serie getSerieByTitle(String v) {
        for(Serie s : series) {
            if(s.getTitle().equalsIgnoreCase(v)){
                return s;
            }
        } return null;

    }

}
