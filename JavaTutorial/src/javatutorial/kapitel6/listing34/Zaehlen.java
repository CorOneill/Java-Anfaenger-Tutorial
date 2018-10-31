package javatutorial.kapitel6.listing34;

public class Zaehlen {
    public static void main(String[] args) {
        zaehle(100);
        zaehle(50, 100);
    }
    
    public static void zaehle(int bis){
        for(int i = 0; i <= bis; i++){
            System.out.println("Zahl: " + i);
        }
    }
    
    public static void zaehle(int von, int bis){
        for(int i = von; i <= bis; i++){
            System.out.println("Zahl: " + i);
        }
    }
}