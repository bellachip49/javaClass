public class modifyStrings {
    public static void main(String [] args){
        //make objects
        modString1 anotherWord = new modString1();
        modString2 charPerLine = new modString2();

        //use objects
        anotherWord.changeToE(anotherWord.getOrigWord());
        charPerLine.printEachLetter(charPerLine.getWord());

    }
}
