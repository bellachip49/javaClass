public class MultTable {
    //field
    private int table;

    //constructor
    MultTable(){}

    //method
    int getTable(){
        return table;
    }

    void setTable(int newTable){
        this.table = newTable;
    }
    void makeMultTable(int myInt){
        for(int multiplyBy = 0; multiplyBy < 13; multiplyBy++){
            System.out.println(myInt + " * " + multiplyBy + " = " + (multiplyBy * myInt));
        }
    }
}
