package javatutorial.kapitel5.listing14;

public class SpezielleZeichenliterale {
    public static void main(String[] args) {        
        char singleQuote = '\'', doubleQuote = '\"', backslash = '\\';
        System.out.println(singleQuote + " " + doubleQuote + " " + backslash); //Ausgabe: ' " \
        System.out.println("->\t<-"); //Ausgabe: ->	<-
        System.out.println("abcd\b\b\b"); //Ausgabe: a
        System.out.println("Sehr geehrte/r Leser/in, \n Text Text Text");
        //Sehr geehrte/r Leser/in, 
        //Text Text Text        
        System.out.println("Hello \r World"); //Ausgabe: World
    }
} 