package exercise6.solution1;

public class InkrementUndDekrement {
    public static void main(String[] args) {
        /*
        LÖSUNG:
            Zahl 1: 5, Zahl 2: 0, Zahl 3: 0
            Zahl 1: 4, Zahl 2: 4, Zahl 3: 0
            Zahl 1: 3, Zahl 2: 4, Zahl 3: 4
        */
        
        int zahl1 = 5, zahl2 = 0, zahl3 = 0;
        /*TODO 1 : Betrachte die Variablen zahl1, zahl2 und zahl3 und überlege dir, welche Werte 
        * diese Variablen annehmen.
        */
        System.out.println("Zahl 1: " + zahl1 + ", Zahl 2: " + zahl2 + ", Zahl 3: " + zahl3);
        
        /*TODO 2 : Betrachte die erste Dekrement Operationen und überlege dir, welche Werte 
        * die Variablen zahl1, zahl2 und zahl3 annehmen.
        */
        zahl2 = --zahl1;
        System.out.println("Zahl 1: " + zahl1 + ", Zahl 2: " + zahl2 + ", Zahl 3: " + zahl3);
        
        /*TODO 3 : Betrachte die zweite Dekrement Operationen und überlege dir, welche Werte 
        * die Variablen zahl1, zahl2 und zahl3 annehmen.
        */
        zahl3 = zahl1--;
        System.out.println("Zahl 1: " + zahl1 + ", Zahl 2: " + zahl2 + ", Zahl 3: " + zahl3);
    }
}
