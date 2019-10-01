//From https://docs.oracle.com/javase/tutorial/java/data/QandE/characters-questions.html

//Questions and Exercises: Characters and Strings
//Questions
//1. What is the initial capacity of the following string builder?
StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
16
//2. Consider the following string:
String hannah = "Did Hannah see bees? Hannah did.";
//a. What is the value displayed by the expression hannah.length()?
32
//b. What is the value returned by the method call hannah.charAt(12)?
e
//c. Write an expression that refers to the letter b in the string referred to by hannah.
hannah.charAt(17);

//3. How long is the string returned by the following expression? What is the string?
"Was it a car or a cat I saw?".substring(9, 12)
3
car
//In the following program, called ComputeResult, what is the value of result after each numbered line executes?

public class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0)); //si
/*2*/   result.setCharAt(1, original.charAt(original.length()-1)); //se 
/*3*/   result.insert(1, original.charAt(4)); //swe
/*4*/   result.append(original.substring(1,4)); //ftswe Correction: sweoft
/*5*/   result.insert(3, (original.substring(index, index+2) + " ")); //ftsr we Correction: swear oft

        System.out.println(result);
    }
}
//Result:
//ftsr we
//Correction:
//swear oft

Exercises
//Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
String hi = "Hi, ";
String mom = "mom.";

System.out.println(hi + mom);
System.out.println(hi.append(mom));