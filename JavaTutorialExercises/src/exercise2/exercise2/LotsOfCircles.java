package exercise2.exercise2;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class LotsOfCircles extends Application{

    private double width = 720, height = 480;
    
    private Group circles = new Group();  

    @Override
    public void init() throws Exception {
        /*
        TODO 1 : Deklariere die folgenden Variablen : numberCircles (int), maxRadius (double),
        randomRadius (boolean) und randomColor (boolean).
        Initialisiere die Variablen mit verschiedenen Werten und führe das Programm 
        (nachdem du TO-DO 2 abgeschlossen hast) mehrmals aus, um die Auswirkungen der
        unterschiedlichen Werte zu sehen.
        */

        /*
        TODO 2 : Entkommentiere den folgenden Quellcode und führe das Programm aus. 
        */
        
        /*    
        for(int i = 1; i <= numberCircles; i++){
            double radius = randomRadius ? Math.random()*maxRadius : maxRadius;
            Circle circle = new Circle(Math.random()*width, Math.random()*height, radius);
            String color = "000000";
            if(randomColor){
                Random rnd = new Random();
                color = String.valueOf(rnd.nextInt(9))+String.valueOf(rnd.nextInt(9))+String.valueOf(rnd.nextInt(9))+
                        String.valueOf(rnd.nextInt(9)+String.valueOf(rnd.nextInt(9))+String.valueOf(rnd.nextInt(9)));
            }
            circle.setFill(Paint.valueOf(color));
            circles.getChildren().add(circle);
        }
        */
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, width, height);
        primaryStage.setTitle("Übung");        
        primaryStage.setScene(scene);

        root.getChildren().add(circles);
        
        primaryStage.show();    
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}