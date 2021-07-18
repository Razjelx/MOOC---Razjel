package textstatistics;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().add(new Label("Letters: 0"));
        hBox.getChildren().add(new Label("Words: 0"));
        hBox.getChildren().add(new Label("The longest word is:"));
        
        TextArea textArea = new TextArea("");        
        
        layout.setBottom(hBox);
        layout.setCenter(textArea);
    
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
