public class MathCreator
{
    public static void main(String [] args)  //start here no fields, no constructor, no methods
            //creates objects and has code to show what to do with those objects
    {
        //create objects
        DoSomeMath math1 = new DoSomeMath();
        DoSomeMoreMath math2 = new DoSomeMoreMath();

        //code to show that you can do things with the objects
        int sum = math1.getThatNum() + math2.getThatNum(); //add dot, then call the method (<something>.getThatNum())
        System.out.println("The sum is " + sum);

    }
}