package javatutorial.kapitel5.listing24;

public class PreAndPost {
    public static void main(String[] args) {
        int number1 = 5;
        // 5 wird ausgegeben
        System.out.println(number1++); 	
        // 6 wird ausgegeben
        System.out.println(number1);		

        int number2 = 5;
        // 6 wird ausgegeben
        System.out.println(++number2);	
    }
}
