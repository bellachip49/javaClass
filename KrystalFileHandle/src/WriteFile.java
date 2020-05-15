import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
    //fields
    private String fPath; //make variable fPath to store path

    //constructor
    WriteFile(String fName){ //my dad taught me how to use a constructor to make file handling more efficient
        fPath = fName;
    } //when object is made, file path parameter entered will be assigned to variable fPath

    //other methods
    void inputSomething(String msg){
        try{
            FileWriter WriteDoc = new FileWriter(fPath); //use the path passed into the constructor's parameter to make a new file
            System.out.println("File created.");
            WriteDoc.write(msg);
            System.out.println("Message written. Closing document.\n");
            WriteDoc.close(); //need to close document before reading to save any changes
        }
        catch (IOException e){
            System.out.println("An error occurred while writing the file."); //prints out error message if file doesn't exist
        }
    }
}
