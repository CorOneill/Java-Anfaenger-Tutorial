package exercise5.solution2;

public class Aufgaben {
    public static void main(String[] args) {
        /*
        ERGEBNISSE: 
            ergebnis1 = 6
            ergebnis2 = 2
            ergebnis3 = 6.0
            ergebnis4 = -16.0
            ergebnis5 = 10.0
        */
        
        //TODO 1 : Berechne den Wert von Ergebnis 1.
        int ergebnis1;
        ergebnis1 = 10;
        ergebnis1 += 5;
        ergebnis1 = ergebnis1 * 2;
        ergebnis1 /= 5;
        System.out.println("Ergebnis 1 : " + ergebnis1);
        
        //TODO 2 : Berechne den Wert von Ergebnis 2.
        int ergebnis2 = 1 + 2 + 3 + -1 + -2;
        ergebnis2 = ergebnis2 * 4;
        ergebnis2 %= 10;
        System.out.println("Ergebnis 2 : " + ergebnis2);
        
        //TODO 3 : Berechne den Wert von Ergebnis 3.
        float ergebnis3;
        float zahl1 = 2f, zahl2 = 0.5f, zahl3 = 1.5f;
        ergebnis3 = zahl2 + zahl3 + zahl1 * zahl1;
        System.out.println("Ergebnis 3 : " + ergebnis3);
        
        //TODO 4 : Berechne den Wert von Ergebnis 4.
        float ergebnis4;
        ergebnis4 = 2*(-zahl3 * zahl1 + -zahl2 * zahl1) / 2*(zahl1 + zahl1);
        System.out.println("Ergebnis 4 : " + ergebnis4);
        
        //TODO 5 : Berechne den Wert von Ergebnis 5.
        float ergebnis5 = -90;
        ergebnis5 += (55 % 10) * 10 + 0.5f * 50 + (10 + 2.5f) * 2 ;
        System.out.println("Ergebnis 5 : " + ergebnis5);
        
        /*TODO 6 : Führe das Program aus und überprüfe, ob du die richtigen
        * Lösungen hast.
        */
    }
}
