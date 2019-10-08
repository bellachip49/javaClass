public class theResult {
    public static void main(String args[])
    {
        int i, j;

        for(i = 0; i < 10; i++)//loop until i is greater or equal to 10
        {
            for(j = 0; j < i; j++) //loop until j is greater or equal to i
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 1234/10=123
// 1234 % 10
// 123/10 = 12
// 12/10 = 1
// 1/10 = 0