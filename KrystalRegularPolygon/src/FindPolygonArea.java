class FindPolygonArea {
    //fields

    //constructor
    FindPolygonArea(){

    }

    //no getter or setter

    //other methods
    double findPolyArea(int sideNum, double lenOfSide){
        return (sideNum*lenOfSide*lenOfSide)/((4*(Math.tan(Math.PI/sideNum))));
    }

    void printResult(double polyArea, int side){
        System.out.format("The area of the " + side +"-sided polygon is about %.2f units.", polyArea);
    }
}
