public class theResult {
    public static void main(String [] args){
        int numberOfRows = 5;
        int width = 3;
        String letterA = "a ";
        int i = 0;
        int j = 0;

        while(i <= numberOfRows){
            while(j <= width){
                System.out.print(letterA);
                j++;
            }
            j = 0;
            System.out.print("\n");
            i++;
        }
    }
}
// 1234/10=123
// 1234 % 10
// 123/10 = 12
// 12/10 = 1
// 1/10 = 0