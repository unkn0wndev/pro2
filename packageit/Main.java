import fastfood.Hamburger;
import fastfood.Nuggets;
import fastfood.Patat;
import gezond.Brood;
import gezond.Salade;
import koud.Boterham;
import koud.Stokbrood;
import warm.Stampot;
import warm.vlees.Frikandel;
import warm.vlees.Mexicano;

public class Main {

    public static void main(String[] args) {
        Patat n1 = new Patat();
        Hamburger n2 = new Hamburger();
        Salade n3 = new Salade();
        Brood n4 = new Brood();
        Boterham n5 = new Boterham();
        Nuggets n6 = new Nuggets();
        Mexicano n7 = new Mexicano();
        Stampot n8 = new Stampot();
        Stokbrood n9 = new Stokbrood();
        Frikandel n10 = new Frikandel();

        n1.setName("patat");
        n2.setName("hamburger");
        n8.setName("stampot");

        System.out.println(n1.getName());
    }
}
