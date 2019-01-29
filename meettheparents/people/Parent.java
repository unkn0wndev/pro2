package people;

public class Parent extends Person{
    private String name;

    public Parent(String eyecolor, int age, double height, String name) {
        super(eyecolor, age, height);
        this.name = name;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}
