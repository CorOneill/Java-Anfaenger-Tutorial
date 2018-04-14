package javatutorial.kapitel5.listing11;

public class GuteVariablenbenennung {
    public static void main(String[] args) {
        double mass = 1000;
        double speed1 = 30, speed2 = 50, speed3 = 80;
        
        //Kinetische Energie: E = 1/2 * m * v^2
        //mit E = Kinetische Energie, m = Masse und v = Geschwindigkeit (Velocity)
        double kineticEnergy1 = mass *  (speed1*speed1);
        double kineticEnergy2 = mass *  (speed2*speed2);
        double kineticEnergy3 = mass *  (speed3*speed3);

        System.out.println("Kinetische Energie bei " + speed1 + " km/h: " + kineticEnergy1 + " J");
        System.out.println("Kinetische Energie bei " + speed2 + " km/h: " + kineticEnergy2 + " J");
        System.out.println("Kinetische Energie bei " + speed3 + " km/h: " + kineticEnergy3 + " J");
    }
}