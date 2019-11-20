public class MultCreator {
    public static void main(String [] args){
        //make objects
        SpecialInt spin = new SpecialInt(); //spin is the name of the object
        MultTable table = new MultTable(); //table is the object name

//        spin.setMyInt(9);
//        int findOut = spin.getMyInt();
//        System.out.println(findOut);
        //variable to be entered
        //print out the multiplication table
        table.makeMultTable(spin.getIntFromUser());
    }
}
