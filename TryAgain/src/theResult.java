public class theResult {
    public static void main(String [] args){
        int sum = 0;

        for(int i = 0; i < 21; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum is " + sum + ".");
    }
}
// 1234/10=123
// 1234 % 10
// 123/10 = 12
// 12/10 = 1
// 1/10 = 0