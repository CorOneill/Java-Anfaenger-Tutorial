/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author MKort
 */
public class FX extends Application{

    private Label label;
    private Circle circle;

    @Override
    public void init() throws Exception {
        label = new Label("Hello World"); 
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        HBox hBox = new HBox();
        root.setTop(hBox);
        TextField fieldX = new TextField();
        TextField fieldY = new TextField();
        Button button = new Button("Bewege Kreis");
        hBox.getChildren().add(fieldX);
        hBox.getChildren().add(fieldY);
        hBox.getChildren().add(button);
        
        Pane stackPane = new Pane();
        String enteredByUser = "abcdef";
        stackPane.setStyle("-fx-background-color: #" + enteredByUser);
        
        root.setCenter(stackPane);
        //root.getChildren().add(label);
        Scene scene = new Scene(root, 720, 480);
        primaryStage.setTitle("Übung");        
        primaryStage.setScene(scene);

        circle = new Circle(100, 100, 30);
        stackPane.getChildren().add(circle);
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //String x = fieldX.getText();
                //String y = fieldY.getText();
                Position position = setCirclePosition();
                double x = position.getX();
                double y = position.getY();
                
                circle.setCenterX(x);
                circle.setCenterY(y);
                //circle.setCenterX(Double.parseDouble(x));
                //circle.setCenterY(Double.parseDouble(y));
            }
        });
        
        primaryStage.show();    
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public Position setCirclePosition(){
        double xPos = 100;
        double yPos = 300;
        
        return new Position(xPos, yPos);
    }
    
    public class Position{
        private double x;
        private double y;

        public Position(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        
        
    }
    
}
