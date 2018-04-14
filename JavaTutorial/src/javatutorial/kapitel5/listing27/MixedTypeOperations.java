package javatutorial.kapitel5.listing27;

public class MixedTypeOperations {
    public static void main(String[] args) {
        System.out.println((5/2));//Ausgabe: "2"
        System.out.println((5/2.0));//Ausgabe: "2.5"
        System.out.println((5.0/2.0));//Ausgabe: "2.5"
        System.out.println((5/2.0));//Ausgabe: "2.5""
        
        int age1 = 10, age2 = 15, age3 = 33, age4 = 60, age5 = 65;
        int numberAges = 5;
        double avgAge1 = (age1+age2+age3+age4+age5)/numberAges;
        System.out.println("Durschnittsalter_1: " + avgAge1);//Ausgabe: "36"
        double avgAge2 = (age1+age2+age3+age4+age5)/(double) numberAges;
        System.out.println("Durschnittsalter_2: " + avgAge2);//Ausgabe: "36.6"
    }
}