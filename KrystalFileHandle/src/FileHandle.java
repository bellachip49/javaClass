public class FileHandle {
    public static void main(String [] args){
        //the file path parameter was not assigned to a String variable prior because it would make it difficult to change the path
        //if it was needed for use in the future
        //the "read file" object was not made yet because it may not display all the changes when it reads
        WriteFile FWrite = new WriteFile("/Users/krystalkwan/Documents/CCA/Java/KrystalFileHandle/classList.txt");//create object called FWrite from WriteFile class
        FWrite.inputSomething("Krystal, Annie, Jason, Caleb, Daniel"); //enter a String parameter into the inputSomething method from the WriteFile class
        // ^^^I specified the path according to the directory arrangement in my computer, but the path needs to be changed if another user runs this
        // Line 8 already creates the file, which means that a "create a file" class will not be needed
        ReadFile FRead = new ReadFile("/Users/krystalkwan/Documents/CCA/Java/KrystalFileHandle/classList.txt");//create object called FRead from ReadFile class
        //file path will need to be changed if used by another person other than Krystal
        FRead.showContent(); //call the ReadFile class's method showContent, which will output the contents of the file
    }
}
