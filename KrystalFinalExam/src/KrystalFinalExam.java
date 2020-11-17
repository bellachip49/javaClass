import java.util.ArrayList;
import java.util.Scanner;

public class KrystalFinalExam {
    public static void main(String [] args){
        //I chose the "Art" topic
        //make objects and ArrayList
        Scanner usrInput = new Scanner(System.in);
        Artists artists1 = new Artists();
        Artists artists2 = new Artists("Mona Lisa");
        Artists artists3 = new Artists("Starry Night", 1889);
        Artists artists4 = new Artists("The Great Wave off Kanagawa", 1831, "printmaking");
        BenjaminWest bwArt1 = new BenjaminWest();
        Michelangelo michelArt1 = new Michelangelo();
        ArrayList<String> bwFamous = new ArrayList<>(); //make new arraylist for list of West's paintings
        bwFamous.add("Death of General Wolfe");
        bwFamous.add("Cupid and Psyche");
        bwFamous.add("Death on the Pale Horse");
        bwFamous.add("Saul and the Witch of Endor");
        ArrayList<String> michelFamous = new ArrayList<>(); //make new arraylist for list of Michelangelo's paintings
        michelFamous.add("The Last Judgement");
        michelFamous.add("Doni Tondo");
        michelFamous.add("Madonna of Bruges");
        michelFamous.add("Battle of the Centaurs");
        michelFamous.add("The Deposition");
        BenjaminWest bwArt2 = new BenjaminWest("The Death of Nelson", "oil paint", 1806, bwFamous);
        Michelangelo michelArt2 = new Michelangelo("David", "sculpture", 1504, michelFamous);

        //use objects and ArrayList
        System.out.println("Which artist would you like to learn about? \n\t1. Benjamin West\n\t2. Michelangelo");
        System.out.println("Please select an option by typing the full name of an artist or typing the corresponding letter.");
        String answerGiven = usrInput.nextLine();
        if(answerGiven.equalsIgnoreCase("Benjamin West") || answerGiven.equals("1")){
            bwArt2.display(); //display one artwork
            bwArt2.askForFamous(); //ask if user wants to see other artworks by the same artist
            bwArt2.addPiece();
        }
        else if(answerGiven.equalsIgnoreCase("Michelangelo") || answerGiven.equals("2")){
            michelArt2.display();
            michelArt2.askForFamous();
            michelArt2.addPiece();
        }
        else{
            artists4.display();
        }
    }
}
