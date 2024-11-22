public class StartMenu {
    private String username;
    private String password;
    FileIO fileIO = new FileIO();
    TextUI textUI = new TextUI();

    public void load(){
     boolean input =  textUI.promptBinary("Vil du gerne oprette en bruger " + "Y/N!");
        if(input == true){
            createUser();
        } else{
            boolean input1 = textUI.promptBinary("Vil du istedet Log in? " + "Y/N!");
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

    }

}