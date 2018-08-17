package exercise3.solution1;

public class Steckbrief {
    public static void main(String[] args) {
        /*TODO 1 : Erweitere die Klasse um die Variablen geschlecht und lieblingsbuchstabe
        * und initialisiere diese entsprechend.
        */
        
        short alter = 80;
        double groesse = 1.8, gewicht = 72.6;
        int gehalt = 5000;
        boolean arbeitslos = false;
        boolean tierliebhaber = true;
        char geschlecht = 'm';
        char lieblingsbuchstabe = 'g';               
        
        /*TODO 2 : Gib die Werte der Variablen anschließend auf der Konsole aus.
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
