public class theResult {
    public static void main(String [] args){
        int cubedSum = 0;

        for(int i = 1; i <= 10; i++){
            cubedSum += (i * i * i);
        }
        System.out.println("The sum of the cubed integers from 1 to 10 is " + cubedSum + ".");
    }
}
// 1234/10=123
// 1234 % 10
// 123/10 = 12
// 12/10 = 1
// 1/10 = 0