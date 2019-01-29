public class Main {

    public static void main(String[] args) {
	Igor igor1 = new Igor();
	if(igor1.OpenDeur()==false){
        System.out.println("Igor kan de deur niet open doen!");
    }
    else{
            System.out.println("Igor heeft de deur geopend!");
    }
    }
}
