package exercise5.solution1;

public class Noten {
    public static void main(String[] args) {
        int note1 = 1, note2 = 3, note3 = 6, note4 = 2, note5 = 1;
        /*TODO 1 : Berechne die Summe der Noten und speichere diese
        * in der Variable summeNoten. Wähle dafür den Datentypen float.
        */
        float summeNote = note1 + note2 + note3 + note4 + note5;
        
        /*TODO 2 : Berechne den Durchschnitt der Noten. Wähle dafür den 
        * Datentypen float. Gib den Durchschnitt anschließend auf der 
        * Konsole aus.
        * Durchschnitt = (note1 + ... + note5)/(Anzahl der Noten)
        */
        float durchschnittNoten = summeNote/5;
        System.out.println("Durschnitt: " + durchschnittNoten);
        
        /*TODO 3 : Weise den Variablen note1 bis note5 beliebige
        * neue Werte zu. Berechne dann abermals den Durchschnitt
        * und weise das Ergebnis der Variable durchschnittNoten
        * zu. Gib anschließend den Durchschnitt auf der Konsole aus.
        */
        
        note1 = 5; note2 = 2; note3 = 1; note4 = 5; note5 = 4;
        durchschnittNoten = (note1 + note2 + note3 + note4 + note5)/5;
        System.out.println("Durschnitt: " + durchschnittNoten);
        
    }
}
