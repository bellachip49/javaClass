class EnumClass {
    //make enum
    enum Colors{
        RED,
        BLUE,
        YELLOW,
        BLACK,
        WHITE
    }
    Colors myColor = Colors.BLACK;

    //print enum
    void enumMethod(){
        for(Colors val: myColor.values()) {
            System.out.println(val);
        }
    }

    //make switch
    void switchStatement() {
        switch (myColor) {
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
    }
    //print enum

}
