public class MultCreator {
    public static void main(String [] args){
        //make objects
        SpecialInt spin = new SpecialInt(); //spin is the name of the object

        spin.setMyInt(9);
        int findOut = spin.getMyInt();
        System.out.println(findOut);
    }
}
