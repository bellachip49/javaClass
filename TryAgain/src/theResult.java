public class theResult {
    public static void main(String [] args){
        int sum = 0;
        int average = 0;

        for(int i = 21; i <= 31; i++){
           System.out.print(i + " ");
           sum += i;
           average++;
        }
        average = sum / average;
        System.out.println("\nThe sum is " + sum + ".");
        System.out.println("The average is " + average + ".");
    }
}
// 1234/10=123
// 1234 % 10
// 123/10 = 12
// 12/10 = 1
// 1/10 = 0