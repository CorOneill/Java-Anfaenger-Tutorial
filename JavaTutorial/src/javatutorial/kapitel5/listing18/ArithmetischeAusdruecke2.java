package javatutorial.kapitel5.listing18;

public class ArithmetischeAusdruecke2 {
    public static void main(String[] args) {
        int summand1 = 5, summand2 = 5;
        /*
        Da in dem arithmetischen Ausdruck die Variable summand1 anstatt 
        eines Zahlenliterals  benutzt wird, ist dieser variabel. 
        Das hat den Vorteil, dass man den arithmetischen Ausdruck für
        mehr als nur eine Berechung verwenden kann.
        Bspw. könnte der Variabel summand 1 den Wert 6 zugewiesen werden.
        */
        summand1 = 6;
        int minuend = 5, subtrahend = 5;
        int faktor1 = 5, faktor2 = 5;
        int dividend = 5, divisor = 5;
        int dividendModulo = 65, divisorModulo = 10;
        
        System.out.println("+ = " + (summand1+summand2));
        System.out.println("- = " + (minuend-subtrahend));
        System.out.println("* = " + (faktor1*faktor2));
        System.out.println("/ = " + (dividend/divisor));
        
        System.out.println("+ - * / = " + 
                (summand1+summand2-faktor1*faktor2/divisor));
        
        System.out.println("% = " + (dividendModulo%divisorModulo));
    }
}