package people;

public class Teacher extends Person {

    private String vak;

    public Teacher(String eyecolor, int age, double height, String vak) {
        super(eyecolor, age, height);
        this.vak = vak;
    }
    
    public void setVak(String v){
        vak = v;
    }

    public String getVak(){
        return vak;
    }

}
