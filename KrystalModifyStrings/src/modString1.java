class modString1 {
    //field
    private String origWord = "noodles";

    //constructor
    modString1(){

    }

    //getter
    String getOrigWord(){
        return origWord;
    }

    //setter
    void setOrigWord(String diffWord){
        this.origWord = diffWord;
    }

    //other method
    void changeToE(String diffWord){
        System.out.println(diffWord + " with o replaced to e is now " + diffWord.replace("o","e"));
    }
}
