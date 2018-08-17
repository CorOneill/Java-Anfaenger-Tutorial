package exercise3.solution2;

import exercise3.exercise2.*;

public class Kodierung {
    /*TODO 1 : Erweitere die Klasse um eine main Methode.
    */
    public static void main(String[] args) {    
        /* TODO 2 : Deklariere fünf char-Variablen für die Zeichen 
        * [\#, h, H, -, :]. Initialisiere diese Variablen dann mit 
        * Ganzzahlen. Um die Ganzzahlen zu ermitteln, die die genannten 
        * Zeichen kodieren, kannst du eine Unicode Tabelle benutzen.
        * Unicode Tabelle: http://unicode-table.com/de/
        */
        char zeichen1 = 35;
        char zeichen2 = 104;
        char zeichen3 = 72;
        char zeichen4 = 95;
        char zeichen5 = 58;
        
        /* TODO 3 : Gib die Variablen anschließend auf der Konsole aus.
        */
        System.out.println("Zeichen 1: " + zeichen1);
        System.out.println("Zeichen 2: " + zeichen2);
        System.out.println("Zeichen 3: " + zeichen3);
        System.out.println("Zeichen 4: " + zeichen4);
        System.out.println("Zeichen 5: " + zeichen5);
    }
}
