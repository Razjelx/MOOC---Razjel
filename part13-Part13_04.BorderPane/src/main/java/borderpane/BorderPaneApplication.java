package borderpane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class BorderPaneApplication extends Application {
    
    @Override
    public void start(Stage window) {
        BorderPane componentGroup = new BorderPane();
        componentGroup.setBottom(new Label("SOUTH"));
        componentGroup.setTop(new Label("NORTH"));
        componentGroup.setLeft(new Label("WEST"));
        componentGroup.setRight(new Label("EAST"));
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
