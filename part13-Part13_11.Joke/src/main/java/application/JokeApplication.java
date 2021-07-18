package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class JokeApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Button firstButton = new Button("Joke");
        Button secondButton = new Button("Answer");
        Button thirdButton = new Button("Explanation");
        
        HBox menu = new HBox();
        menu.getChildren().addAll(firstButton, secondButton, thirdButton);
        menu.setSpacing(10);
        
        BorderPane layout = new BorderPane();
        layout.setTop(menu);
        StackPane firstView = createView("What do you call a bear with no teeth?");
        StackPane secondView = createView("A gummy bear.");
        StackPane thirdView = createView("Gummy bears are popular gums, and gums are also in the mouth.");
        
        firstButton.setOnAction((event) -> layout.setCenter(firstView));
        secondButton.setOnAction((event) -> layout.setCenter(secondView));
        thirdButton.setOnAction((event) -> layout.setCenter(thirdView));
        
        layout.setCenter(firstView);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
    
    public StackPane createView(String text) {
        StackPane newView = new StackPane();
        newView.getChildren().add(new Label(text));
        newView.setAlignment(Pos.CENTER);
        newView.setPrefSize(300, 180);
        
        return newView;
    }
    
    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
