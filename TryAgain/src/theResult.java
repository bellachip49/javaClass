public class theResult {
    public static void main(String [] args){
        String greeting = "Hey";
        String result = "";
        for(int i = 1; i <= 6; i++){
            result = greeting + result;
        }
        System.out.println(result);
    }
}
