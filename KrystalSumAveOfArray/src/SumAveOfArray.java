public class SumAveOfArray {
    public static void main(String [] args){
        //make objects
        SumOfArray findTheSum = new SumOfArray();
        AveOfArray calcAvg = new AveOfArray();

        //use objects
        System.out.println("The sum is " + (findTheSum.arraySum(findTheSum.getMyArray())) + ".");
        calcAvg.arrayAvg(findTheSum.arraySum(findTheSum.getMyArray()), findTheSum.getMyArray());
    }
}
