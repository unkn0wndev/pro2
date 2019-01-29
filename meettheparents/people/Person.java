package people;

public class Person {

    private String eyecolor;
    private int age;
    private double height;

    public Person (String eyecolor, int age, double height){
        this.eyecolor = eyecolor;
        this.age = age;
        this.height = height;
    }

    public void setEyecolor(String s){
        eyecolor = s;
    }
    public String getEyecolor(){
        return eyecolor;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }

}
