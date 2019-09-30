public class MathReading {
    public static void main(String[] args) {
        /*int result = 1000 % 90;
        System.out.println(result);  //line 1

        result = 100 % 90;
        System.out.println(result);  //line 2

        result = 81 % 80;
        System.out.println(result);  //line 3

        result = 6 % 4;
        System.out.println(result);  //line 4

        result = 17 % 5;
        System.out.println(result);  //line 5

        result = 45 % 11;
        System.out.println(result);  //line 6

        result = 1 % 1;
        System.out.println(result);  //line 7*/
        int result = 10 / 5; // equals 2
        System.out.println(result);  //line 1

        result = 11 / 5; //2.2 truncated, so the answer is 2
        System.out.println(result);  //line 2

        double result1 = 10.0 / 5.0; //this needs a double answer is 2.0
        System.out.println(result1);  //line 3

        result1 = 11 / 5; //2.2 not correct because decimal points weren't given; therefore it'll only have a .0i][
        System.out.println(result1);  //line 4

        result1 = 11 / 5.0; //2.2
        System.out.println(result1);  //line 5

        result = 25 / 11; //2
        System.out.println(result);  //line 6

        result = 22 / 11; //2
        System.out.println(result);  //line 7
    }
}
