package javatutorial.kapitel5.listing19;

public class ArithmetischeAusdruecke3 {
    public static void main(String[] args) {
        int summand1 = 5, summand2 = 5;
        int minuend = 5, subtrahend = 5;
        int faktor1 = 5, faktor2 = 5;
        int dividend = 5, divisor = 5;
        int dividendModulo = 65, divisorModulo = 10;
        
        //Zuweisung der Ergebnisse von arithmetischen Ausdrücken
        int summe = summand1+summand2;
        int differenz = minuend-subtrahend;
        int produkt = faktor1*faktor2;
        int quotient = dividend/divisor;
        
        int ergebnis = summand1+summand2-faktor1*faktor2/divisor;
                
        int rest = dividendModulo%divisorModulo;
        
        System.out.println("+ = " + summe);
        System.out.println("- = " + differenz);
        System.out.println("* = " + produkt);
        System.out.println("/ = " + quotient);
        
        System.out.println("+ - * / = " + ergebnis);
        
        System.out.println("% = " + rest);
    }
}