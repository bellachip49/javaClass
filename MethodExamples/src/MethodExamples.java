public class MethodExamples {
    public static void main(String [] args)
    {
        //make objects
        NumbersExample numEx = new NumbersExample();
        StringExamples strEx = new StringExamples();
        StringExamples arrayEx = new StringExamples();

        //use objects
        //Number examples
        System.out.println("The sum of intX and intY is " + numEx.addTwoNumbers());
        System.out.println("The sum of intX and a parameter is " +
                numEx.addTwoNumbersWithOneParam(5));
        System.out.println("The sum of two parameters is " +
                numEx.addTwoNumbersWithTwoParam(5, 11));

        //String examples
        System.out.println("The person's whole name is " + strEx.combineWholeName());
        System.out.println("If we change s to f, the name is " + strEx.changeName("") + ".");
        strEx.addFriend("Wendy ", " Mei Lin");

        System.out.println(numEx.multTwoNumbersTwoParam(3, 8));
        System.out.println(numEx.multTwoNum());
        System.out.println(numEx.multTwoNumbersWithOneParam(4));
    }
}
