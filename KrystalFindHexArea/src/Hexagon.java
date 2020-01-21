import java.lang.Math;

class Hexagon {
    //no fields

    //no getter or setter

    //other methods
    double findHexArea(double lengthOfSide){
        return (6*lengthOfSide*lengthOfSide)/((4*(Math.tan(Math.PI/6))));
    }

    void printResult(double hexArea){
        System.out.format("The area of the hexagon is about %.2f units.", hexArea);
    }

}
