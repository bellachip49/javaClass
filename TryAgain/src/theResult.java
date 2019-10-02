public class theResult {
    public static void main(String [] args){
        int num = 45;
        if((num / 10 > 0) && (num / 10 <= 9)){
            System.out.println("One digit");
        }
        else{
            System.out.println("invalid");
        }
    }
}
// 1234/10=123
// 1234 % 10
// 123/10 = 12
// 12/10 = 1
// 1/10 = 0