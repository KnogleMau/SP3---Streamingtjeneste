import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartMenu {
    private String username;
    private String password;
    TextUI ui = new TextUI();
    FileIO fileIO = new FileIO();



    public  void load() throws FileNotFoundException {
        boolean input = ui.promptBinary(" welcome to chill if you have an account type Y or else type N to create an account");
        if(input == true){
            login();

        } else {

            createUser();
        }


    }
        public boolean isUserExisting(String username) throws FileNotFoundException {
            File file = new File("SP3/Data/Users.csv");

            if (!file.exists()) {
                System.out.println("Filen findes ikke endnu. Ingen brugere er oprettet.");
                return false;
            }


            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    String[] fields = line.split(",");
                    if (fields.length > 0 && fields[0].equals(username)) {
                        System.out.println("Brugernavn eksisterer allerede. Venligst indtast et andet brugernavn.");
                        return true;
                    }
                }
            }

            return false;


    }

    public boolean login(){
            String username = ui.promptText("Indtast brugernavn:");
            String password = ui.promptText("Indtast password:");

            File file = new File("SP3/Data/Users.csv");

            try (Scanner scan = new Scanner(file)) {
                while (scan.hasNextLine()) {
                    String line = scan.nextLine().trim();
                    String[] credentials = line.split(",");
                    if (credentials.length>0 && credentials[0].equals(username) && credentials[1].equals(password)){

                        System.out.println("login vellykket");

                        }

                }
            } catch (FileNotFoundException e) {
                System.out.println("Filen blev ikke fundet: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("En fejl opstod: " + e.getMessage());
            }
        System.out.println("brugernavn eller password er ikke korrekt");
            login();

            return false;

    }

    public  void createUser() throws FileNotFoundException {
        List<String> users = new ArrayList<>();
        String brugernavn = ui.promptText("indtast brugernavn");
        if(isUserExisting(brugernavn)){
            System.out.println("brugeren eksostere allerede");
            createUser();
            return;

        }
        users.add("brugernavn: " + brugernavn);


        String password = ui.promptText("indtast password");
        users.add("password: " + password);


        try(FileWriter writer = new FileWriter("SP3/Data/Users.csv",true)){
            writer.write(brugernavn + "," + password + "\n");
            System.out.println("Bruger oprettet");

        } catch (IOException e){

            System.out.println("file opstod under oprettelse " + e.getMessage());

        }


    }



}



