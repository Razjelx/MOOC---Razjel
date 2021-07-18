package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Slider;
import javafx.scene.chart.XYChart;

public class SavingsCalculatorApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        
        NumberAxis x = new NumberAxis(0, 30, 1);
        NumberAxis y = new NumberAxis();
        y.setLowerBound(0);
        
        LineChart<Integer, Double> chart = new LineChart(x, y);               
        layout.setCenter(chart);
        chart.setLegendVisible(false);
        
        Slider topSlider = new Slider(25, 250, 25);
        Slider bottomSlider = new Slider(0, 10, 10);
        
        topSlider.setShowTickLabels(true);
        topSlider.setShowTickMarks(true);
        
        bottomSlider.setShowTickLabels(true);
        bottomSlider.setShowTickMarks(true);
        
        Label topLeftLabel = new Label("Monthly savings");
        Label bottomLeftLabel = new Label("Yearly interest rate");
        Label topRightLabel = new Label(Double.toString(topSlider.getValue()));
        Label bottomRightLabel = new Label(Double.toString(bottomSlider.getValue()));

//Calculations - monthly savings and interest rate
        XYChart.Series<Integer, Double> monthlyData = new XYChart.Series<>();      
        for (int i = 0; i <= 30; i++) {
               Double sum = i * 12 * topSlider.getValue();
               monthlyData.getData().add(new XYChart.Data<>(i, sum));
        }
        XYChart.Series<Integer, Double> interestRateData = new XYChart.Series<>();
        Double interestRateSum = 12 * topSlider.getValue();
        Double interestRate = 0.0;
        interestRateData.getData().add(new XYChart.Data<>(0, interestRate));
        for(int i = 1; i <= 30; i++) {
            interestRate = (interestRate + interestRateSum) * (1.0 + bottomSlider.getValue() / 100);    
            interestRateData.getData().add(new XYChart.Data<>(i, interestRate));
        }
        chart.getData().addAll(monthlyData, interestRateData);
        
//Sliders listeners - updating the linechart
        topSlider.valueProperty().addListener((change, oldValue, newValue) -> {
           topRightLabel.setText(Double.toString(topSlider.getValue()));
           Double sum = 12 * topSlider.getValue();  
           Double interest = 0.0;
           for (int i = 0; i < monthlyData.getData().size(); i++) {
               monthlyData.getData().get(i).setYValue(i * 12 * topSlider.getValue());
           }
            for (int i = 0; i < interestRateData.getData().size(); i++) {
               interestRateData.getData().get(i).setYValue(interest);
               interest = (interest + sum) * (1.0 + bottomSlider.getValue() / 100);        
           }
        });
        
        bottomSlider.valueProperty().addListener((change, oldValue, newValue) -> {
           bottomRightLabel.setText(Double.toString(bottomSlider.getValue()));
           Double sum = 12 * topSlider.getValue();  
           Double interest = 0.0;
           for (int i = 0; i < interestRateData.getData().size(); i++) {
               interestRateData.getData().get(i).setYValue(interest);
               interest = (interest + sum) * (1.0 + bottomSlider.getValue() / 100);        
           }
           for (int i = 0; i < monthlyData.getData().size(); i++) {
               monthlyData.getData().get(i).setYValue(i * 12 * topSlider.getValue());
           }
        });
        
        BorderPane topSliderComponent = new BorderPane();
        BorderPane bottomSliderComponent = new BorderPane();
        
        topSliderComponent.setLeft(topLeftLabel);
        topSliderComponent.setCenter(topSlider);
        topSliderComponent.setRight(topRightLabel);
        
        bottomSliderComponent.setLeft(bottomLeftLabel);
        bottomSliderComponent.setCenter(bottomSlider);
        bottomSliderComponent.setRight(bottomRightLabel);
        
        VBox sliderComponents = new VBox();
        sliderComponents.getChildren().addAll(topSliderComponent, bottomSliderComponent);
        
        layout.setTop(sliderComponents);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
