class ChangeALetter {
    //fields
    private String [] xInsteadOfa = new String[4];

    //constructor
    ChangeALetter(){

    }

    //no getter or setter

    //other methods
    void copyArray(){
        for (String s : xInsteadOfa) {
            System.out.println(s);
        }
    }

    String [] replaceA(String [] origArray){
        for(int i = 0; i < origArray.length; i++){
            origArray[i] = origArray[i].replace("A", "X");
            origArray[i] = origArray[i].replace("a", "x");
        }
        return origArray;
    }
}
