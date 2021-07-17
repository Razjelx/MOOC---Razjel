
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueFalse = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueFalse);
        
    }
}
