package exercise4.solution1;

public class Steckbrief {
    public static void main(String[] args) {
        short alter = 80;
        char geschlecht = 'm';
        float groesse = 1.8f, gewicht = 72.6f;
        
        int gehalt = 5000;
        
        char lieblingsbuchstabe = 'g';
        long lieblingszahlGroesser5Mrd = 6000000000L;
               
        boolean arbeitslos = false;
        boolean tierliebhaber = true;
        
        System.out.println("Alter: " + alter);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Größe: " + groesse);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Gehalt: " + gehalt);
        System.out.println("Lieblingsbuchstabe: " + lieblingsbuchstabe);
        System.out.println("Lieblingszahl (Größer als 5 Milliarden): " + lieblingszahlGroesser5Mrd);
        System.out.println("Arbeitslos: " + arbeitslos);
        System.out.println("Tierliebhaber: " + tierliebhaber);
    
    }
}
