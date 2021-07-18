
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(-6);
        numbers.add(-2);
        numbers.add(8);
        
        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positive = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        return positive;
    }
}
