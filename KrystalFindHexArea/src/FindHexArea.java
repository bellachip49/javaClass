public class FindHexArea {
    public static void main(String [] args){
        //make objects
        Side getSide = new Side();
        Hexagon areaHex = new Hexagon();

        //use objects
        areaHex.printResult(areaHex.findHexArea(getSide.getSide()));

        /*
        Goal of program: find area of hexagon with a given side from the user

        Side:
        "input" Scanner variable takes and stores the user input
        asks the user to input a side for the hexagon
        returns the value of the given side

        Hexagon:
        calculates hexagon area and returns it
        has another method to print the result (printResult),
        which also rounds the final value to two decimal places

         */
    }
}
