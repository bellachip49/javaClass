public class KrystalEnumProject {
    public static void main(String [] args){
        //make objects
        GetDataClass getD = new GetDataClass();
        EnumClass enumC = new EnumClass();

        //testing
        //System.out.println(getD.getData());
        //enumC.compareEnumToString(getD.getData());
        enumC.enumMethod(enumC.compareEnumToString(getD.getData()));

        //Use objects
    }
}
