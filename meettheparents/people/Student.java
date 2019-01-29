package people;

public class Student extends Person {
    private int classroom;

    public Student(String eyecolor, int age, double height, int classroom) {
        super(eyecolor, age, height);
        this.classroom = classroom;
    }

    public void setClassroom(int c){
        classroom = c;
    }

    public int getClassroom(){
        return classroom;
    }
}
