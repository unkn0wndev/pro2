import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Monster[] monsters = {
                new Monster("Brian",3),new Monster("Jan",2),new Monster("Peter",4),new Monster("Pim",2),new Monster("Tessa",5),
        };

        Scanner sc = new Scanner(System.in);
        int counter = monsters.length;

        while(counter>0){
            System.out.print("Welk van de volgende monsters val je aan? (Type 'attack [monster]): ");
            for(int i=0;i<monsters.length;i++){
                if(monsters[i]!=null){
                    if(i<monsters.length-1){
                        System.out.print(monsters[i].getName()+", ");
                    }
                    else {
                        System.out.print(monsters[i].getName()+".\n");
                    }
                }
            }
            String scString = sc.nextLine();
            String[] stringArray = scString.split(" ");
            String tempString = stringArray[1];

            for(int i=0;i<monsters.length;i++){
                if(monsters[i]!=null){
                    if(tempString.equalsIgnoreCase(monsters[i].getName())){
                        if(monsters[i].Hit()==true){
                            System.out.println(monsters[i].getName() + " heeft nog maar " + monsters[i].getHealth() + " levenspunten over!\n");
                        }
                        else{
                            System.out.println(monsters[i].getName() + " is gedood!\n");
                            monsters[i]=null;
                            counter--;
                        }
                    }
                }
            }
        }
        System.out.println("Gewonnen!");
    }
}
