public class AddThemUp {
    public static void main(String [] args){
        //make objects
        GetFirstNumber firNum = new GetFirstNumber(); //use abbrev. name of the class OR
        GetSecondNumber secNum = new GetSecondNumber(); //use a more specific thing than the class

        //use objects
        firNum.askFirst();
        secNum.askSecond();

        System.out.println("The sum is " + (firNum.getNum1() + secNum.getNum2()) + ".");
    }
}
