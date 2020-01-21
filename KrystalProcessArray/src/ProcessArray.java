public class ProcessArray {
    public static void main(String [] args){
        //make objects
        CreateAndPrintArray makeArray = new CreateAndPrintArray();
        ChangeALetter modifyNames = new ChangeALetter();

        //use objects
        makeArray.printArrayNoParam();
        makeArray.printWithParam(modifyNames.replaceA(makeArray.getNameList()));
    }
}
