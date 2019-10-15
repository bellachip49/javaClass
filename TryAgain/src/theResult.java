public class theResult {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; ++i) { //loop until i is greater than 5
            System.out.println("Outer loop iteration " + i);
            for (int j = 1; j <=2; ++j) { //loop until j is greater than 2
                System.out.println("i = " + i + "; j = " + j);
            }
        } 
    }
}
