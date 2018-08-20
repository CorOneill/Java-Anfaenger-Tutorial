package exercise7.solution1;

public class NotenReloaded {
    public static void main(String[] args) {
        int note1 = 1, note2 = 3, note3 = 6, note4 = 2, note5 = 1;
        int summeNoten = note1 + note2 + note3 + note4 + note5;
        
        /*TODO 1 : Berechne abermals den Durchschnittswert der Noten. Beachte, 
        * dass die Variable summeNoten ein Integer ist. Gib den Durchschnitt
        * anschließend auf der Konsole aus.
        */
        
        float durchschnittNoten = (float) summeNoten / 5;
        //float durchschnittNoten =  summeNoten / (float) 5;
        //float durchschnittNoten = summeNoten / 5f;        
        System.out.println("Durschnitt: " + durchschnittNoten);
        
    }
}
