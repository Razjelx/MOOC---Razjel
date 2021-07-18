package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.Map;
import java.util.HashMap;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) {
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        String years = "1968	1972	1976	1980	1984	1988	1992	1996	2000	2004	2008";
        String[] year = years.split("\t");
        String kokSup = "16.1	18.1	20.9	22.9	23.0	22.9	19.1	21.6	20.8	21.8	23.4";
        String[] kok = kokSup.split("\t");
        String sdpSup = "23.9	27.1	24.8	25.5	24.7	25.2	27.1	24.5	23.0	24.1	21.2";
        String[] sdp = sdpSup.split("\t");
        String keskSup = "18.9	18.0	18.4	18.7	20.2	21.1	19.2	21.8	23.8	22.8	20.1";
        String[] kesk = keskSup.split("\t");
        String vihrSup = "2.8	2.3	6.9	6.3	7.7	7.4	8.9";
        String[] vihr = vihrSup.split("\t");
        String vasSup = "16.9	17.5	18.5	16.6	13.1	12.6	11.7	10.4	9.9	9.6	8.8";
        String[] vas = vasSup.split("\t");
        String psSup = "7.3	5.0	2.1	3.0	5.3	3.6	2.4	0.9	0.7	0.9	5.4";
        String[] ps = psSup.split("\t");
        String rkpSup = "5.6	5.2	4.7	4.7	5.1	5.3	5.0	5.4	5.1	5.2	4.7";
        String[] rkp = rkpSup.split("\t");
        
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        
        Map<Integer, Double> kokValue = new HashMap<>();
        for (int i = 0; i < year.length; i++) {       
            kokValue.put(Integer.valueOf(year[i]), Double.valueOf(kok[i]));
        }
        values.put("KOK", kokValue);
        
        Map<Integer, Double> sdpValue = new HashMap<>();
        for (int i = 0; i < year.length; i++) {       
            sdpValue.put(Integer.valueOf(year[i]), Double.valueOf(sdp[i]));
        }
        values.put("SDP", sdpValue);
        
        Map<Integer, Double> keskValue = new HashMap<>();
        for (int i = 0; i < year.length; i++) {       
            keskValue.put(Integer.valueOf(year[i]), Double.valueOf(kesk[i]));
        }
        values.put("KESK", keskValue);
        
        Map<Integer, Double> vihrValue = new HashMap<>();
        for (int i = 0; i < vihr.length; i++) {       
            vihrValue.put(Integer.valueOf(year[i+4]), Double.valueOf(vihr[i]));
        }
        values.put("VIHR", vihrValue);
        
        Map<Integer, Double> vasValue = new HashMap<>();
        for (int i = 0; i < year.length; i++) {       
            vasValue.put(Integer.valueOf(year[i]), Double.valueOf(vas[i]));
        }
        values.put("VAS", vasValue); 
        
        Map<Integer, Double> psValue = new HashMap<>();
        for (int i = 0; i < year.length; i++) {       
            psValue.put(Integer.valueOf(year[i]), Double.valueOf(ps[i]));
        }
        values.put("PS", psValue);
        
        Map<Integer, Double> rkpValue = new HashMap<>();
        for (int i = 0; i < year.length; i++) {       
            rkpValue.put(Integer.valueOf(year[i]), Double.valueOf(rkp[i]));
        }
        values.put("RKP", rkpValue);
        
        
        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series<>();
            data.setName(party);
            
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });          
            lineChart.getData().add(data);
        });
        
       Scene view = new Scene(lineChart, 640, 480);
       stage.setScene(view);
       stage.show();
    }
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
