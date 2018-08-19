package exercise4.exercise1;

public class Steckbrief {
    public static void main(String[] args) {
        /*TODO 1 : Erweitere die Klasse um die Variable id, die dieser Person eine
        * eindeutige Identifikationsnummer zuweisen soll. Die Variable soll vom Datentyp
        * long sein und mit dem Wert 2147483648 initialisiert werden. Was muss dabei beachtet
        * werden?
        */
        
        /*TODO 2 : Damit Speicherplatz gespart werden kann, sollen die Variablen groesse und
        * gewicht zu float Variablen umgeändert werden. Was ist dabei zu beachten?
        */
        
        short alter = 80;
        double groesse = 1.8, gewicht = 72.6;
        int gehalt = 5000;
        boolean arbeitslos = false;
        boolean tierliebhaber = true;
        char geschlecht = 'm';
        char lieblingsbuchstabe = 'g';               
        
        /*TODO 3 : Gib die Werte der Variablen anschließend auf der Konsole aus.
        */
        System.out.println("Alter: " + alter);
        System.out.println("Größe: " + groesse);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Gehalt: " + gehalt);
        System.out.println("Arbeitslos: " + arbeitslos);
        System.out.println("Tierliebhaber: " + tierliebhaber);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Lieblingsbuchstabe: " + lieblingsbuchstabe);    
    }
}
