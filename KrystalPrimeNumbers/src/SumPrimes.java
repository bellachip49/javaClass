class SumPrimes {
    //fields
    private int sum = 0;

    //constructor
    SumPrimes(){}

    //getter

    //setter

    //other methods
    int sumOfPrimes(int [] primeArray){
        for(int item : primeArray){
            sum += item;
        }
        return sum;
    }
}
