public class StartMenu {
    private String username;
    private String password;
    FileIO fileIO = new FileIO();
    TextUI ui = new TextUI();

    public void load(){
     boolean input =  ui.promptBinary("Vil du gerne oprette en bruger " + "Y/N!");
        if(input == true){
            createUser();
        } else{
            boolean input1 = ui.promptBinary("Vil du istedet Log in? " + "Y/N!");
            if(input1 == true){
                loginOption();
            } else {
                close();
            }
        }
    }
    public void loginOption(){

    }

    public void createUser(){

    }

    public void close(){
        ui.displayMsg("Tak for du valgte og komme forbi Chilli, Ses en anden gang! :D");
    }

}