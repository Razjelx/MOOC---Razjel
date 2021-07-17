
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNumbers = 0;
        int sumPositives = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                positiveNumbers = positiveNumbers + 1;
                sumPositives = sumPositives + number; 
                continue;
            } else if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (positiveNumbers < 0){
                System.out.println("Cannot calculate the average");
                break;
            }
        }
        if (positiveNumbers > 0) {
            
        
            double averagePositives = 1.0 * sumPositives / positiveNumbers;    
            System.out.println(averagePositives);
                
        }    
    }
}
