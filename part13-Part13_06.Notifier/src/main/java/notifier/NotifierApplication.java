package notifier;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        VBox layout = new VBox();
        
        Label label = new Label("");
        TextField textField = new TextField("");
        Button button = new Button("Update");
            button.setOnAction((event) -> {
                label.setText(textField.getText());
            });
        
        
        
        layout.getChildren().addAll(textField, button, label);
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
