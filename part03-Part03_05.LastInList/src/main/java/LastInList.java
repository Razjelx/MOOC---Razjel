
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int index = 0;
        index = list.size()-1;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            list.add(input);
            index++;
                  
            
        }
        
        System.out.println(list.get(index));
        
        
    }
}
