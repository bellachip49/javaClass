public class GenesisCreator {
    public static void main(String [] args){
        //create objects
        Genesis1 str1 = new Genesis1();
        Genesis2 str2 = new Genesis2();

        //use objects
        String phrase = str1.getMyString() + str2.getOtherString();
        System.out.println(phrase);
    }
}
