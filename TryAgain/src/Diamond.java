public class Diamond {
    public static void main(String[] args) {
        for (int i = 7; i > 0; i--) {
            for(int j = (i - 1); j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 13; k >= 2 * i - 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--) {
            for (int k = (i ); k < 7; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
