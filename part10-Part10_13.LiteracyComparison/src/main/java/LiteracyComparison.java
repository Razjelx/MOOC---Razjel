
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .forEach(line -> lines.add(line));
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
        lines.stream()
                .map(m -> m.split(","))
                .sorted((p1, p2) -> {
                    return Double.compare(Double.valueOf(p1[5]), Double.valueOf(p2[5]));
                }).forEach(m -> System.out.println(m[3] + " (" + m[4] + ")," + m[2].replace(" (%)", "") + ", " + m[5]));
            
            
        
    }
}
