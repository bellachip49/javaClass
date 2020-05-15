public class FishPondRunner {
    public static void main(String [] args){
        Koi fishKoi = new Koi();
        Tadpole fishTad = new Tadpole();
        fishKoi.fishing();
        fishKoi.caught();
        System.out.println();
        fishTad.fishing();
        fishTad.caught();
    }
}
