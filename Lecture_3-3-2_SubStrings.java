  /*Java String substring()  From https://www.javatpoint.com/substring
The java string substring() method returns a part of the string.

"Crosspoint"  "point"

We pass begin index and end index number position in the java substring method where start index is 
inclusive and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.

CROSSPOINT
0123456789

SUBSTRING(INDEXES) Examples: variableName(3); This starts at index 3 including index 3 and goes to the end of the string
substring will be SSPOINT

example: variableName(3,5); This starts at index 3 and goes to index 5, BUT DOES NOT INCLUDE INDEX 5
SS

example: variableName(17); IndexOutofBoundsException

There are two types of substring methods in java string.

Internal implementation: This is how this acts inside Java.  You are NOT required to know it, but it is good to know*/
public String substring(int beginIndex) {  //parameter
       if (beginIndex < 0) 
       {  
           throw new StringIndexOutOfBoundsException(beginIndex);  
       }  
       int subLen = value.length - beginIndex;  
       if (subLen < 0) 
       {  
           throw new StringIndexOutOfBoundsException(subLen);  
       }  
       return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);  //this is a tertiary 
   }


//Signature
public String substring(int startIndex)  
//and  
public String substring(int startIndex, int endIndex)  

String school = "Crosspoint Academy";
String mySubString = school.substring(5, 10);

//oss
String mySub = school.substring(2, 5);

//poi
String mySub = school.substring(5, 8);

//p
String mySub = school.substring(5, 6); //to get a single letter, the numbers have to be consecutive

//int
String mySub = school.substring(7, 10);

//emy
String mySub = school.substring(15, 18);
String mySub = school.substring(15);

/* IMPORTANT TO KNOW:

If you do not specify endIndex, java substring() method will return all the characters from startIndex.  
Parameters
startIndex : starting index is inclusive

endIndex : ending index is exclusive

Returns
specified string

Throws
StringIndexOutOfBoundsException if start index is negative value or end index is lower than starting index.

Java String substring() method example*/

public class SubstringExample{  
  public static void main(String args[]){  

    String s1 = "Crosspoint";  
    System.out.println(s1.substring(2, 4)); //returns os
    System.out.println(s1.substring(2)); //returns osspoint  
    System.out.println(s1.substring(3)); //returns sspoint
    System.out.println(s1.substring(3,4)); //returns s
    System.out.println(s1.substring(3,6)); //returns ssp
  }
}  

//Results:
//
//

Java String substring() Method Example 2
public class SubstringExample2 {  
    public static void main(String[] args) {  
        String s1="Crosspoint";    //C at 0, r at 1, o at 2, s at 3, s at 4, p at 5, o at 6, i at 7, n at 8, t at 9...NO 10
        String substr = s1.substring(0); // Starts with 0 and goes to end  
        System.out.println(substr);  
        String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  
        System.out.println(substr2);    
        String substr3 = s1.substring(5,15); // Returns Exception  
    }  
}  
//Crosspoint
//point
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 5, end 15, length 10