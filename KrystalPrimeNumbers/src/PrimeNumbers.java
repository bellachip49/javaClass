public class PrimeNumbers {
    public static void main(String [] args){
        //make objects
        GetValues usrInput = new GetValues();
        PrimeArray makePrime = new PrimeArray();

        //use objects
        int min = usrInput.getMinFromUser();
        int max = usrInput.getMaxFromUser(min);
        int index = max - min;
        //makePrime.printArray(makePrime.makeArrayToUse(min, max));
        makePrime.printArray(makePrime.makePrimeArray(makePrime.makeArrayToUse(min, max), index));

    }
}
