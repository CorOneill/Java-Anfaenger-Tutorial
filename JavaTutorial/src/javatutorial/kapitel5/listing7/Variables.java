package javatutorial.kapitel5.listing7;

public class Variables {
    public static void main(String[] args) {
        /*
        Hier werden vier Variablen deklariert und mit Werten initialisiert.
        Die Variable age wird bspw. mit dem Wert 80 initialisiert.
        */
        int age = 80;
        boolean deceased = false;
        double height = 1.86;
        char favoriteLetter = 'G';
        /*
        Hier passiert ein wenig Magic.
        Falls deceased true ist, dann wird die Variable to_be1 auf "war" gesetzt, sonst auf "bin".
        Falls deceased true ist, dann wird die Variable to_be2 auf "war" gesetzt, sonst auf "ist".
        */
        String to_be1 = deceased ? "war" : "bin";
        String to_be2 = deceased ? "war" : "ist";
        
        /*
        Hier werden die Variablen Ausgegeben, indem sie mit String Literalen und untereinander 
        konkatiniert werden.
        */
        System.out.println("Ich bin " + age + " Jahre alt. Außerdem " + to_be1 + " ich " 
                            + height + " Meter groß und mein Lieblingsbuchstabe " 
                            + to_be2 + " " + favoriteLetter + ".");
        //Ausgabe: Ich bin 80 Jahre alt. Außerdem bin ich 1.86 Meter groß und mein Lieblingsbuchstabe ist G.
        
        /*
        Den Variablen age und deceased werden neue Werte zugewiesen.
        */
        age = 81;
        deceased = true;
        
        /*
        Die Variablen to_be1 und to_be2 werden aktualisiert.
        Da deceased jetzt true ist werden to_be1 und to_be2 auf "war" gesetzt.
        Dies ist auf in der letzten Konsolenausgabe zu sehen
        */
        to_be1 = deceased ? "war" : "bin";
        to_be2 = deceased ? "war" : "ist";
        
        /*
        Veränderte Variablen werden erneut ausgegeben.
        */
        System.out.println("Ich bin " + age + " Jahre alt. Außerdem " + to_be1 + " ich " 
                            + height + " Meter groß und mein Lieblingsbuchstabe " 
                            + to_be2 + " " + favoriteLetter + ".");
        //Ausgabe: Ich bin 81 Jahre alt. Außerdem war ich 1.86 Meter groß und mein Lieblingsbuchstabe war G.
    }
}
