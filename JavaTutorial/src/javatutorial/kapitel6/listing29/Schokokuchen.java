package javatutorial.kapitel6.listing29;

public class Schokokuchen {
    public static int ZUTAT_ZUCKER = 0;
    public static int ZUTAT_VANILLEZUCKER = 1;
    public static int ZUTAT_MEHL = 2;
    public static int ZUTAT_BACKPULVER = 3;
    public static int ZUTAT_KAKAOPULVER = 4;
    public static int ZUTAT_OEL = 5;
    public static int ZUTAT_SOJADRINK = 6;
    public static int ZUTAT_WASSER = 7;
    public static int ZUTAT_SCHOKOLADE = 8;
    
    public static void main(String[] args) {
        zutatHinzufuegen(ZUTAT_ZUCKER);
        zutatHinzufuegen(ZUTAT_VANILLEZUCKER);
        zutatHinzufuegen(ZUTAT_MEHL);
        zutatHinzufuegen(ZUTAT_BACKPULVER);
        zutatHinzufuegen(ZUTAT_KAKAOPULVER);
        verruehren();
        zutatHinzufuegen(ZUTAT_OEL);
        zutatHinzufuegen(ZUTAT_SOJADRINK);
        zutatHinzufuegen(ZUTAT_WASSER);
        verruehren();
        zutatHinzufuegen(ZUTAT_SCHOKOLADE);
        verruehren();
        teigInFormGeben();
        backen(175, 60);
    }
    
    public static void zutatHinzufuegen(int zutat){
        //1. Packung nehmen
        //2. Packung öffnen
        //3. Zutat hinzufügen
        //4. Packung wegstellen
        System.out.println("ZUTAT: " + zutat + " wurde hinzugefügt.");
    }

    public static void verruehren() {
        //1. Schneebesen nehmen
        //2. Verrühren
        //3. Schneebesen weglegen
        System.out.println("Verrührt");
    }

    public static void teigInFormGeben(){
        //1. Form fetten
        //2. Teig in Form geben
        System.out.println("Teig wurde in die Form gegeben.");
    }
    
    public static void backen(int grad, int backzeit) {
        //1. Ofen vorheizen
        //2. Form in den Ofen stellen
        //3. Temperature (Grad) einstellen
        //4. Zeit stellen
        //5. Kuchen rausnehmen
        System.out.println("Der Kuchen wurde bei " + grad + "°C " + backzeit + " Minuten gebacken.");
    }
}
