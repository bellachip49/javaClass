import java.util.Scanner;

class GetData {
    //Scanner
    Scanner askUsr = new Scanner(System.in);

    //getData method which returns...
    String getData(){
        System.out.println();
        return askUsr.nextLine();
    }
}
