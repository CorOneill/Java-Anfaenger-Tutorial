package exercise5.exercise3;

public class Wochentag {
    public static void main(String[] args) {
        int anzahlTage = 332;
        
        int wochentag = -1;
        /*TODO 1 : Mark Watney befindet sich seit 332 Tagen auf dem Mars und stellt
        * sich die Frage: "Welcher Wochentag ist heute."
        * Berechne im folgenden den Wochentag. Dabei speichert die Variable anzahlTage
        * die Anzahl an Tagen, die Mark Watney auf dem Mars ist.
        * Speicher den Wochentag in der Variable wochentag.
        * Dabei stehen die folgenden Zahlen für die folgenden Wochentage:
        * 0 = Montag, 1 = Dienstag, ... 6 = Samstag, 0 = Sonntag
        */
        
        //SCHREIBE ZWISCHEN HIER

        //UND HIER (Die Aufgabe kann in einer Zeile gelöst werden.)
             
        switch(wochentag){
            case 1 : {
                System.out.println("Montag");
                break;
            }
            case 2 : {
                System.out.println("Dienstag");
                break;
            }
            case 3 : {
                System.out.println("Mittwoch");
                break;
            }
            case 4 : {
                System.out.println("Donnerstag");
                break;
            }
            case 5 : {
                System.out.println("Freitag");
                break;
            }
            case 6 : {
                System.out.println("Samstag");
                break;
            }
            case 0 : {
                System.out.println("Sonntag");
                break;
            }
            default: {
                System.out.println("Kein valider Wochentag");
            }
        }
    }
}
