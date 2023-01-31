public class Main {
    public static void main(String[] args) {
        /* *****Exercise1***** */

        DifferentData differentData = new DifferentData();
        differentData.displayInfo();

        /* *****Exercise2***** */

        IntDifferentData intDifferentData = new IntDifferentData();

        // Display numbers values
        System.out.println(intDifferentData.getAge());
        System.out.println(intDifferentData.getWeight());

        // Display others values
        System.out.print(intDifferentData.isStudent());
        System.out.print(intDifferentData.getName());
        System.out.print(intDifferentData.getGender());

        // Modify values
        intDifferentData.setAge(22);
        intDifferentData.setWeight(58);
        intDifferentData.setGender('M');
        intDifferentData.setStudent(true);
        intDifferentData.setName("Akila");

        // Display new numbers values
        System.out.println(intDifferentData.getAge());
        System.out.println((int)intDifferentData.getWeight()); // I used cast operator

        // Display new others values
        System.out.print(intDifferentData.isStudent());
        System.out.print(intDifferentData.getName());
        System.out.print(intDifferentData.getGender());

        if(intDifferentData.getWeight() > intDifferentData.getAge()) // I used '<' operator and if-else condition
            System.out.println("My weight is higher than my age");
        else
            System.out.println("My age is higher than my weight");


        /* *****Exercise3***** */

        //  declaration IntLevelConst object
        IntLevelConst intLevelConst1 = new IntLevelConst();
        IntLevelConst intLevelConst2 = new IntLevelConst("Abel",23);
        IntLevelConst intLevelConst3 = new IntLevelConst("Akila",7,'M');

        // display information
        intLevelConst1.displayInfo();
        intLevelConst2.displayInfo();
        intLevelConst3.displayInfo();


    }
}