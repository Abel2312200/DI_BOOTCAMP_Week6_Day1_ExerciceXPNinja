public class IntLevelConst {

    // class atributes
    private String name;
    private int age;
    private char gender;

    // class methods

    /*
     * It's the first constructor : It initializes attributes with default values
     * */
    public IntLevelConst(){
        name = "Unknown";
        age = 0;
        gender = 'U';
    }

    /*
     * It's the second constructor : It initializes all attributes with parameter values
     * */
    public IntLevelConst(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /*
     * It's the third constructor : It initializes name and age attributes with parameter values
     * */
    public IntLevelConst(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    /*
     * Display information
     * @param : empty
     * @returns: void
     * */
    public void displayInfo(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender);
    }

}
