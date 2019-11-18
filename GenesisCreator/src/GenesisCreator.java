public class GenesisCreator {
    public static void main(String [] args){
        //create objects
        Genesis1 str1 = new Genesis1();
        Genesis2 str2 = new Genesis2();

        //use objects

//      1. Find the length of the two strings and add the lengths together in a variable call bothLengths.
        int bothLengths = str1.getMyString().length() + str2.getOtherString().length();
        System.out.println("Combined length of both strings is " + bothLengths + ".");

//      2. Concatenate the Strings and print the concatenation WITHOUT changing the Strings in the classes.
        System.out.println(str1.getMyString() + str2.getOtherString());

//      3. Check and see if the Strings are equal. Print the answer
        if(str1.getMyString().equals(str2.getOtherString())){
            System.out.println("The strings are equal.");
        }
        else{
            System.out.println("The strings are not equal.");
        }

//      4. Check and see if the Strings are equal ignoring case.  Print the answer.
        if(str1.getMyString().equalsIgnoreCase(str2.getOtherString())){
            System.out.println("The strings are equal, ignoring case.");
        }
        else{
            System.out.println("The strings are not equal, ignoring case.");
        }

//      5. Print both strings with all capital letters.  Do not change the Strings in the classes.
        System.out.println(str1.getMyString().toUpperCase());
        System.out.println(str2.getOtherString().toUpperCase());

//      6. Change the Strings to the following values.
        String myString1 = "God created the heavens and the earth.";
        String myString2 = "God Created the Heavens and the Earth.";
        str1.setMyString(myString1);
        str2.setOtherString(myString2);

//      7. Run the code with the new values and show the output.
        System.out.println(str1.getMyString());
        System.out.println(str2.getOtherString());
    }
}
