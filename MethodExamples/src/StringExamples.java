public class StringExamples {
    //fields
    String firstName = "Jessica";
    String lastName = "Wong";
    String hobby = "volleyball";

    //constructor
    StringExamples()
    {}

    //getters
    String getFirstName()
    {
        return firstName;
    }
    String getLastName()
    {
        return lastName;
    }
    String getHobby()
    {
        return hobby;
    }

    //setters
    void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }
    void setHobby(String newHobby)
    {
        this.hobby = newHobby;
    }

    //Other methods to transform Strings
    void printStudentInfo()  //combine information in your fields to explain ideas
    {
        System.out.println(firstName + lastName + " loves " + hobby + ".");
    }

    String combineWholeName ()  //no parameter
    {
        String wholeName;
        wholeName = firstName + " " + lastName + ".";
        return wholeName;
    }
    String changeName(String aName)  //use one parameter so you do not change original data
    {
        aName = firstName.replace('s', 'f');
        return aName;
    }
    void addFriend(String teammate1, String teammate2) //two parameters
    {
        //Can print
        System.out.println(firstName + ", " + teammate1 + "and" + teammate2 + " all play " + hobby + ".");
        //return firstName;

    }
}
