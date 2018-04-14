package javatutorial.kapitel5.listing11;

public class SchlechteVariablenbenennung {
    public static void main(String[] args) {
        double m = 1000;
        double s1 = 30, s2 = 50, s3 = 80;
        
        //Kinetische Energie: E = 1/2 * m * v^2
        //mit E = Kinetische Energie, m = Masse und v = Geschwindigkeit (Velocity)
        double kE1 = m *  (s1*s1);
        double kE2 = m *  (s2*s2);
        double kE3 = m *  (s3*s3);

        System.out.println("Kinetische Energie bei " + s1 + " km/h: " + kE1 + " J");
        System.out.println("Kinetische Energie bei " + s2 + " km/h: " + kE2 + " J");
        System.out.println("Kinetische Energie bei " + s3 + " km/h: " + kE3 + " J");
    }
}