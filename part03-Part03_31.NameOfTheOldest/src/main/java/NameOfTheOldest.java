
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        
            String[] parts = input.split(",");
            
            
            
            int number = Integer.valueOf(parts[1]);
            if (number > oldest) {
                name = parts[0];
                oldest = number;
            }
            
        
        }
        System.out.println(name);
    }
}
