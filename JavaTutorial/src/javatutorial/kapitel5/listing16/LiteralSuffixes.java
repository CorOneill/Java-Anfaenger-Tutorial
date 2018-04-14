package javatutorial.kapitel5.listing16;

public class LiteralSuffixes {
    public static void main(String[] args) {
        /*
        Maximaler integer Wert: 2147483647 
        Hier funktioniert noch alles einwandfrei, da das Ganzzahlliteral implizit in ein long umgewandelt wird.
        Mehr dazu im Kapitel Implizite und explizite Typumwandlung
        */
        long longNumber = 2147483647;
        //longNumber = 2147483648; //ERROR -> Das Ganzzahlliteral überschreitet den Wertebereich von int
        longNumber = 2147483648L; //Es muss das Literal Suffix L/l angehängt werden. 
        //float floatNumber = 1.23; // ERROR -> 1.23 ist ein Double-Literal
        float floatNumber = 1.23f; // Es muss das Literal Suffix F/f angehängt werden. 
    }
}