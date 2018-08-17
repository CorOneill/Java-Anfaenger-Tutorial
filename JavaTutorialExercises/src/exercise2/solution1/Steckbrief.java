package exercise2.solution1;

public class Steckbrief {
    /*TODO 1 : Erweitere die Klasse um eine main Methode.
    */
    public static void main(String[] args) {
        /*TODO 2 : Deklariere und initialisiere die folgenden Variablen: 
        * (alter, groesse, gewicht, gehalt, arbeitslos und tierliebhaber). 
        * Verwende dafür die passenden Datentypen und deine persönlichen Daten. 
        * Benutze für die Variablen groesse und gewicht den Datentyp double.
        */
        
        short alter = 80;
        double groesse = 1.8, gewicht = 72.6;
        int gehalt = 5000;
        boolean arbeitslos = false;
        boolean tierliebhaber = true;
                
        /*TODO 3 : Gib die Werte der Variablen anschließend auf der Konsole aus.
        */
        System.out.println("Alter: " + alter);
        System.out.println("Größe: " + groesse);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Gehalt: " + gehalt);
        System.out.println("Arbeitslos: " + arbeitslos);
        System.out.println("Tierliebhaber: " + tierliebhaber);
    }
}
