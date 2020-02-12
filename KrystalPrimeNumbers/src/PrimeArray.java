import java.lang.Math;

class PrimeArray {
    //fields
    private int [] primeList;
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

    //boolean isPrime() <- not sure if this is needed (will keep here)

    int [] makePrimeArray(int [] givenArray){ //may have to change later if isPrime() has some use
        for(int i = 0, j = 0; i <= givenArray.length; i++, j++){
            //https://www.programiz.com/java-programming/examples/prime-number
            for(int k = 2; k <= givenArray[i]/2; k++) {
                if(givenArray[i] % k == 0){
                    isComposite = true;
                    break;
                }
            }
            if(!isComposite){
                primeList[j] = givenArray[i];
            }
        }
        return primeList;
    }

    void printArray(int [] givenArray){
        for(int i: givenArray){
            System.out.println(i);
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
