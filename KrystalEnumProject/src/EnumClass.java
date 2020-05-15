import javax.xml.bind.annotation.XmlType;

class EnumClass {
    //enum
    enum Birds{
        CHICKADEE,
        ROBIN,
        FINCH,
        PARAKEET,
        CANARY
    }

    //constructor
    EnumClass(){}

    //Method: changes String to enum, then uses enum to make keyword for switch statement
    //return val & method name
    Birds compareEnumToString(String userInput){ //because return type is enum, RETURN AN ENUM
        String toEnum = userInput.toUpperCase();
        Birds myBird = Birds.valueOf(toEnum);
        for(Birds name: Birds.values()){
            //.values() method puts enum val into array so it can loop through it (cannot loop through enum)
            //converts enum type to an array type
            if((name.toString()).equalsIgnoreCase(userInput)){
                //change the userInput to upper case. Put that value into a String variable called toEnum
                toEnum = userInput.toUpperCase();
                //take String val toEnum and change it to a Season type enum and put it in the variable mySeas
                myBird = Birds.valueOf(toEnum); //the equals here means assignment
                //print enum value which is in the variable mySeas
            }
        }
        return myBird;
    }
    void enumMethod(Birds myBirds){
//        for(Birds val: myBirds.values()) {
//            System.out.println(val);
//        }

        /*if((enum.toString()).equals(value)){ (practicing pseudocode)
            declare the enum
            Birds birdSpecies = Birds.PARAKEET;


        }

         */
        System.out.println(myBirds); //del later
        switch (myBirds) {
            case CHICKADEE:
                Chickadee chickD = new Chickadee();
                chickD.printChickadeeData();
                break;
            case ROBIN:
                Robin rbin = new Robin();
                rbin.printRobinData();
                break;
            case FINCH:
                Finch fnch = new Finch();
                fnch.printFinchData();
                break;
            case PARAKEET:
                Parakeet pkeet = new Parakeet();
                pkeet.printParakeetData();
                break;
            case CANARY:
                Canary can = new Canary();
                can.printCanaryData();
                break;
            default:
                System.out.println("Your answer is not in the system.");
        }
    }
}
