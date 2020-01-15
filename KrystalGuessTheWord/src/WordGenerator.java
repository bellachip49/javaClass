import java.lang.Math;

class WordGenerator {
    //fields
    private String [] colors = {"red", "orange", "yellow", "green", "blue", "purple", "indigo", "violet"}; //create list of possible colors
    private String colorPicker = colors[(int)(Math.random() * (colors.length - 1))]; //randomize colors

    //constructor
    WordGenerator(){

    }

    //getter
    String [] getColors(){
        return colors;
    }

    //setter
    void setColors(String [] newArray)
    {
        for(int i = 0; i < newArray.length; i++)
        {
            colors[i] = newArray[i];
        }
    }

    //other methods
    void printArray(String [] givenArray){
        for(int i = 0; i < givenArray.length; i++)
        {
            System.out.println(givenArray[i]); //print each item in the array
        }
    }

    String findColor(){
        //System.out.println(randColor); //debug -> check if colors are randomized
        return colorPicker;
    }
}
