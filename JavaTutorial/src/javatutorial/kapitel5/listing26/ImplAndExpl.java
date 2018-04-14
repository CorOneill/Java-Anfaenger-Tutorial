package javatutorial.kapitel5.listing26;

public class ImplAndExpl {
    public static void main(String[] args) {
        //Implizite Typumwandlung
        byte byteVal = 6;
        short shortVal = byteVal;
        int intVal = shortVal;
        long longVal = intVal;
        float floatVal = longVal;
        double doubleVal = floatVal;
        System.out.println(byteVal + ", " + shortVal + ", " + intVal + ", " 
                            + longVal + ", " + floatVal + ", " + doubleVal);
        //Explizite Typumwandlung
        floatVal = (float) doubleVal;
        longVal = (long) floatVal;
        intVal = (int) longVal;
        shortVal = (short) intVal;
        byteVal = (byte) shortVal;
        System.out.println(byteVal + ", " + shortVal + ", " + intVal + ", " 
                            + longVal + ", " + floatVal + ", " + doubleVal);
    }
}