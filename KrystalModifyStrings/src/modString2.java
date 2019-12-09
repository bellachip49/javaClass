class modString2 {
    //field
    private String word = "daydreaming";

    //constructor
    modString2(){

    }
    //getter
    String getWord(){
        return word;
    }
    //setter
    void setWord(String newWord){
        this.word = newWord;
    }
    //other method
    void printEachLetter(String givenWord){
        for(int i = 0; i < givenWord.length(); i++){
            System.out.println(givenWord.charAt(i));
        }
    }
}
