import java.util.ArrayList;

class PrimeArray {
    //fields
    private boolean isComposite = false;
    private ArrayList<Integer> primeList = new ArrayList<Integer>();

    //constructor
    PrimeArray(){

    }

    //no getter or setter

    //other methods
    int[] makeArrayToUse(int min, int max){
        int [] numArray = new int[max - min + 1];
        for(int i = 0; min <= max; min++, i++){
            numArray[i] = min;
        }
        return numArray;
    }

    //Mrs. Carlson's code
//    private boolean isPrime(int number) {
//        if (number == 2 || number == 3) {  //deal with the simple primes first
//            return true;
//        }
//        if (number % 2 == 0) {  //get rid of the even numbers
//            return false;
//        }
//        int sqrt = (int) Math.sqrt(number) + 1;  //only have to do up to the sqrt of the max num
//        for (int i = 3; i < sqrt; i += 2) { //count by twos to eliminate even numbers
//            if (number % i == 0) {  //if divisible by anything, not prime
//                return false;
//            }
//        }
//        return true;
//    }

    ArrayList<Integer> makePrimeArray(int [] givenArray){
        primeList.clear(); //empty the list of any preexisting elements
        /*
        Note on the "clear" on the line above (if you wanted to know why)
        Apparently there was a logic error(logic error = program ran smoothly, but the output you wanted wasn't right)
        that caused the values in the list to get duplicates, making the sum incorrect. I realized they
        made duplicates so I printed it out as the first line following the method "title". The console
        printed out the values already existing on the list, and turns out all the prime values were
        already in there. So I decided to clear any preexisting values in the array list. (Mysteriously
        the print statement said nothing about this(they never actually mentioned duplicates!) There is an
        alternative way to go around this, which is to divide the final sum by two, successfully removing
        the sum that the duplicates made. (One may say the "wrong" duplicate sum divided by two may result
        in a decimal, or, 0.5, but remember that the "correct" sum, with no duplicates, is either even or odd.
        Thus, because these two sums making up the duplicate sum is COMPLETELY IDENTICAL, it MUST be able to be
        EVENLY DIVIDED BY TWO. (odd + odd = even, even + even = even). In the end, both methods work out.
         */
        for(int i = 0; i < givenArray.length; i++){
            //Code copied & modified from: https://www.programiz.com/java-programming/examples/prime-number
            for(int k = 2; k <= (givenArray[i]/2); k++) {
                if(givenArray[i] % k == 0){
                    isComposite = true;
                    break;
                }
            }
            if(!isComposite){
                primeList.add(givenArray[i]);
            }
            isComposite = false;
        }
        return primeList;
    }

    void printArray(ArrayList<Integer> givenArray){
        if(givenArray.size() == 0){
            System.out.println("There were no prime numbers in the given range.");
        }
        else {
            System.out.println("\nHere is the list of prime numbers:");
            for (int value : givenArray) {
                System.out.println(value);
            }
        }
    }
}
//if we divide by all prime numbers less than the square root of the number, we eliminate any composite number
/*
213
not even...the first thing is eliminate all even numbers
eliminate all even numbers
square root is the biggest...factor?
 */
