
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")){
                break;
                        
            }
            
            String[] parts = string.split(",");
            for (int i = 0; i < parts.length; i++){
                int number = Integer.valueOf(parts[1]);
                
                if (number > oldest){
                    oldest = number;
                }
            }
            
        }
        System.out.println(oldest);
    }
}
