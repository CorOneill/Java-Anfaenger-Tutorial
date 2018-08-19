package nope;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RPG {
    public static void main(String[] args) {
        final float sekunden = 3;
        
        float ersterKaempferLeben = 100f;
        float zweiterKaempferLeben = 100f;
        float ersterKaempferSchaden = ((float)(Math.random() * 5))+5;
        float zweiterKaempferSchaden = ((float)(Math.random() * 5))+5;
                
        System.out.println("Kämpfer 1");
        System.out.println("\tLeben: " + ersterKaempferLeben);
        System.out.println("\tSchaden: " + ersterKaempferSchaden);
        System.out.println("Kämpfer 2");
        System.out.println("\tLeben: " + zweiterKaempferLeben);
        System.out.println("\tSchaden: " + zweiterKaempferSchaden);
        warte(sekunden);
        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("Vorbereitungsrunde");
        warte(sekunden);
        System.out.println("Kämpfer 1 trinkt \"Großer Trank des Lebens\": +20 Leben");
        /*TODO 1 : Erhöhe das Leben von Kämpfer 1 um 20.
        */
        ersterKaempferLeben += 20;
        warte(sekunden);
        System.out.println("Kämpfer 2 schärft seine Waffe: +1 Schaden");
        /*TODO 2 : Erhöhe den Schaden von Kämpfer 2 um 1.
        */
        zweiterKaempferSchaden += 1;
        warte(sekunden);
        System.out.println("Kämpfer 1");
        System.out.println("\tLeben: " + ersterKaempferLeben);
        System.out.println("\tSchaden: " + ersterKaempferSchaden);
        System.out.println("Kämpfer 2");
        System.out.println("\tLeben: " + zweiterKaempferLeben);
        System.out.println("\tSchaden: " + zweiterKaempferSchaden);
        
        warte(sekunden);
        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("KAMPF beginnt in...");
        warte(sekunden);
        System.out.println("3");
        warte(sekunden);
        System.out.println("2");
        warte(sekunden);
        System.out.println("1");
        warte(sekunden);
        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("Runde 1");
        warte(sekunden);
        System.out.println("Kämpfer 1 greift Kämpfer 2 an: Kämpfer 2 erleidet " + ersterKaempferSchaden + " Schaden");
        /*TODO 3 : Kämpfer 2 erleidet Schaden (ersterKaempferSchaden).
        */
        zweiterKaempferLeben -= ersterKaempferSchaden;
        warte(sekunden);
        System.out.println("Kämpfer 2 greift Kämpfer 1 an: Kämpfer 1 erleidet " + zweiterKaempferSchaden + " Schaden");
        /*TODO 2 : Kämpfer 1 erleidet Schaden (zweiterKaempferSchaden).
        */
        ersterKaempferLeben -= zweiterKaempferSchaden;
        warte(sekunden);
        System.out.println("Kämpfer 1");
        System.out.println("\tLeben: " + ersterKaempferLeben);
        System.out.println("\tSchaden: " + ersterKaempferSchaden);
        System.out.println("Kämpfer 2");
        System.out.println("\tLeben: " + zweiterKaempferLeben);
        System.out.println("\tSchaden: " + zweiterKaempferSchaden);
        
        System.out.println("-------------------------------------------------------------------------");
        
        warte(sekunden);
        
        System.out.println("Ende Runde 1");
        
        warte(sekunden);
        System.out.println("...");
        warte(sekunden);
        System.out.println("......");
        warte(sekunden);
        System.out.println(".........");
        warte(sekunden);
        System.out.println("............");
    }
    
    public static void warte(float sekunden){
        try {
            Thread.sleep((long) (sekunden * 1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(RPG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
