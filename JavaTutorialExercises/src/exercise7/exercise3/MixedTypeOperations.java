package exercise7.exercise3;

public class MixedTypeOperations {
    public static void main(String[] args) {
        /*TODO 1 : Betrachte die Variablen zahl1 - zahl9 und überlege,
        * welche Datentypen (int, long, float, double) diese durch die
        * Literale/Arithmetischen Operationen annehmen. Ignoriere dabei
        * einfach das Schlüsselwort Object.
        */
        Object zahl1 = 5;
        Object zahl2 = 5L;
        Object zahl3 = 5f;
        Object zahl4 = 5.0;
        
        Object zahl5 = 5+5.0*10f;
        Object zahl6 = 5L+5*10;
        Object zahl7 = 5.0+5*10;
        Object zahl8 = 5+5*10;
        
        byte zahlByte = 10;
        short zahlShort = 20;
        
        Object zahl9 = zahlByte + zahlShort;
        
        System.out.println(zahl1.getClass().getName());
        System.out.println(zahl2.getClass().getName());
        System.out.println(zahl3.getClass().getName());
        System.out.println(zahl4.getClass().getName());
        System.out.println(zahl5.getClass().getName());
        System.out.println(zahl6.getClass().getName());
        System.out.println(zahl7.getClass().getName());
        System.out.println(zahl8.getClass().getName());
        System.out.println(zahl9.getClass().getName());
    }
}
