package javatutorial.kapitel5.listing21;

public class Vorzeichen {
    public static void main(String[] args) {
        int ergebnis1 = -5 + -4;
        int ergebnis2 = +5 - -4;
        int ergebnis3 = -5 / +5 * -9;
        int ergebnis4 = +1 + -2 + +2 + -3 + +4 + -5;
        int ergebnis5 = +ergebnis1 - -ergebnis2 - +ergebnis3 - -ergebnis4;
        
        System.out.println("Ergebnis 1: " + ergebnis1);//Ausgabe: "Ergebnis 1: -9"
        System.out.println("Ergebnis 2: " + ergebnis2);//Ausgabe: "Ergebnis 2: 9"
        System.out.println("Ergebnis 3: " + ergebnis3);//Ausgabe: "Ergebnis 3: 9"
        System.out.println("Ergebnis 4: " + ergebnis4);//Ausgabe: "Ergebnis 4: -3"
        System.out.println("Ergebnis 5: " + ergebnis5);//Ausgabe: "Ergebnis 5: -12"
        
        //Bitte Bitte Bitte nicht!!! IMMER leserlich schreiben!!!
        int ergebnis6 = - 5 + - 4 + - 65 + - ergebnis3 / + 56;
    }
}