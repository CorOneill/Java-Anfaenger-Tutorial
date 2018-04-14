package javatutorial.kapitel5.listing22;

public class Klammern {
    public static void main(String[] args) {
        int withoutBrackets = 5 + 6 * 5;
        int withBrackets = (5 + 6) * 5;   
        
        //Auswertungsreihenfolge: 5 + 6 * 5 = 5 + 30 = 35
        //Ausgabe: "Without Brackets: 35"
        System.out.println("Without Brackets: " + withoutBrackets);
        
//Auswertungsreihenfolge: (5 + 6) * 5 = 11 * 5 = 55
        //Ausgabe: "With Brackets: 55"
        System.out.println("With Brackets: " + withBrackets);
    }   
}