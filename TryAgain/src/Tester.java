public class Tester {
    public static void main(String args[]){
        /*int a = 1;
        int b = 2;
        int c; //declare c
        int d;

        c = ++b; //add 1 to b, then assign b to c (c = 3)
        d = a++; //assign d to a, then add 1 to a
        c++; //add 1 to c (c = 4)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);*/

        int a = 1;
        int b = 2;
        int c;
        int d;

        c = --b; //subtract 1 from b, then assign c to b (c = 1, b = 1)
        d = a--; //assign d to a, then subtract 1 from a (d = 1, a = 0)
        c--; //subtract 1 from c; assign the new value to c (c = 0)
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
    }
}
