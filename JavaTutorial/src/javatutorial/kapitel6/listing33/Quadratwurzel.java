package javatutorial.kapitel6.listing33;

public class Quadratwurzel {
    public static void main(String[] args) {
        squared(5);      //squared(int zahl)
        squared(5L);     //squared(long zahl)
        squared(5f);     //squared(float zahl)
        squared(5.0);    //squared(double zahl)
    }
    
    public static int squared(int zahl){
        return zahl * zahl;
    }
    
    public static long squared(long zahl){
        return zahl * zahl;
    }
    
    public static float squared(float zahl){
        return zahl * zahl;
    }
    
    public static double squared(double zahl){
        return zahl * zahl;
    }
}