package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label; 
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.application.Application.Parameters;
import java.util.Scanner;

public class GreeterApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Label nameField = new Label("Enter your name and start");
        TextField textField = new TextField(); 
        Button start = new Button("Start");
        
        GridPane firstView = new GridPane();
        firstView.add(nameField, 0, 0);
        firstView.add(textField, 0, 1);
        firstView.add(start, 0, 3);
        firstView.setAlignment(Pos.CENTER);
        firstView.setPrefSize(300, 180);
        firstView.setPadding(new Insets(20, 20, 20, 20));
        firstView.setVgap(10);
        firstView.setHgap(10);
        
        Scene first = new Scene(firstView);
        
        StackPane secondView = new StackPane();
        secondView.setPadding(new Insets(20, 20, 20, 20));
        secondView.setPrefSize(300, 180);
        secondView.setAlignment(Pos.CENTER);
        
        Scene second = new Scene(secondView);
        
        start.setOnAction((event) -> { 
            secondView.getChildren().add(new Label("Welcome " + textField.getText() + "!"));
            window.setScene(second);
        });
    
        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);   
    }
}
