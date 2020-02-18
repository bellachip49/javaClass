public class PrimeNumbers {
    public static void main(String [] args){
        //make objects
        GetValues usrInput = new GetValues();
        PrimeArray makePrime = new PrimeArray();
        SumPrimes sum = new SumPrimes();

        //use objects
        int min = usrInput.getMinFromUser();
        int max = usrInput.getMaxFromUser(min);
        int index = max - min;
        //makePrime.printArray(makePrime.makeArrayToUse(min, max));
        makePrime.printArray(makePrime.makePrimeArray(makePrime.makeArrayToUse(min, max), index));
        System.out.println("\nThe sum of the primes in the given range is " + (sum.sumOfPrimes(makePrime.makePrimeArray(makePrime.makeArrayToUse(min, max), index))) + ".");

        //sum works but we need a print statement indicating a sum
        /*
        README
        PrimeArray class:
        isComposite variable determines whether the specified item in the array is composite; it is false by default
        makeArrayToUse method makes an array in the range given by the user
        makePrimeArray class looks at each value of the given array and only adds primes into a new array
        printArray class prints out each value in the specified array using a foreach loop

        GetValues class:
        import Scanner to ask the input from the user
        getMinFromUser method gets the min number from the user; returns minimum number
        getMaxFromUser method gets the max number from the user; if the user inputs a number less than the min,
        it keeps looping until the user inputs a valid number; returns maximum number

        SumPrimes class:
        makes a new var called sum to store the sum to return later
        sumOfPrimes method adds each number in the array of primes to the sum
        then returns the sum of all primes in the array

        PrimeNumbers class: (also known as the "main" class)
        makes three objects from each class: usrInput, makePrime, and sum for the GetValues, PrimeArray, and SumPrimes class, respectively
        asks user for lowest and highest number of the range, then stores these two integers in min and max, respectively
        makes another int variable for the index, which helps to determine the length of the array to be created
        prints the prime array using the makePrime object
        then prints out the sum of all the primes with the "sum" object
         */
    }
}
