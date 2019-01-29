import java.util.Scanner;

public class Main {
    private static boolean runBool = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] onderdelen = new String[3];
        double[] antwoordArray = new double[3];
        System.out.println("Simple calculator opdracht door Tim van Osch");
        System.out.println("           ");
        System.out.println("Welkom bij de calculator. Je kunt optellen, aftrekken, keer, delen en modulo uitrekenen.");
        System.out.println("Zeg 'stop' als je wilt stoppen met berekenen.");

        while(runBool == true){
            String temp = sc.nextLine().toLowerCase();
            if(temp.contains("optellen")){
                onderdelen = temp.split("optellen");
                for(int i=0;i<onderdelen.length; i++){ antwoordArray[i] = Double.valueOf(onderdelen[i]); }
                System.out.println(antwoordArray[0]+" + "+antwoordArray[1]+" = "+optelFunctie(antwoordArray));
            }
            else if(temp.contains("aftrekken")){
                onderdelen = temp.split("aftrekken");
                for(int i=0;i<onderdelen.length; i++){ antwoordArray[i] = Double.valueOf(onderdelen[i]); }
                System.out.println(antwoordArray[0]+" - "+antwoordArray[1]+" = "+aftrekFunctie(antwoordArray));
            }
            else if(temp.contains("keer")){
                onderdelen = temp.split("keer");
                for(int i=0;i<onderdelen.length; i++){ antwoordArray[i] = Double.valueOf(onderdelen[i]); }
                System.out.println(antwoordArray[0]+" * "+antwoordArray[1]+" = "+keerFunctie(antwoordArray));
            }
            else if(temp.contains("delen")){
                onderdelen = temp.split("delen");
                for(int i=0;i<onderdelen.length; i++){ antwoordArray[i] = Double.valueOf(onderdelen[i]); }
                System.out.println(antwoordArray[0]+" / "+antwoordArray[1]+" = "+deelFunctie(antwoordArray));
            }
            else if(temp.contains("modulo")){
                onderdelen = temp.split("modulo");
                for(int i=0;i<onderdelen.length; i++){ antwoordArray[i] = Double.valueOf(onderdelen[i]); }
                System.out.println(antwoordArray[0]+" % "+antwoordArray[1]+" = "+moduloFunctie(antwoordArray));
            }
            else if(temp.contains("stop")){
                runBool = false;
            }
        }
        System.out.println("Tot ziens!");
    }

    public static double optelFunctie(double[] d){
        double result = d[0]+d[1];
        return result;
    }
    public static double aftrekFunctie(double[] d){
        double result = d[0]-d[1];
        return result;
    }
    public static double keerFunctie(double[] d){
        double result = d[0]*d[1];
        return result;
    }
    public static double deelFunctie(double[] d){
        double result = d[0]/d[1];
        return result;
    }
    public static double moduloFunctie(double[] d){
        double result = d[0]%d[1];
        return result;
    }
}
