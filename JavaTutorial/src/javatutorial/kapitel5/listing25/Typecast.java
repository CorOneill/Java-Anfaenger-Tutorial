package javatutorial.kapitel5.listing25;

public class Typecast {
    public static void main(String[] args) {
        //Umwandlung: float-Wert -> int-Wert.
        int intVal = (int) 50000.6f;
        //Umwandlung: double-Wert -> float-Wert.
        float floatVal = (float) 5.6;
        //Umwandlung: int-Wert -> short-Wert.
        short shortVal = (short) intVal;
        //Umwandlung: double-Wert -> long-Wert.
        long longVal = (long) floatVal;
        //Ausgabe: "Int: 50000, Float: 5.6, Short: -15536, Long: 5"
        System.out.println("Int: " + intVal + ", Float: " + floatVal + ", Short: " + shortVal + ", Long: " + longVal);
    }
}