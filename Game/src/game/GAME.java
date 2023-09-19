package game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GAME extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
         Button btn = new Button();
        btn.setText("Play Game");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Game is starting...");
                
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("GAME");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
       
    public static void main(String[] args) {
        launch(args);
    }
    
}
