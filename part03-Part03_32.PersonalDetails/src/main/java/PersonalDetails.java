
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int longest = 0;
        String name = "";
        int count = 0;
        double avg = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            int number = Integer.valueOf(parts[1]);
            sum += number;
            
            count++;
            int length = parts[0].length();
            System.out.println(length);
            if (length > longest) {
                
                longest = length;
                name = parts[0];
            }
            
            
        
        
        }
        avg = 1.0*sum/count; 
        System.out.println(sum);
        System.out.println(count);
        System.out.println(name);
        if (count > 0) {
            System.out.println(avg);
        } else {
            System.out.println("No input!");
        }
    }
}
