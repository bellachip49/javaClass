public class grades {
    public static void main(String[] args)
    {
        int grade = 29;
        if(grade < 25)
        {
            System.out.println("You grade is an F.");
        }
        else if(grade >= 25 && grade < 45)
        {
            System.out.println("You grade is an E.");
        }
        else if(grade >= 45 && grade < 50){
            System.out.println("You grade is a D.");
        }
        else if(grade >= 50 && grade < 60){
            System.out.println("You grade is a C.");
        }
        else if(grade >= 60 && grade <= 80){
            System.out.println("You grade is a B.");
        }
        else{
            System.out.println("You grade is an A.");
        }
    }
}
