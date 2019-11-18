public class NumbersExample {
    //fields
    int intX = 3;
    int intY = 2;
    int intZ = 1;

    //constructor
    NumbersExample()
    {}

    //getters
    int getX()
    {
        return intX;
    }
    int getY()
    {
        return intY;
    }
    int getZ()
    {
        return intZ;
    }

    //setters
    void setX(int newX)
    {
        this.intX = newX;
    }
    void setY(int newY)
    {
        this.intY = newY;
    }
    void setZ(int newZ)
    {
        this.intZ = newZ;
    }

    //other methods to transform numbers
    int addTwoNumbers()  //NO PARAMETER
    {
        return intX + intY;
    }
    int addTwoNumbersWithOneParam(int num1)
    {
        return intX + num1;
    }
    int addTwoNumbersWithTwoParam(int num1, int num2)
    {
        return num1 + num2;
    }

    //Practice: Write three methods multiplying two numbers

    int multTwoNumbersTwoParam(int num1, int num2){
        return num1 * num2;
    }
    int multTwoNumbersWithOneParam(int num){
        return intY * num;
    }
    int multTwoNum(){
        return intX * intY;
    }
}
