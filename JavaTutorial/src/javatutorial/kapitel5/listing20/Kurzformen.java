package javatutorial.kapitel5.listing20;

public class Kurzformen {
    public static void main(String[] args) {
        //Langschreibweise
        int health = 50;
        double money = 100;

        health = health + 1;                //lang - Schlechter Heiltrank ;)
        money = money * 1.03;               //lang - Zinsen 3%
        
        //Kurzschreibweise
        health = 50;
        money = 100;

        health += 1;                        //kurz - Schlechter Heiltrank ;)
        money *= 1.03;                      //kurz - Zinsen 3%
    }
}