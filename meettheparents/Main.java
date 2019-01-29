import people.Student;
import people.Teacher;

public class Main {

    public static void main(String[] args) {

        Student jan = new Student("blue",18,1.8,5);
        Teacher henk = new Teacher("green", 43,1.7,"English");
        System.out.println(jan.getAge());
        System.out.println(henk.getVak());
    }
}
