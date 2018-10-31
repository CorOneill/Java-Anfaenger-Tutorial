package javatutorial.kapitel6.listing31;

public class Funktion {
    public static void main(String[] args){
 	int max = printMax(33, 45);
        System.out.println("Die höhere Zahl ist: " + max);
    }
    public static int printMax(int a, int b){
 	if(a > b)
            return a;
 	else
            return b;
    }
}