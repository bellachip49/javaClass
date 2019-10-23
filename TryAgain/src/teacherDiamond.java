import java.util.Scanner;

public class teacherDiamond {
    public static void main(String [] args){
        //Declare variables.  Probably should think of something better than i and j
        int i, j;
        int numRows;

        //Get the number of rows from the user.  NOT REQUIRED, just shown for an example
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        numRows = in.nextInt();

        //Make top half of the diamond
        for(i = 0; i <= numRows/2 ; i++){  //loop for rows.  Note: ++ because the rows are increasing //divide by 2 so size isn't accidentally doubled
            for(j = 1; j <= numRows - i; j++){ //loop for spaces
                System.out.print(" ");
            }
            //Start loop using the SAME variable as the spaces loop.  When the spaces end, the stars begin
            for(j = 1; j <= 2 * i + 1 ; j++){ //loop for stars Notice how it is centered: 2 times the row variable minus 1 so first row
                //is 2-1 = 1, second row 4-1 = 3, third row 6 -1 = 5...all ODD numbers so it stays centered
                System.out.print("*");
            }
            System.out.println(); //move to new line for bottom half of diamond
        }

        //Make the bottom half of the diamond
        for(i = numRows/2 - 1; i > -1; i--){  //loop for rows. Note: -- because the rows are decreasing
            for(j = 1; j <= numRows - i; j++){
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
