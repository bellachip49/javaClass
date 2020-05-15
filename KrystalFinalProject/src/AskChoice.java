import java.util.Scanner;
public class AskChoice {
    //field
    private String place;
    private String status;
    private Scanner choice = new Scanner(System.in);

    //constructor
    AskChoice(){}

    //getter
    String getPlace(){
        return place;
    }
    String getStatus(){return status;}

    //other methods
    String AskLoc(){
        System.out.println("Locations: \n\tA. Bluegum Town \n\tB. Sea Fairy Forest \n\tC. Blackfell Caverns");
        System.out.println("Please enter the letter corresponding to the location of your choice (A, B, C):");
        return choice.nextLine();
    }
    boolean DetermineLoc(String loc){
        if(loc.equalsIgnoreCase("a")){
            System.out.println("You selected Bluegum Town.");
            place = "Bluegum Town";
            return false;
        }
        else if(loc.equalsIgnoreCase("b")){
            System.out.println("You selected Sea Fairy Forest.");
            place = "Sea Fairy Forest";
            return false;
        }
        else if(loc.equalsIgnoreCase("c")){
            System.out.println("You selected Blackfell Caverns.");
            place = "Blackfell Caverns";
            return false;
        }else{
            System.out.println("Invalid Input. Please try again.");
            return true;
        }
    }
    String askActivity(){
        System.out.println("Here are your options: \n\tA. Search for Pokémon \n\tB. Show collected Pokémon\n\tC. Exit the program");
        System.out.println("Please select a letter corresponding to your choice.");
        return choice.nextLine();
    }
    String findActivity(String newActivity){
        status = "";
        if(newActivity.equalsIgnoreCase("a")){
            System.out.println("You searched for a Pokémon.");
            status = "search";
            return status;
        }
        else if(newActivity.equalsIgnoreCase("b")){
            System.out.println("You opened your Pokémon box.");
            status = "show";
            return status;
        }
        else if(newActivity.equalsIgnoreCase("c")){
            System.out.println("You ended the program.");
            status = "exit";
            return status;
        }
        else{
            System.out.println("Invalid Input. Please try again.");
            return status;
        }
    }

}
