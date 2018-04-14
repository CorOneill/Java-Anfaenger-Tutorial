package javatutorial.kapitel5.listing17;

public class ArithmetischeAusdruecke2 {
    public static void main(String[] args) {
        int summand1 = 5, summand2 = 5;
        int minuend = 5, subtrahend = 5;
        int faktor1 = 5, faktor2 = 5;
        int dividend = 5, divisor = 5;
        int dividendModulo = 65, divisorModulo = 10;
        
        System.out.println("+ = " + (summand1+summand2));
        System.out.println("- = " + (minuend-subtrahend));
        System.out.println("* = " + (faktor1*faktor2));
        System.out.println("/ = " + (dividend/divisor));
        
        System.out.println("+ - * / = " + (summand1+summand2-faktor1*faktor2/divisor));
        
        System.out.println("% = " + (dividendModulo%divisorModulo));
    }
}