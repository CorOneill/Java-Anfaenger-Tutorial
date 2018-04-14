package javatutorial.kapitel5.listing9;

public class Variableninitialisierung {
    public static void main(String[] args) {
        int age = 32;
	boolean fullAged = true;
	double height = 2.10, weight = 75.56;
        
        System.out.println("Alter: " + age);           //Ausgabe: Alter: 32
        System.out.println("Volljährig: " + fullAged); //Ausgabe: Volljährig: true
        System.out.println("Größe: " + height);        //Ausgabe: Größe: 2.1
        System.out.println("Gewicht: " + weight);      //Ausgabe: Gewicht: 75.56
    }
}