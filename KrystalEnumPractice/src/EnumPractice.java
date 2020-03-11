public class EnumPractice {
    //make enum
    enum Colors{
        RED,
        BLUE,
        YELLOW,
        BLACK,
        WHITE
    }
    public static void main(String [] args){
        Colors myColor = Colors.BLACK;

        //make switch
        switch(myColor){
            case RED:
                System.out.println("The color is red.");
                break;
            case BLUE:
                System.out.println("The color is blue.");
                break;
            case YELLOW:
                System.out.println("The color is yellow.");
                break;
            case BLACK:
                System.out.println("The color is black.");
            case WHITE:
                System.out.println("The color is white.");
            default:
                System.out.println("The color you chose is not available.");
        }

        for(Colors val: myColor.values()){
            System.out.println(val);
        }
    }
}
