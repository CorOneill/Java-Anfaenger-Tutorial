package javatutorial.kapitel6.listing30;

public class MethodeMitParameter {
    public static void main(String[] args){
 	/*
        Die Main-Methode ruft printMax(33, 45), printMax(100, 1), printMax(545641, 333) und printMax(-1000, 651) auf. 
        Es werden die höheren Werte ausgegeben.
        Ausgabe: 45, 100, 545641, 651
        */
        printMax(33, 45);
        printMax(100, 1);
        printMax(545641, 333);
        printMax(-1000, 651);
    }
    public static void printMax(int a, int b){
        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}