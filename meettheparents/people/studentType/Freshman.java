package people.studentType;

import people.Student;

public class Freshman extends Student {
    private boolean isExperienced;

    public Freshman(String eyecolor, int age, double height, int classroom, boolean isExperienced) {
        super(eyecolor, age, height, classroom);
        this.isExperienced = isExperienced;
    }

    public void setExperienced(boolean b){
        isExperienced=b;
    }

    public boolean getExperienced(){
        return isExperienced;
    }

}
