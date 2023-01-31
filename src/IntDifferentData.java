public class IntDifferentData {
    // class atributes
    private int age = 23;
    private double weight = 60;
    private boolean isStudent = false;
    private char gender = 'M';
    private String name = "Ngbandaman";

    /************************************************************************
     ************This part defines all getters for this class****************
     ************************************************************************/
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public double getWeight() {
        return weight;
    }
    /* ***********************************************************************
     **********************End of this part of getters***********************
     ************************************************************************/


    /* ***********************************************************************
     ************This part defines all setters for this class****************
     ************************************************************************/

    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudent(boolean student) {
        isStudent = student;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /* ***********************************************************************
     **********************End of this part of setters***********************
     ************************************************************************/
}
