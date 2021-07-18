package smiley;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;


public class SmileyApplication extends Application{
    
    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        
        Canvas paintingCanvas = new Canvas(300, 300);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        layout.setCenter(paintingCanvas);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(50, 50, 50, 50);
        painter.fillRect(200, 50, 50, 50);
        painter.fillRect(0, 200, 50, 50);
        painter.fillRect(50, 250, 200, 50);
        painter.fillRect(250, 200, 50, 50);
        
        Scene view = new Scene(layout, 300, 300, Color.WHITE);
        window.setScene(view);
        window.show();                
    }    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
