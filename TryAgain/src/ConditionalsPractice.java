public class ConditionalsPractice {
    public static void main (String [] args) {
        int waxInStock = 5050;  //number is in pounds

        if (waxInStock < 3000) {
            //order more 500 lbs more wax
            System.out.print("Wax level is too low. " + waxInStock + " is less than 3000 lbs.  Send an order for 500 lbs wax.");
        } else {
            //Do nothing.
            System.out.print("Have enough wax right now.");
        }
        int waxUsedToday = 720;

        //Change the value of waxInStock
        waxInStock -= waxUsedToday;
        System.out.println();
        //Then check again
        if (waxInStock < 3000)
        {
            //order more 500 lbs more wax
            System.out.print("Wax level is too low. " + waxInStock + " is less than 3000 lbs.  Send an order for 500 lbs wax." );
        }
        else
        {
            //Do nothing.
            System.out.print("Have enough wax right now.");
        }
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}
