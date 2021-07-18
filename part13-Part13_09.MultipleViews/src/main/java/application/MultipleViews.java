package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;


public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        BorderPane firstView = new BorderPane();
        VBox secondView = new VBox();
        GridPane thirdView = new GridPane();
        
        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");
        
        firstView.setTop(new Label("First view!"));
        firstView.setCenter(firstButton);                
        secondView.getChildren().add(secondButton);
        secondView.getChildren().add(new Label("Second View"));
        thirdView.add(new Label("Third view!"), 0, 0);
        thirdView.add(thirdButton, 1, 1);
        
        Scene first = new Scene(firstView);
        Scene second = new Scene(secondView);
        Scene third = new Scene(thirdView);
        
        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        
        secondButton.setOnAction((event) -> { 
            window.setScene(third);
        });
        
        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });
    
        window.setScene(first);
        window.show();
    }
    
    public static void main(String[] args) {
        Application.launch(MultipleViews.class);
    }

}
