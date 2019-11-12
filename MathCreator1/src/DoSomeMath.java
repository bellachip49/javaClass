public class DoSomeMath
{
    //fields any kind of field data
    //usually make data private to prevent messing up other people's data(or erase data)
    private int num = 5;

    //constructor takes a class and makes it into an object
    //has name of class, (), then {} (simplest constructor)
    //it's a constructor because it has the same name as the class
    public DoSomeMath()
    {}

    //methods take the data and do something
    public int getThatNum() //the 2 datatypes have to match
    {
        return num;
    }

    public void setThatNum(int newNum) //must add void - void is what it returns
    {
        this.num = newNum;
    }
}
