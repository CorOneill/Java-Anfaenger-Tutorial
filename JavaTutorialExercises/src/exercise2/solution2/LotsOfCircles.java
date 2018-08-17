package exercise2.solution2;

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
        int numberCircles = 1000;
        double maxRadius = 10;
        boolean randomRadius = true;
        boolean randomColor = true;
        

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