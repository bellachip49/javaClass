public class PokeRunner {
    public static void main(String [] args){
        AskChoice ask = new AskChoice();
        System.out.println("Hello Trainer! Please select a location to start.");
        while (ask.DetermineLoc(ask.AskLoc())){
            ask.DetermineLoc(ask.AskLoc());
        }
        PokeSearch find = new PokeSearch(ask.getPlace());
        ask.findActivity(ask.askActivity());
        while(!(ask.getStatus().equals("exit"))) {
            System.out.println(ask.getStatus());
            switch (ask.getStatus()) {
                case "search":
                    find.findPoke();
                    break;
                case "show":
                    if((find.getPokeList()).size() <= 0){
                        System.out.println("You don't have any Pokémon. Try searching for some!\n");
                    }else {
                        for (int i = 0; i < (find.getPokeList()).size(); i++) {
                            System.out.println((find.getPokeList()).get(i));
                        }
                    }
                    break;
                default:
                    break;
            }
            ask.findActivity(ask.askActivity());
        }
    }
}
