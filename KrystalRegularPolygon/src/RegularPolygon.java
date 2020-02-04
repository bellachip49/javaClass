public class RegularPolygon {
    public static void main(String [] args){
        //make objects
        AskForInput usrInput = new AskForInput();
        FindPolygonArea areaPoly = new FindPolygonArea();

        //use objects
        areaPoly.printResult(areaPoly.findPolyArea(usrInput.numOfSides(), usrInput.lenOfSide()), usrInput.getNumOfSides());

        /*
        Goal of program: find area of hexagon with a given side from the user

        AskForInput:
        "input" Scanner variable takes and stores the user input
        numOfSides variable records number of sides and returns it
        asks user to input num of sides for polygon
        returns num of sides
        asks the user to input a side for the polygon
        returns the value of the given side

        FindPolygonArea:
        calculates polygon area and returns it
        has another method to print the result (printResult)
        it takes the number of sides returned and prints it out with the final value rounded to hundredths.

         */
    }
}
