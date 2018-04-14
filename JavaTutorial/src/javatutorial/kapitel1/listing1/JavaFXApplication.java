package javatutorial.kapitel1.listing1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextArea textArea = new TextArea();
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                textArea.setText("Hello World!");
            }
        });
        
        FlowPane root = new FlowPane(Orientation.VERTICAL);
        root.getChildren().add(btn);
        root.getChildren().add(textArea);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}