
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> list = new ArrayList<>();
        Grades grade = new Grades();
        UserInterface user = new UserInterface(scanner, list, grade);
        user.start();
    }
}
