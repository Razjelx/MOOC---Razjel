package textstatistics;
import java.util.Arrays;
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
        
        Label lettersCounter = new Label("Letters: ");
        Label wordsCounter = new Label("Words: ");
        Label longestWord = new Label("The longest word is:");
        
        hBox.getChildren().add(lettersCounter);
        hBox.getChildren().add(wordsCounter);
        hBox.getChildren().add(longestWord);
        
        TextArea textArea = new TextArea("");        
        textArea.textProperty().addListener((change, oldValue, newValue) -> { 
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            lettersCounter.setText("Letters: " + characters);
            wordsCounter.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
            
            
            
        });
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
