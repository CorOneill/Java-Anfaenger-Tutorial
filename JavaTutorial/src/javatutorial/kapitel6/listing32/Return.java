package javatutorial.kapitel6.listing32;

public class Return {
    public static void main(String[] args){
 	printIfGreaterThanZero(33);
        printIfGreaterThanZero(-105);
        //Ausgabe: 33
    }
    public static void printIfGreaterThanZero(int a){
 	if(a <= 0)
            return;
 	else
            System.out.println(a);
    }
}