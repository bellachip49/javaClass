public class Dog {

    //fields (Data)
    private int numberOfLegs;
    private double weight;
    private String name;

    //constructor
    Dog(){

    }

    //getter
    String getName(){
        return name;
    }

    //setter
    void setname(String newName){
        this.name = newName;
    }

    double getWeight(){
        return weight;
    }

    void setWeight(double newWeight){
        this.weight = newWeight;
    }

    int getNumberOfLegs(){
        return numberOfLegs;
    }

    void setNumberOfLegs(int newNumberOfLegs){
        this.numberOfLegs = newNumberOfLegs;
    }
}
