import java.util.ArrayList;
import java.util.Scanner;

class BenjaminWest extends Artists{
    //field
    Scanner usrInput = new Scanner(System.in);
    ArrayList<String> famousArtPieces = new ArrayList<>();
    String name;
    String medium;
    int date;

    //constructors
    BenjaminWest(){}
    BenjaminWest(String newName, String newMedium, int created, ArrayList newArray){
        name = newName;
        medium = newMedium;
        date = created;
        famousArtPieces = newArray;
    }

    //getter
    String getArtName(){
        return famousArtPieces.get(0);
    }
    String getMedium(){
        return medium;
    }
    int getDate(){
        return date;
    }

    //no setter

    //other methods
    void display(){ //display one artwork
        System.out.format("Benjamin West used %s to make %s in %d.\n", medium, name, date);
    }
    void askForFamous(){ //ask if user wants to see other artworks by the same artist
        System.out.println("\nWould you like to find out about Benjamin West's other famous art pieces? (Y/n)");
        String inputVal = usrInput.nextLine();
        if(inputVal.equalsIgnoreCase("Y")){
            System.out.println("These are some of West's other famous art pieces: ");
            for(int i = 0; i < famousArtPieces.size(); i++){ //loops through array list to print out all artworks
                System.out.println(famousArtPieces.get(i));
            }
        }else{
            System.out.println("Famous paintings were not displayed."); //any other answer is counted as a no
        }
    }
    void addPiece(){ //ask if user wants to add another famous piece by the same artist
        System.out.println("\nWould you like to add another famous art piece to the list? (Y/n)"); //ask to add new artwork
        String inputVal = usrInput.nextLine(); //saves answer to new variable
        if(inputVal.equalsIgnoreCase("Y")){
            System.out.println("Type another art piece name:");
            String newName = usrInput.nextLine();
            famousArtPieces.add(newName); //adds in the new name of the piece inputted by user
            System.out.println("Printing out the new list...");
            for(int i = 0; i < famousArtPieces.size(); i++){
                System.out.println(famousArtPieces.get(i)); //loop through new list
            }
        }else{
            System.out.println("You did not add a name."); //any other answer is counted as a no
        }
    }
}
