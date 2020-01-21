class CreateAndPrintArray {
    //fields
    private String [] nameList = {"Nicole", "Christina", "Angela", "Bonnie", "Kaede"};

    //constructor
    CreateAndPrintArray(){

    }

    //getter
    String [] getNameList(){
        return nameList;
    }

    //setter
    void setNameList(String [] newList){
        for(int i = 0; i < newList.length; i++){
            newList[i] = nameList[i];
        }
    }

    //other methods
    void printArrayNoParam(){
        for (String s : nameList) {
            System.out.println(s);
        }
    }

    void printWithParam(String [] givenArray){
        for (String i : givenArray) {
            System.out.println(i);
        }
    }
}
