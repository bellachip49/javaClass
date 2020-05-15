import java.util.ArrayList;
import java.util.Random;

public class PokeSearch {
    //fields
    private String place;
    private String [] BluegumList = {"Cherubi", "Scyther", "Cubone", "Shinx", "Sentret", "Starly", "Abra", "Meditite", "Poochyena", "Snubbull", "Wurmple", "Jigglypuff"};
    private String [] SeaFairyList = {"Wingull", "Yanma", "Jigglypuff", "Shellos", "Munchlax", "Carvanha", "Magikarp", "Poliwag", "Ditto"};
    private String [] BlackfellList = {"Zubat", "Misdreavus", "Numel", "Slugma", "Torkoal", "Duskull", "Shuppet", "Nincada", "Gastly"};
    private Random randNum = new Random();
    private ArrayList<String> pokeList = new ArrayList<>();

    //constructor
    PokeSearch(String loc){
        place = loc;
    }

    //getter
    ArrayList<String> getPokeList(){
        return pokeList;
    }

    //other methods
    void findPoke(){
        int catchingOdds = randNum.nextInt(9);
        if(place.equals("Bluegum Town")){
            if(catchingOdds <= 2){ //30% chance of failing to find a creature
                System.out.println("You didn't find anything.\n");
            }else{
                int randBluePoke = randNum.nextInt(BluegumList.length - 1);
                System.out.println("You caught a " + BluegumList[randBluePoke] + "! It is now in your Pokémon box.\n");
                pokeList.add(BluegumList[randBluePoke]);
            }
        }
        else if(place.equals("Sea Fairy Forest")){
            if(catchingOdds <= 3){ //40% chance of failing to find a creature
                System.out.println("You didn't find anything.\n");
            }else{
                int randSPoke = randNum.nextInt(SeaFairyList.length - 1);
                System.out.println("You caught a " + SeaFairyList[randSPoke] + "! It is now in your Pokémon box.\n");
                pokeList.add(SeaFairyList[randSPoke]);
            }
        }
        else{
            if(catchingOdds <= 1){ //20% chance of failing to find a creature
                System.out.println("You didn't find anything.\n");
            }else{
                int randBlackPoke = randNum.nextInt(BlackfellList.length - 1);
                System.out.println("You caught a " + BlackfellList[randBlackPoke] + "! It is now in your Pokémon box.\n");
                pokeList.add(BlackfellList[randBlackPoke]);
            }
        }
    }
}
