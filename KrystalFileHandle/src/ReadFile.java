import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

class ReadFile {
    //fields
    private String fPath;

    //constructor
    ReadFile(String fName){ //manually inserting the path into the parameter when making the object makes it easier to change it in the future if needed
        fPath = fName;
    } //when object is made, file path parameter entered will be assigned to variable fPath

    //other methods
    void showContent(){
        File Document = new File(fPath); //find document using fPath's file path
        try {
            Scanner readerTool = new Scanner(Document);
            System.out.println("File found. Reading its contents..."); //indicate that it is reading the file
            while (readerTool.hasNextLine()) { //loop, printing out each line in the file until there is no line after
                System.out.println(readerTool.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("An error occurred while accessing the file. The file was not found."); //print out error msg if file doesn't exist
        }
    }
}
