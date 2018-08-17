package javatutorial.kapitel5.listing16;

public class Variablenzuweisung {
    public static void main(String[] args) {
        boolean fullAged = false;           //Deklaration und Initialisierung von fullAged
        double height = 1.79;               //Deklaration und Initialisierung von height

        fullAged = true;                    //Wertzuweisung
        height = 1.85;                      //Wertzuweisung
        
        System.out.println("Volljährig: " + fullAged); //Ausgabe: Volljährig: true
        System.out.println("Größe: " + height); //Ausgabe: Größe: 1.85
    }
}