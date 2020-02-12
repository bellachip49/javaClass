import java.lang.Math;
import java.util.ArrayList;

class PrimeArray {
    //fields
    private boolean isComposite = false;

    //constructor
    PrimeArray(){

    }

    //getter

    //setter

    //other methods
    int[] makeArrayToUse(int min, int max){
        int [] numArray = new int[max - min + 1];
        for(int i = 0; min <= max; min++, i++){
            numArray[i] = min;
        }
        return numArray;
    }

    //Mrs. Carlson's code
    private boolean isPrime(int number) {
        if (number == 2 || number == 3) {  //deal with the simple primes first
            return true;
        }
        if (number % 2 == 0) {  //get rid of the even numbers
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;  //only have to do up to the sqrt of the max num
        for (int i = 3; i < sqrt; i += 2) { //count by twos to eliminate even numbers
            if (number % i == 0) {  //if divisible by anything, not prime
                return false;
            }
        }
        return true;
    }

    int [] makePrimeArray(int [] givenArray, int index){
        int [] primeList = new int[index + 1];
        for(int i = 0, j = 0; i < givenArray.length; i++){
            //Code copied & modified from: https://www.programiz.com/java-programming/examples/prime-number
            for(int k = 2; k <= (givenArray[i]/2); k++) {
                if(givenArray[i] % k == 0){
                    isComposite = true;
                    break;
                }
            } //working version :)
            if(!isComposite){
                primeList[j] = givenArray[i];
                j++;
            }
            isComposite = false;
        }
        return primeList;
    }

    void printArray(int [] givenArray){
        if(givenArray[0] == 0){
            System.out.println("There were no prime numbers in the given range.");
        }
        else {
            System.out.println("\nHere is the list of prime numbers:");
            for (int value : givenArray) {
                if (value == 0) {
                    continue;
                }
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
