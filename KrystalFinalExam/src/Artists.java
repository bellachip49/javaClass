class Artists {
    //fields
    private String artName;
    private String artMedium;
    private int dateCreated;

    //constructors
    Artists(){}
    Artists(String newName){
        artName = newName;
    }
    Artists(String newName, int newDate){
        artName = newName;
        dateCreated = newDate;
    }
    Artists(String newName, int newDate, String newMedium){
        artName = newName;
        dateCreated = newDate;
        artMedium = newMedium;
    }

    //getter
    String getArtName(){
        return artName;
    }
    String getMedium(){
        return artMedium;
    }
    int getDate(){
        return dateCreated;
    }

    //no setter

    //other methods
    void display(){
        System.out.println("Artists have a variety of mediums, art piece names, and dates when they have created the piece.");
        System.out.format("One example is the art piece called %s. Its medium is %s and was created in %d.", artName, artMedium, dateCreated);
    }
}
