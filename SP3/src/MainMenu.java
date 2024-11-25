import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public ArrayList<Movie> movies;
    public  ArrayList<Serie> series;
    public ArrayList<Integer> episodesInSeason;
    public ArrayList<ArrayList<Integer>> SeasonsPlusEpisodes /*ArrayOfArrayListSeason*/;

    public ArrayList<String> readMovieList(String path) {
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


    public ArrayList<Movie> createMovieList(ArrayList<String> movieList) {

        movies = new ArrayList<>();
        for (int i = 0; i < movieList.size(); i++) {
            String[] parameters = movieList.get(i).split(";");
            String title = parameters[0];
            int year = Integer.parseInt(parameters[1].trim());
            List<String> genre = List.of(parameters[2].trim().split(","));
            float imdbRating = 2.2f; //Float.parseFloat(parameters[3].trim());

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
        }
        return null;

    }
   /* public Movie getMovieByGenre(String s){
        for(Movie m : movies){
            if(m.getGenre().equalsIgnoreCase(s)){
                return m;
            }
        } return null;
    } */

    public ArrayList<String> readSerieList(String path) {
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

    public ArrayList<Serie> createSeriesList(ArrayList<String> serieList) {

        series = new ArrayList<>();
        episodesInSeason = new ArrayList<Integer>();
        /*ArrayOfArrayListSeasone*/SeasonsPlusEpisodes = new ArrayList<ArrayList<Integer>>();


        for (int i = 0; i < serieList.size(); i++) {
            String[] parameters = serieList.get(i).split(";");
            String title = parameters[0];
            int year = Integer.parseInt(parameters[1].trim());
            List<String> genre = List.of(parameters[2].trim().split(","));
            String decimalRating = parameters[3];
            String changeToDot = decimalRating.replace(',','.');
            float imdbRating = Float.parseFloat(changeToDot);
            String[] SeasonAndEpisode = parameters[4].trim().split(",");

            for(int l = 0; i < SeasonAndEpisode.length; i++)
            {
               String[] SAndE = SeasonAndEpisode[i].split("-");
               int season = Integer.parseInt(SAndE[0]);    //sæsonNummer
               int episode = Integer.parseInt(SAndE[1]);    //Antal Episoder i sæson i
                for(int m = 0; m < SeasonAndEpisode.length; i++)
                {
                    int n = episode;
                    int o = 0;
                    while(o < n)
                    {
                        episodesInSeason.add(o + 1);
                        if(o+1 == n)
                        {
                            SeasonsPlusEpisodes.add(episodesInSeason);
                        }
                        o++;
                    }
                    // koden kan fylde ArrayList for episoder en tal værdi som angiver episode nummeret.
                    // Vi kan også få den til at putte denne ArrayList ind i ArrayListen med Såsoner.
                    // Men efterfølgende så vil den ikke kunne skifte til en ny ArrayListe og putte
                    //de næste episode nummer derind, så den næste ArrayListe kan tilføjes til den
                    //næste plads i ArrayListen sæsonnumre indeholdende ArrayLister med episoder.
                    //Den vil istedet føje de næste numre til den samme ArrayListe for episoder.
                    //Så vi får en ArrayListe der kunne hedde {1, 2, 3, 4, 1, 2, 3, 1, 2}
                    //Måske kan alle episode numrene ligge i en ArrayListe og hvis man henter/printer
                    // tallet fra ArrayListen med episoder for at angive hvilket afsnit der afspilles,
                    // så kunne man måske bede om tallet fra den næste plads i ArrayListen for
                    //sæsoner(ArrayListen der indeholder ArrayLister med episoder. Altså if() next
                    //episode == 1 get next ArrayOfArrayListSeason.
                }
            }
            //int season1 = Integer.parseInt(parameters[4].trim().split("-");
           // int numberOfEpisodes = Integer.parseInt(parameters[5].trim().split(",");

            Serie s = new Serie(title, year, genre, imdbRating, SeasonsPlusEpisodes );

            ArrayList<ArrayList<Integer>> seasonsAndEpisodes = new ArrayList<ArrayList<Integer>>();

            this.series.add(s);
        }
        return series;
    }


}
