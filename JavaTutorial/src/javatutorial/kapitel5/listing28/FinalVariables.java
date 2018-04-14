package javatutorial.kapitel5.listing28;

public class FinalVariables {
    public static void main(String[] args) {
        final char gender = 'm';
        
        //Eine Wertzuweisung führt zu einem Error, da die Variable gender unveränderbar ist.
        //gender = 'f';
        
        final float gravityOfEarth;
        gravityOfEarth = 9.81f;
        
        //Eine Wertzuweisung führt zu einem Error, da die Variable gravityOfEarth unveränderbar ist.
        //gravityOfEarth = 5.123;
    }
}